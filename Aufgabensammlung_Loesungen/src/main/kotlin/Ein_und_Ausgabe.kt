package org.example



fun greet(name: String): String = "Hello, " + name + " how are you doing today?"

fun square(n: Int): Int = n * n

fun otherAngle(a:Int, b:Int): Int = 180 - a - b


fun greetIO(): Unit{
    println("Hello, what is your name?")
    val name = readln()
    println(greet(name))
}

fun squareIO(): Unit{
    println("Please input an integer!")
    val number = readln()
    println("The square of " + number + " is " + square(number.toInt()).toString())
}

fun squareIO2(): Unit{
    println("Please input an integer!")
    val number = readln()
    val numberAsInt = number.toInt()
    val squareNumber = square(numberAsInt)
    val squareNumberAsString = squareNumber.toString()
    println("The square of " + number + " is " + squareNumberAsString)
}

fun otherAngleIO(): Unit {
    println("Please input the size of alpha in degrees! Only whole numbers are allowed!")
    val firstAngle = readln().toInt()
    println("Please input the size of beta in degrees as an integer! Only whole numbers are allowed!")
    val secondAngle = readln().toInt()
    println("The size of gamma is " + otherAngle(firstAngle, secondAngle).toString())
}

fun main() {
    otherAngleIO()
}

