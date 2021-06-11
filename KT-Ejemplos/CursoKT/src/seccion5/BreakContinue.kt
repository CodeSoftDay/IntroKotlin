package seccion5

fun main(args: Array<String>) {

    /*for(elemento in 0..10) {

        if(elemento == 5) {
            continue;
        } else{
            print("hola")
        }

        if (elemento == 6) {
            break;   // Cuando es igual a 6 se detiene
        }

        println(elemento)
    }

    */

    loop@for (elemento in 1..2) {
        println("Elemento 1: $elemento")
        for (elemeno2 in 1..5) {
            println("Elemento 2: $elemeno2")
            if (elemeno2 == 2){
                break@loop
            }
        }
    }

}