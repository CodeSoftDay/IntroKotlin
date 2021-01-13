class Persona{
    var name = ""
    var direccion = ""
    var phone = 88587173

    constructor(name: String, direccion: String, phone: Int) {
        this.name = name
        this.direccion = direccion
        this.phone = phone
    }

}


fun main(args: Array<String>) {
    var persona = Persona("Carlos", "Bilwi", 88587173)
    println("Mi nombre es ${persona.name} soy de ${persona.direccion} y mi télefono es ${persona.phone}")
}