/**
 * Problema
 *
 * Crear un programa que defina dos variables inmutables de tipo Int. Luego definir una tercer variable mutable que
 * almacene la suma de las dos primeras variables y las muestre. Seguidamente almacenar en la variable el producto
 * de las dos primeras variables y mostrar el resultado.
 *
 * Realizar los mismos pasos vistos anteriormente para crear un proyecto y crear el archivo variables.kt
 * donde codificar el programa respectivo (Si tenemos abierto el IntelliJ IDEA podemos crear un nuevo proyecto
 * desde el menú de opciones: New -> Project)
 */

fun main(args: Array<String>)  {

    println("Enter the first number")
    val firstNumber: Int = readLine()!!.toInt()

    println("Enter the second number")
    val secondNumber: Int = readLine()!!.toInt()

    val sum = firstNumber.plus(secondNumber);

    println("The sum of the two numbers is: $sum ")

}