package condicionalIF.condicionalesAnidadas

// Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.

fun main(args: Array<String>) {

    println("Ingrese primer número:")
    val num1 = readLine()!!.toInt()

    println("Ingrese segunda número:")
    val num2 = readLine()!!.toInt()

    println("Ingrese tercer número:")
    val num3 = readLine()!!.toInt()


    if (num1 > num2)
            println("$num1 es mayor")
        else if (num2 > num3)
            println("$num2 es mayor")
        else
            println("$num3 es mayor")


}