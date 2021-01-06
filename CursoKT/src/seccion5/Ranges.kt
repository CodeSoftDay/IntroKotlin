package seccion5

fun main(args: Array<String>) {
    val nums = 1..5
    for (elemento in nums) {
        println( elemento )
    }
    println("=====================================")
    for (elemento in nums step 2) {
        println( elemento ) // Muestra los números de 2 en 2
    }

    println("=====================================")
    for (elemento in nums.reversed()) {
        println( elemento )   // Muestra los número de reversa (12345 - 54321)
    }

    println("=====================================")
    val nums2 = 15 downTo 1
    for (elemento in nums2) {
        println(elemento) //
    }

    println("=====================================")
    for (elementos in 1 until 16) {
        println(elementos) //   de 1 hasta el 15 (HASTA)
    }

    println("=====================================")
    val num = 1 until 15
    for (elemento in num) {
        println("El conteo es de ${num.count()} elementos")
    }

    println("=====================================")
    var cahrs = 'A'..'Z'
    for (elementos in cahrs)
        println(elementos)

}