
fun main(args: Array<String>){

    val usuario = User("Manuel", 18)
    val usuario2 = usuario.copy(age = 25)
    println(usuario2.toString())

    println("Son iguales: ${usuario == usuario2}")



}


data class User (val name: String, val age: Int)