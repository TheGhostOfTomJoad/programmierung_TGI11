



fun twitter():Unit{
    println("Do you really want to tweet this?")
    val answer = readln()
    if (answer == "Yes")
    {
        println("This is a very silly tweet. Do you really want to tweet this?")
        val secondAnswer = readln()
        if (secondAnswer == "Yes")
        {
            println("Okay, that is a very stupid decision but I will do it!")
        }
        else{
            println("Im happy that you changed your mind!")}
    }
    else{
        println("Good decision!")
    }
}

fun main(){twitter()}