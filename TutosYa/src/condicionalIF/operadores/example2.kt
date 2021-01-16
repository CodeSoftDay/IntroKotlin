package condicionalIF.operadores

/*
    Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un
    mensaje indicando si el número tiene uno o dos dígitos.(Tener en cuenta que condición
    debe cumplirse para tener dos dígitos, un número entero)
*/

fun main(args: Array<String>) {

    println("Ingrese el número")
    val num = readLine()!!.toInt()

    if ( num >= 10) {
        println("Tiene dos dijitos")
    } else {
        println("El número es un dijito")
    }

}