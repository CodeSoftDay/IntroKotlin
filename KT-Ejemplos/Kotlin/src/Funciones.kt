fun main(args: Array<String>) {

    persona("Manuel", "Duarte")

    miembro()

    println(doble(10))

    // Funciones genericas
    genericas("Hola")
    genericas(12)
    genericas(true)
    genericas(1.235)

}

/**
 * Las funciones tienen que regresar un valor, si no son un metodo
 */

// Funcion con parametro
fun persona(name: String, lastName: String) {
    println("Mi nombre es $name $lastName")
}


/**
 * Funciones miembro
 */

fun miembro() {
    val x = "hola mundo"
    println(x.capitalize())
}

/**
 * Funciones de exprecion simple
 */

fun doble(num: Int) = num * 2

/**
 * Funciones Genericas
 */

fun<T> genericas (num: T) {
    println(num)
}