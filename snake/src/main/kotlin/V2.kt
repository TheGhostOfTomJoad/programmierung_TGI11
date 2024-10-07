package org.example

import kotlin.random.Random

data class V2(val x: Int, val y: Int) {

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


/// Utils

fun pressedKeyToV2(pressedKey: String?): V2? {
    return when (pressedKey) {
        "w" -> V2(0, -1)
        "d" -> V2(1, 0)
        "s" -> V2(0, 1)
        "a" -> V2(-1, 0)
        else -> null

    }
}


fun computeNewDirection(currentDirection: V2, newDirection: V2?): V2 =
    if (newDirection != null && newDirection.orthogonal(currentDirection)) newDirection else currentDirection


fun computeNewSnakePositions(currentSnakePositions: List<V2>, direction: V2, appleEaten: Boolean): List<V2> {
    val newSnakeHead = currentSnakePositions[0] + direction
    val newSnake = listOf(newSnakeHead) + currentSnakePositions
    return if (!appleEaten) newSnake.dropLast(1) else newSnake
}

fun isOnBoard(v: V2, rows: Int, cols: Int): Boolean = v.x <= cols - 1 && v.x >= 0 && v.y < rows - 1 && v.y >= 0


fun generateRandomNotBlockedCoordinates(blockedCoordinates: List<V2>, rows: Int, cols: Int): V2 {
    while (true) {
        val newAppleX = Random.nextInt(0, cols - 1)
        val newAppleY = Random.nextInt(0, rows - 1)
        val newAppleCoordinates = V2(newAppleX, newAppleY)
        if (!blockedCoordinates.contains(newAppleCoordinates)) {
            return newAppleCoordinates
        }
    }
}

//fun showGame(snakeHead: V2, snakeTail: List<V2>, appleCoordinates: V2, rows: Int, cols: Int): String {
//    var acc = ""
//    for (i in -1..rows) {
//        for (j in -1..cols) {
//            val v = V2(j, i)
//            val c: Char = when {
//                snakeHead == v -> '@'
//                snakeTail.contains(v) -> 'o'
//                v == appleCoordinates -> '$'
//                i == -1 || i == rows || j == cols || j == -1 -> 'x'
//                else -> {
//                    ' '
//                }
//            }
//            acc += c
//        }
//        acc += '\n'
//    }
//    return acc + "\n" + "Points: " + snakeTail.size
//}

fun showGame(snakeHead: V2, snakeTail: List<V2>, appleCoordinates: V2, rows: Int, cols: Int): String {
    var acc = ""
    for (i in -1..rows) {
        for (j in -1..cols) {
            val v = V2(j, i)
            val c = when {
                snakeHead == v -> '█'
                snakeTail.contains(v) -> '█'
                v == appleCoordinates -> '♥'
                i == -1 || i == rows || j == cols || j == -1 -> '⧚'
                else -> {
                    ' '
                }
            }
            acc += c
        }
        acc += '\n'
    }
    return acc + "\n" + "Points: " + snakeTail.size
}