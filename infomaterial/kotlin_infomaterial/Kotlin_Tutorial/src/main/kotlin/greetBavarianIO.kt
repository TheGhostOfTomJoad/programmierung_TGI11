fun main(){
    greetBavarianIO()
}

fun greetBavarian(name: String): String {
    return "Servus " + name
}

fun greetBavarianIO(): Unit{
    println("Wie heißt du?")
    val name = readln()
    println(greetBavarian(name))
}