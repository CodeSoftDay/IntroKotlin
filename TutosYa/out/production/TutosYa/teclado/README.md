#  Entrada de datos por teclado en la Consola

<p>Cuando utilizamos la Consola para mostrar información por pantalla utilizamos las funciones print y println. Si necesitamos entrar datos por teclado podemos utilizar la función readLine.</p>

<pre>
fun main(args :Array<String>) {

    println("Ingrese el primer número")
    val numero1 = readLine()!!.toInt()

    println("Ingrese el segundo número")
    val numero2 = readLine()!!.toInt()

    val suma = numero1 + numero2
    println("La suma de $numero1 + $numero2 es = $suma")

    val multi = numero1 * numero2
    println("El producto del $numero1 * $numero2 es = $multi")
}
</pre>
<p>Para entrada de datos por teclado disponemos una función llamada readLine. Esta función retorna un String con los caracteres escritos por el operador hasta que presiona la tacla "Entrada". Luego llamando al método toInt de la clase String se convierten los datos ingresados por teclado en un Int y se guarda en numero1.

El problema se presenta cuando el operador presiona la tecla "Entrada" sin cargar datos, en ese caso retorna null.

Vimos que una de las premisas de Kotlin es ser conciso, la segunda premisa es que sea seguro, luego cuando una función retorna null no podemos llamar a los métodos que tiene ese objeto</p>

<pre>val numero1 = readLine().toInt()</pre>

<p>La línea anterior no compila ya que si readLine retorna un String es correcto llamar al método toInt para que lo convierta a entero, pero readLine puede retornar null y en ese caso no podemos llamar a toInt.

La primer forma de resolver esto es avisarle al compilador de Kotlin que confíe que la función readLine siempre retorna un String, esto lo hacemos agregando el operador !! en la llamada: </p>

<pre>val numero1 = readLine()!!.toInt()</pre>

<p>No es la mejor forma de validar que se ingrese en forma obligatoria un dato por teclado pero en los próximos conceptos veremos como mejorar la entrada de datos por teclado para que sea más segura y evitar que se generen errores cuando el operador presiona la tecla "Entrada" sin ingresar datos.

Continuando con el problema luego de cargar los dos enteros por tecla procedemos a sumarlos, multiplicarlos y mostrar los resultados:</p>

<pre>    val suma = numero1 + numero2
    println("La suma de $numero1 + $numero2 es = $suma")

    val multi = numero1 * numero2
    println("El producto del $numero1 * $numero2 es = $multi")</pre>


