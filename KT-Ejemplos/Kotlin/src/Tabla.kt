import kotlin.text.*

fun main(args: Array<String>) {

    print("Dime un número: ")
    val n = readLine()!!.toInt()
    for (i in 0..10) {
        println("$n x $i = ${n * i}")
    }

}