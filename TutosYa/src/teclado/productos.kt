package teclado

/**
 *Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la
 * cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.
 */

fun main(args :Array<String>) {

    println("Ingrese el precio del producto")
    val precio = readLine()!!.toInt()

    println("Ingrese la cantidad a llevar");
    val cantidad = readLine()!!.toInt()

    val pagar = precio * cantidad

    println("Lo que debe es: $pagar")
}