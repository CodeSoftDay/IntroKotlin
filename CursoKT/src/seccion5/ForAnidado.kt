package seccion5

fun main(args: Array<String>) {

    for (elemento in 0..5) {
        println("Elemento es: $elemento")

        for (elemento2 in 1..10) {
            println("Elemento2 es : $elemento2")
        }
        println("For anidado concluido");
    }

    println("El ciclo for ha terminado")

}