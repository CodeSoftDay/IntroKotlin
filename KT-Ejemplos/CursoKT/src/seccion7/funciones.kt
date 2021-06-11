package seccion7

fun main (args: Array<String>) {
    print(suma())
}


fun suma():Int {

    println("Primer Número")
    val num1 = readLine()!!.toInt()
    println("Segundo Número")
    val num2 = readLine()!!.toInt()

    val  suma = num1.plus(num2)

    return suma

}