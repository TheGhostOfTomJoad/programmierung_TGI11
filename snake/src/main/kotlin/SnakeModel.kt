package org.example


class Snake(
    private val direction: V2 = V2(0, 1),
    val snakePositions: List<V2> = listOf(V2(5, 1)))
{
    fun head(): V2 = snakePositions[0]

    fun tail(): List<V2> = snakePositions.drop(1)

    fun move(appleEaten: Boolean): Snake {
        return Snake(direction, computeNewSnakePositions(snakePositions, direction, appleEaten))
    }

    fun tailBitten(): Boolean = tail().contains(head())

    fun size(): Int = snakePositions.size

    fun contains(v: V2): Boolean = snakePositions.contains(v)

    fun setDirection(newDirection: V2?): Snake {
        return Snake(computeNewDirection(direction, newDirection), snakePositions)
    }


}

data class SnakeModel(val rows: Int, val cols: Int) {
    private var snake: Snake = Snake()
    private var appleEatenLastRound = false
    private var appleCoordinates: V2 = V2(4, 4)

    private fun headIsOnBoard(): Boolean = isOnBoard(snake.head(), rows, cols)

    private fun tailBitten(): Boolean = snake.tailBitten()

    fun gameIsWon(): Boolean = snake.size() == rows * cols

    fun gameLost(): Boolean = tailBitten() || !headIsOnBoard()

    private fun placeNewApple() {
        appleCoordinates = generateRandomNotBlockedCoordinates(snake.snakePositions, rows, cols)
    }

    private fun appleEatenThisRound(): Boolean = snake.head() == appleCoordinates

    fun playRound() {
        snake = snake.move(appleEatenLastRound)
        appleEatenLastRound = appleEatenThisRound()
        if (appleEatenLastRound) {
            placeNewApple()
        }
    }

    override fun toString(): String {
        return showGame(snake.head(), snake.tail(), appleCoordinates, rows, cols)
    }

    fun setSnakeDirection(direction: V2?) {
        snake =  snake.setDirection(direction)
    }
}