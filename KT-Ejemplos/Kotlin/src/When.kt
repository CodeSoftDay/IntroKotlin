fun main(args: Array<String>) {

    mostrarDia()

}

fun mostrarDia () {
    println("Dime el número del dia ")
    val dia = readLine()!!.toInt()

    when (dia) {

        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Fin de semana")
        else -> println("Este dia no existe")


    }
}