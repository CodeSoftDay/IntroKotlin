package teclado.ejercicios

/**
 * Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar su suma y promedio.
 */

fun main(args :Array<String>) {

    println( "Ingrese el primer númer1" )
    val num1 = readLine()!!.toInt()
    println( "Ingrese el segundo número2" )
    val num2 = readLine()!!.toInt()
    println( "Ingrese el tercero número3" )
    val num3 = readLine()!!.toInt()
    println( "Ingrese el cuarto número4" )
    val num4 = readLine()!!.toInt()

    val suma = num1 + num2 + num3 + num4

    println("La suma de los cuatro valores es $suma")

    val promedio = suma / 4

    println("Le promedio de los números es $promedio")

}