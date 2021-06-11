package seccion1

fun main(args: Array<String>) {

    var num1: Int = 5
    var num2: Int = 10
    var strngNumero: String = "190"

    var num3: Double = 25.3

    num1 = strngNumero.toInt()

    num2 = num3.toInt() // convirtiendo de int a double

    num3 = num1.toDouble()  // Convirtiendo de double a int

    println(num1)

}