package teclado

/**
 * Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo
 * (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)
 */

fun main(args :Array<String>) {
    println("Ingrese la medida del lado del cuadrado")
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4

    println("El perimetro del cuadrado es $perimetro")

}