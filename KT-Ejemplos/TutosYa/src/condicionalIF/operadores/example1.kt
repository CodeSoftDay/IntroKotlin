package condicionalIF.operadores

/**
 * Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar
 * un mensaje "Promocionado".
 */

fun main (args: Array<String>) {

    println("Primer nota")
    val nota1 = readLine()!!.toInt()
    println("Segunda nota")
    val nota2 = readLine()!!.toInt()
    println("Tercer nota")
    val nota3 = readLine()!!.toInt()

    val calificacion = nota1.plus(nota2).plus( nota3) / 3;

    if (calificacion > 7 ){
        println("Promocionado!!, Felicidades su nota fue de $calificacion ")
    }



}