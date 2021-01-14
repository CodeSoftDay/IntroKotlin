package seccion6

fun main(args: Array<String>) {

    val nums = mutableListOf( 1,2,3,4,5 )
    for ( elemento in nums )
        println( elemento )

    val inmutable = setOf( 1,2,3,4,5,1 ) // Es solo para lectura (no permite valores repetidos)
    for ( elemento in inmutable )
        println( elemento )

    val mutable = mutableSetOf( 51,52,23,45 ) // Coleccion de datos mutables
    mutable.add(40)
    for ( elemento in mutable )
        println( elemento )

}