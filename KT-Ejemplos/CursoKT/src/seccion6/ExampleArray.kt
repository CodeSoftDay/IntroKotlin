package seccion6

fun main(args: Array<String>) {

    val arrayUno = Array<Int>(5) {5}
    arrayUno[1] = 5
    arrayUno[2] = 15
    arrayUno[3] = 50
    arrayUno[4] = 500

    for (num in arrayUno)
        println(num)

    println("Indices")
    for (indice in arrayUno.indices)
        println(indice)

    val city = Array<String>(2) {""}

    for (indice in 0..1) {
        println("Ingresa la ciudad del indice [$indice]")
        city[indice] = readLine()!!
    }

    for (indice in 0..1 ) {
        println("La ciudad en el indice [$indice] es: " + city[indice])
    }
}