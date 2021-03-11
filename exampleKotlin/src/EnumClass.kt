fun main(args: Array<String>) {

    val dias = DIAS.Lunes.numero
    println(dias)

}

enum class DIAS(val numero: Int) {
    Lunes(0),
    Martes(1),
    Miercoles(2),
    Jueves(3),
    Viernes(4),
    Sabado(5),
    Domingo(6)
}