package seccion5.ejercicios

/**
 *  Crear un programa que muestre los múltiplos de ocho hasta el valor 400
 */
fun main(args: Array<String>) {
    val nums = 1..400

    for (elemento in nums step 8 ) {
        println( elemento ) // Muestra los números de 2 en 2
    }
}