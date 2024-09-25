package org.example


class Snake {
    private var direction = V2(0, 1)
    private var snake = listOf(V2(5, 1))

    fun head(): V2 = snake[0]

    fun tail(): List<V2> = snake.drop(1)

    fun move(appleEaten: Boolean) {
        snake = computeNewSnakePositions(snake, direction, appleEaten)
    }

    fun tailBitten(): Boolean = tail().contains(head())

    fun size(): Int = snake.size

    fun contains(v: V2): Boolean = snake.contains(v)

    fun setDirection(newDirection: V2?) {
        direction = computeNewDirection(direction, newDirection)
    }

    fun toList(): List<V2> = snake

}

data class SnakeModel(val rows: Int, val cols: Int) {
    private val snake: Snake = Snake()
    private var appleEatenLastRound = false
    private var appleCoordinates: V2 = V2(4, 4)

    private fun headIsOnBoard(): Boolean = isOnBoard(snake.head(), rows, cols)

    private fun tailBitten(): Boolean = snake.tailBitten()

    fun gameIsWon(): Boolean = snake.size() == rows * cols

    fun gameLost(): Boolean = tailBitten() || !headIsOnBoard()

    private fun placeNewApple() {
        appleCoordinates = generateRandomNotBlockedCoordinates(snake.toList(), rows, cols)
    }

    private fun appleEatenThisRound(): Boolean = snake.head() == appleCoordinates

    fun playRound() {
        snake.move(appleEatenLastRound)
        appleEatenLastRound = appleEatenThisRound()
        if (appleEatenLastRound) {
            placeNewApple()
        }
    }

    override fun toString(): String {
        return showGame(snake.head(), snake.tail(), appleCoordinates, rows, cols)
    }

    fun setSnakeDirection(direction: V2?) {
        snake.setDirection(direction)
    }
}