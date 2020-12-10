fun main(args: Array<String>) {

        //numerosPar()
        //numerosImpar()
        downTo()

}

fun numerosPar () {

    // Números pares del 0 a 100
    println( "Números pares del 0 a 100 con el  STEP" )
    for ( y in 0..100 step 2 ) println( y )

}

fun numerosImpar () {

    // Imprimir los numeros impares
    println( "Números Impares del 0 a 100 con el  STEP" )
    for ( x in 0..100 step 3 ) {
        println( x )
    }

}

/**
 * Uso del downTo
 */

fun downTo () {

    println("Uso del downTo con el for")
    /**
     *  Lo que el hace el downTo es decrementar y con el step le indicamos los paso que debe seguir
     *  en este seria que decremente de 2 en 2 (100, 96, 94, 92, 80 ...)
     */
    for ( x in 100 downTo -100 step 2 ) {
        println( x )
    }

}
