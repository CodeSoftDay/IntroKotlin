package condicionalIF.condicionalesAnidadas

/*
    Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número
    es positivo, nulo o negativo.
*/

fun main (args: Array<String>) {

    println("Ingrese el número")
    val num = readLine()!!.toInt()

    if (num < 0) {
        println("El número es negativo")
    } else {
        println("Número positivo")
    }


}