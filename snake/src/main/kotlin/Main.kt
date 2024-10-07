package org.example

import jlineUI.JlineUI


fun main() {
    val snakeController = SnakeController()
    snakeController.playGame()
//    val snakeUI = SnakeUI()
//    snakeUI.println("hello world!")
//    snakeUI.println("hello mars!")
//    snakeUI.println("hello mars!")
//    snakeUI.println("hello mars!")


}


class SnakeController {
    private val snakeUI = SnakeUI()
    private val snakeModel = SnakeModel(20, 20)
    fun playGame() {
        snakeUI.println(snakeModel.toString())
        while (!snakeModel.gameIsWon() && !snakeModel.gameLost()) {

            val input = snakeUI.getPressedKey()
            val newDirection = pressedKeyToV2(input)
            snakeModel.setSnakeDirection(newDirection)
            snakeModel.playRound()
            snakeUI.println(snakeModel.toString())

        }
        //snakeUI.showEndScreen(gameIsLost,snakeModel.snakeLen())
        snakeUI.close()
    }


}