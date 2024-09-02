fun powerOfTwo(x: Int): Boolean {
    var i = 1
    while (i < x) {
        i = i * 2
    }
    return i == x
}

fun halvingSum(n: Int): Int {
    var acc = 0
    var summand = n
    while (summand >= 1) {
        acc = acc + n
        summand = summand / 2
    }
    return acc
}


//fun nb_year(p0, percent, aug, p): percent = 1 + percent / 100 years = 0
//while p0 < p: p0 = int(p0* percent) + aug years = years + 1 return
//years

fun isSquare(n: Int): Boolean {
    var i = 0
    while (i * i < n) {
        i = i + 1
    }
    return i * i == n
}

fun nextCollatz(n: Int): Int = if (n % 2 == 0) n / 2 else 3 * n + 1

fun hotpo(n: Int): Int {
    var collatzNumber = n
    var counter = 0
    while (collatzNumber != 1) {
        collatzNumber = nextCollatz(n)
        counter = counter + 1
    }
    return counter
}

fun collatz(n: Int): String {
    var collatzNumber = n
    var acc = n.toString()
    while (n != 1)
        collatzNumber = nextCollatz(n)
    acc = acc + "->" + collatzNumber.toString()
    return acc
}