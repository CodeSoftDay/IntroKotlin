package seccion6

fun main(args: Array<String>) {

    // Clave Valor con el hashMap
    val hashMap = hashMapOf( 1 to "Granada", 2 to "Rivas", 3 to "Esteli", 4 to "León", 5 to "Managua" )
        hashMap.put( 6, "Rosita" )
        hashMap[ 7 ] = "Bilwi"

    // Imprimiendo los elementos de la coloeccion
    println( hashMap )

    for ( elemento in hashMap )
        println( elemento )

    // Se almecena por medio de indices,
    // La coleccion arrayof, es una colección mutable (Lectura y escritura)
    val letter = arrayOf( "a", "e", "i", "o", "u" )
        println(letter[1])

    letter[1] = "z"

    // La coleccion listOf, es una colección inmutable (Solo lectura)
    val nums = listOf(1,2,3,4,5)
    for ( elements in nums )
        println( elements )

    // Esta es una coleccionn de listOf mutable (mutableListOf)
    val numero = mutableListOf(10, 20, 30)
    numero[2] = 25

    println(numero)

}
