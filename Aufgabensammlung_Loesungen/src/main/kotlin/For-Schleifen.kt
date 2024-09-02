fun printSquares0_10(): Unit {
    for (i in 0..10) {
        println(i * i)
    }
}

fun printSquares(n: Int) {
    for (i in 0..n - 1) {
        println(i * i)
    }
}


fun printSquaresNicer(n: Int) {
    println("The first " + n.toString() + " squares are:")
    for (i in 0..n - 1) {
        println(i * i)
    }
    println("Goodbye")
}


fun printSquaresStartEnd(lower: Int, upper: Int): Unit {
    println("The square of the numbers from " + lower.toString() + " up to " + upper.toString() + " are:")
    for (i in lower..upper) {
        println(i * i)
    }
    println("Goodbye")
}

fun printSquaresStartEndPretty(lower: Int, upper: Int): Unit {
    println("The square of the numbers from " + lower.toString() + " up to " + upper.toString() + " are:")
    for (i in lower..upper) {
        println(i.toString() + " * " + i.toString() + " = " + (i * i).toString())
    }
    println("Goodbye")
}

fun summation(n: Int): Int {
    var acc = 0
    for (i in 1..n) {
        acc = acc + i
    }
    return acc
}

fun factorial(n: Int): Int {
    var acc = 1
    for (i in 1..n) {
        acc = acc * i
    }
    return acc
}

fun numberToPwr(number: Int, p: Int): Int {
    var acc = 1
    for (i in 1..p) {
        acc = acc * number
    }
    return acc
}

fun countSheep(n: Int): String {
    var acc = ""
    for (i in 1..n) {
        acc = acc + i + " sheep..."
    }
    return acc
}

fun sumCubes(n: Int): Int {
    var acc = 0
    for (i in 1..n) {
        acc = acc + i * i * i
    }
    return acc
}

fun min(x: Int, y: Int): Int = if (x > y) y else x
fun max(x: Int, y: Int): Int = if (x > y) x else y


fun getSum(a: Int, b: Int): Int {
    val upper = max(a, b)
    val lower = min(a, b)
    var acc = 0
    for (i in lower..upper) {
        acc = acc + i
    }
    return acc
}

fun choose(n: Int, k: Int): Int = if (k > n) 0 else factorial(n) / (factorial(n - k) * factorial(k))

fun solution(number: Int): Int {
    var acc = 0
    for (i in 1..number - 1) {
        if (i % 3 == 0 || i % 5 == 0) {
            acc = acc + i
        }
    }
    return acc
}

fun divisors(n: Int): Int {
    var acc = 0
    for (i in 1..n) if (n % i == 0) {
        acc = acc + 1
    }
    return acc
}

fun isPrime(n: Int): Boolean = divisors(n) == 2

fun sumDivisors(n: Int): Int {
    var acc = 0
    for (i in 1..n - 1) if (n % i == 0) {
        acc = acc + i
    }
    return acc
}

fun isPerfect(n: Int): Boolean = sumDivisors(n) == 0

fun amicableNumbers(n1: Int, n2: Int): Boolean = n1 != n2 && sumDivisors(n1) == n2 && sumDivisors(n2) == n1

fun abundantNumber(n: Int): Boolean = sumDivisors(n) > n

fun nthFib(n: Int): Int {
    var a = 0
    var b = 1
    for (i in 1..n) {
        val temp = b
        b = a + b
        a = b
    }
    return a
}