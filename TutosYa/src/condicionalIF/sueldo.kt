package condicionalIF

/**
 * Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla
 * indicando que debe abonar impuestos.
 */

fun main(args: Array<String>) {
    println("Por Favor ingresar su sueldo")
    val sueldo = readLine()!!.toInt()

    if (sueldo > 3000) {
        println("Debe abaonar sus impuestos")
    } else {
        println("Felicidades esta libre de impuestos")
    }

}