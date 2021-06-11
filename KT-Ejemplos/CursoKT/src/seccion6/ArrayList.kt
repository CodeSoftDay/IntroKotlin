package seccion6

fun main(args: Array<String>) {

    val arrayList = ArrayList<String>()

    // Agregar elementos al array
    arrayList.add("Managua")
    arrayList.add("Bilwi")
    arrayList.add("Granada")
    arrayList.add("Carazo")
    arrayList.add("Rivas")

    // con un for podemos recorrer los arraylist
    for (elemento in arrayList.indices){
        println("Ingresa la ciudad")
        arrayList[elemento] = readLine()!!.toString()
    }

    // Asi podemos mostrar los elementos del arrayList
    for (indice in arrayList)
        println(indice)

    // Otra forma de agregar elementos al arrayList

    arrayList[1] = "Nueva Guinea"
    arrayList.set(2, "Matagalpa")

    println(arrayList)

    // para verificar si el elemento se encuentra en el arrayList
    if (arrayList.contains("Matagalpa")){
        println("Se ha encontrado")
    } else {
        println("Este elemento no existe")
    }

    for (tamanio in 0..arrayList.size) {
        println(tamanio)
    }


}


