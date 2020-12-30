package teclado

/**
 * Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.
 */

fun main(args :Array<String>) {

    println("Ingrese el primer número")
    val numero1 = readLine()!!.toInt()

    println("Ingrese el segundo número")
    val numero2 = readLine()!!.toInt()

    val suma = numero1 + numero2
    println("La suma de $numero1 + $numero2 es = $suma")

    val multi = numero1 * numero2
    println("El producto del $numero1 * $numero2 es = $multi")

}