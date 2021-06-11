
fun main(args: Array<String>) {

    val persona = Persona("Manuel", "Duarte");
    persona.saludo()

}

class Persona (val name: String, val lastName: String) {

    fun saludo () {
        println("Bienvenido $name $lastName")
    }

}