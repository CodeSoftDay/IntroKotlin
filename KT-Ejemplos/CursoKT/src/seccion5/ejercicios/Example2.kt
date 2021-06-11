package seccion5.ejercicios

fun main(args: Array<String>) {

    val numeros = 1..5
    for (numeros in numeros) {

        println("Ingrese le primer número")
        var num1 = readLine()?.toInt()

        if (numeros %2 == 0){
            println("El numero $num1 es par")
        } else {
            println("El número $num1 es impar")
        }
    }

}
