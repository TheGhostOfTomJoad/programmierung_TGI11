package org.example

fun setAlarm(employed: Boolean, vacation: Boolean) : Boolean = employed && ! vacation

fun xor(a: Boolean, b: Boolean) : Boolean = (a && ! b) || (! a && b)

fun xor2(a: Boolean, b: Boolean) : Boolean = a != b


fun hero(bulletsAvailable: Int, dragons: Int) : Boolean = bulletsAvailable >= 2 * dragons

fun hero2(bulletsAvailable: Int, dragons: Int) : Boolean {
    val bulletsNeeded = 2 * dragons
    return bulletsNeeded >= bulletsAvailable
}

fun isTriangle(a: Int, b: Int, c: Int) = a < b + c && b < a + c && c < a + b

fun zeroFuel(distanceToPump: Int, mpg: Int, fuelLeft: Int): Boolean = mpg * fuelLeft >= distanceToPump

fun zeroFuel2(distanceToPump: Int, mpg: Int, fuelLeft: Int): Boolean {
    val distancePossible = mpg * fuelLeft
    return distancePossible >= distanceToPump
}


fun checkForFactor(base: Int, factor: Int) = base % factor == 0

fun loveFun(flowerA: Int, flowerB: Int): Boolean = flowerA % 2 != flowerB % 2


fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
}