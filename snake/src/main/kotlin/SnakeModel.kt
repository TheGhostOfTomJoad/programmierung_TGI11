package org.example

import kotlin.random.Random




data class V2 (val x: Int, val y: Int){

    operator fun plus(other: V2): V2 {
        return V2(x + other.x, y + other.y)
    }
    operator fun times(other: V2): Int {
        return x * other.x + y * other.y
    }

    fun orthogonal(other: V2): Boolean {
        return this * other == 0
    }

}



enum class Direction {
    North, East, South, West;

    fun toV2(): V2 {
        return when (this) {
            North -> V2(0, -1)
            East -> V2(1, 0)
            South -> V2(0, 1)
            West -> V2(-1, 0)
        }
    }

    fun orthogonal(other: Direction): Boolean {
        return this.toV2().orthogonal(other.toV2())
    }

    companion object {
        fun fromString(s: String): Direction? {
            return when (s) {
                "ArrowUp" -> North
                "ArrowDown" -> South
                "ArrowLeft" -> West
                "ArrowRight" -> East
                else -> {
                    null
                }
            }
        }
    }


}



class Snake {
    private var direction = Direction.South
    private var snake  = listOf<V2>(V2(5, 1))


    fun getHead(): V2 {
        return snake[0]
    }

    fun getTail(): List<V2> {
        return snake.takeLast(snake.size - 1)
    }

    fun move(appleEaten: Boolean) {
        snake = newSnake(snake,direction,appleEaten)
    }

    private fun newSnake(currentSnake: List<V2>, direction: Direction, appleEaten: Boolean): List<V2> {
        var newSnake = listOf(currentSnake[0] +direction.toV2()) + currentSnake
        if (!appleEaten) {
            newSnake = newSnake.take(newSnake.size - 1)
        }
        return newSnake
    }

    fun tailBitten(): Boolean {
        return getTail().contains(getHead())
    }

    fun snakeLen(): Int {
        return snake.size
    }

    fun contains(v: V2): Boolean {
        return snake.contains(v)
    }

    private fun newDirection(currentDirection: Direction, newDirection: Direction?): Direction {
        return  if (newDirection !=null &&  newDirection.orthogonal(currentDirection)) newDirection else currentDirection

    }

    fun setDirection(newDirection: Direction) {
            direction = newDirection(direction , newDirection)


    }



}

data class SnakeModel(val rows: Int, val cols: Int) {
    private val snake: Snake = Snake()
    private var points = 0
    private var appleEatenLastRound = false
    private var appleCoordinates: V2 = V2(4, 4)

    private fun headIsOnBoard(): Boolean {
        val snakeHeadX = snake.getHead().x
        val snakeHeadY = snake.getHead().y
        return snakeHeadX <= cols - 1 && snakeHeadX >= 0 && snakeHeadY < cols - 1 && snakeHeadY >= 0
    }

    private fun tailBitten(): Boolean {
        return snake.tailBitten()
    }

    fun gameIsWon(): Boolean {
        return snake.snakeLen() == rows * cols
    }

    fun gameLost(): Boolean {
        return tailBitten() || !headIsOnBoard()
    }

    private fun setNewApple() {
        var appleSet = false
        while (!appleSet) {
            val newAppleX = Random.nextInt(0, cols - 1)
            val newAppleY = Random.nextInt(0, rows - 1)
            val newAppleCoordinates = V2(newAppleX, newAppleY)
            if (!snake.contains(newAppleCoordinates)) {
                appleCoordinates = newAppleCoordinates
                appleSet = true
            }
        }
    }

    private fun appleEatenThisRound(): Boolean {
        return snake.getHead() == appleCoordinates
    }

    fun playRound() {
        snake.move(appleEatenLastRound)
        appleEatenLastRound = false
        if (appleEatenThisRound()) {
            appleEatenLastRound = true
            points += 1
            setNewApple()
        }
    }


    override fun toString(): String {
        var acc = ""
        for (i in -1..rows) {
            for (j in -1..cols) {
                val v = V2(j, i)
                val c: Char = when {
                    snake.getHead() == v -> '@'
                    snake.getTail().contains(v) -> 'o'
                    v == appleCoordinates -> '$'
                    i == -1 || i == rows || j == cols || j == -1 -> 'x'
                    else -> {
                        ' '
                    }
                }
                acc += c
            }
            acc += '\n'
        }
        return acc
    }

    fun setSnakeDirection(direction: Direction) {
        snake.setDirection(direction)
    }



    fun snakeLen(): Int {
        return snake.snakeLen()
    }

}