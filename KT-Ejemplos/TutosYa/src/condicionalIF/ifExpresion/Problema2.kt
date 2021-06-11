package condicionalIF.ifExpresion

/**
 * Ingresar por teclado un valor entero. Almacenar en otra variable el cuadrado de dicho
 * número si el valor ingresado es par, en caso que sea impar guardar el cubo.
 * Mostrar además un mensaje que indique si se calcula el cuadrado o el cubo.
 */

fun main(args: Array<String>) {

    println("Ingrese un valor entero:")
    val valor = readLine()!!.toInt()

    val resultado = if (valor % 2 == 0) {
        println("Cuadrado:")
        valor * valor
    } else {
        println("Cubo:")
        valor * valor * valor
    }

    println(resultado)

}

