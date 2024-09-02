

fun evenOrOdd(number: Int):String = if (number % 2 == 0)  "Even" else "Odd"

fun simpleMultiplication(number: Int) : Int = if (number % 2 == 0)  8 * number else 9 * number
//

fun multiple(x:Int) = when {
    x % 15 == 0 -> "BangBoom"
    x % 5 == 0->"Boom"
    x % 3 == 0->"Bang"
    else -> "Miss"
}
//return "Boom" else: return "Miss"

fun boolToWord(boolean: Boolean): String = if (boolean) "Yes" else "No"

fun bonusTime(salary: Int, bonus: Boolean): String = "$" + (if (bonus) +10 * salary
else +salary).toString()

fun hoopCount(n: Int): String = if (n < 10) "Keep at it until you get it"
else "Great, now move on to tricks"

fun rps(p1: String, p2: String): String = when {
    p1 == p2 -> "Draw!"
    (p1 == "rock") && (p2 == "scissors") || p1 == "paper" && p2 == "rock" || p1 ==
            "scissors" && p2 == "paper" -> "Player 1 won!"

    else -> "Player 2 won!"
}


fun paperwork(n: Int, m: Int): Int = if (n < 0 || m < 0) 0 else n * m


fun getGrade(s1: Int, s2: Int, s3: Int): String {
    val avgGrade = (s1 + s2 + s3) / 3
    return (when {
        avgGrade >= 90 -> "A"
        avgGrade >= 80 -> "B"
        avgGrade >= 70 -> "C"
        avgGrade >= 60 -> "D"
        else -> "E"
    })

}

fun century(number: Int): Int =  (number / 100) + if (number % 100 == 0) 0 else 1