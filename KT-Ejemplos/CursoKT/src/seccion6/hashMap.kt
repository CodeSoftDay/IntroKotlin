package seccion6

fun main(args: Array<String>) {

    val hashMap = HashMap<Int, String>()

    // Agregar los valores (se compone de un key y valor)
    hashMap.put(1, "Managua")
    hashMap.put(2, "Rivas")
    hashMap.put(3, "Matagalpa")

    println(hashMap)
    println(hashMap[3])

    for (elemento in hashMap.keys)
        println(hashMap[elemento])

}