



fun twitter():Unit{
    println("Do you really want to tweet this?")
    val answer = readln()
    if (answer == "Yes")
    {
        println("This is a very silly tweet. Do you really want to tweet this?")
        val answer = readln()
        if (answer == "Yes")
        {
            println("Okay, that is a very stupid decision!")
        }
    }
    else{
        println("Good decision!")
    }
}