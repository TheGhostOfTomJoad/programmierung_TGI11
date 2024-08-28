import java.util.*


fun main() {
    for (i in 0..2) {
        println(i)
    }
}


fun maps(x: IntArray): IntArray {
    var result: List<Int> = listOf()
    for (i in x) {
        result = result + listOf(2 * i)
    }
    return result.toIntArray()
}


fun points(games: List<String>): Int {
    var acc = 0
    for (game in games) {
        acc = acc + when {
            game[0] > game[2] -> 3
            game[0] == game[1] -> 1
            else -> 0
        }
    }
    return acc
}