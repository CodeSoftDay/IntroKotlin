package condicionalIF

/**
 * Realizar un programa que solicite ingresar dos números enteros distintos y muestre por
 * pantalla el mayor de ellos (suponemos que el operador del programa ingresa valores
 * distintos, no valida nuestro programa dicha situación)
 */

fun main(args: Array<String>) {

    println("Ingrese el primer número")
    val num1 = readLine()!!.toInt()

    println("Ingrese el segundo número")
    val num2 = readLine()!!.toInt()

    if (num1 > num2) {
        println("El $num1 es mayor que $num2")
    }

}