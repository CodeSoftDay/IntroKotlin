package variables.ejercicios

fun main(args :Array<String>) {

    println("Ingrese la primera nota")
    val nota1 = readLine()!!.toFloat()

    println("Ingrese la primera nota")
    val nota2 = readLine()!!.toFloat()

    println("Ingrese la primera nota")
    val nota3 = readLine()!!.toFloat()

    val sumaPromedio = nota1 + nota2 + nota3
    val promedio = sumaPromedio / 3

    println("La suma de los promedios es: $sumaPromedio")
    println("El promedio es: $promedio")
}