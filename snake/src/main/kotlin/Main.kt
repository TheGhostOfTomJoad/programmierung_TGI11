package org.example

fun main() {
    val snakeController = SnakeController()
    snakeController.playGame()

}


class SnakeController {
    private val snakeUI = SnakeUI()
    private val snakeModel = SnakeModel(20, 20)
    fun playGame() {
        snakeUI.println(snakeModel.toString())
        while (!snakeModel.gameIsWon() && !snakeModel.gameLost()) {

            val input = snakeUI.getPressedKey()
            val newDirection = input?.let { Direction.fromString(it) }
            if (newDirection != null) {
                snakeModel.setSnakeDirection(newDirection)
            }

            snakeModel.playRound()
            snakeUI.println(snakeModel.toString())

        }
        //snakeUI.showEndScreen(gameIsLost,snakeModel.snakeLen())
        snakeUI.close()
    }
}