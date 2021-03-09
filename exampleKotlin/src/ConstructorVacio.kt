fun main(args: Array<String>) {

    val firulais = Animals("Misifu", 5);

    val firulais2 = Animals()
    firulais2.name = "Perrin"
    firulais2.age = 4
    firulais2.presentando()

}


/**
 * Creando un constructor vacio
 */

class Animals (var name: String = "", var age: Int = 0) {

    fun presentando () {
        println("Mi perrito se llama: $name y tiene $age años de edad")
    }

}