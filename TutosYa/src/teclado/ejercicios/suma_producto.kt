package teclado.ejercicios

/**
 * Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar la
 * suma de los dos primeros y el producto del tercero y el cuarto.
 */

fun main(args :Array<String>) {

    println( "Ingrese el primer número1" )
    val numero1 = readLine()!!.toInt()

    println( "Ingrese el segundo número2" )
    val numero2 = readLine()!!.toInt()

    println( "Ingrese el tercer número3" )
    val numero3 = readLine()!!.toInt()

    println("Ingrese el cuarto número4")
    val numero4 = readLine()!!.toInt()

    val suma = numero1 + numero2
    println( "Suma de los números $numero1 + $numero2 es = $suma" )

    val producto = numero3 * numero4
    println( "El producto de los números $numero3 * $numero4 es = $producto" )

}