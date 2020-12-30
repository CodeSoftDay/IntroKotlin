#  Tipos de variables

<p> Una variable es un depósito donde hay un valor. Consta de un nombre y pertenece a un tipo.</p>
<h5> En el lenguaje Kotlin si necesitamos almacenar un valor numérico entero podemos definir una variable de tipo:</h5>

<pre>
    Byte
    Short
    Int
    Long
</pre>

<p>Según el valor máximo a almacenar utilizaremos alguna de estos cuatro tipos de variables enteras. Por ejemplo en una variable de tipo Int podemos almacenar el valor máximo: 2147483647 y en general tenemos:</p>

<pre>
Tipo de variable 

    mínimo                             máximo
    Byte                                 -128                            +127
    Short                             -32 768                         +32 767
    Int                        -2 147 483 648                  +2 147 483 647
    Long           -9 223 372 036 854 775 808      +9 223 372 036 854 775 807
</pre>

<p>Si tenemos que almacenar un valor con parte decimal (es decir con coma como puede ser el 3.14) debemos utilizar una variable de tipo:</p>

<pre>
    Double
    Float
</pre>

<h5>El tipo Double tiene mayor precisión que el tipo Float.</h5>
<p>Y otro tipo de variables que utilizaremos en nuestros primeros ejercicios serán las variables de tipo String que permiten almacenar un conjunto de caracteres:</p>

<pre>
    String
</pre>

<p>Una variable en Kotlin puede ser inmutable, esto significa que cuando le asignamos un valor no puede cambiar más a lo largo del programa, o puede ser mutable, es decir que puede cambiar el dato almacenado durante la ejecución del programa.</p>

<h5>Para definir una variable en Kotlin inmutable utilizamos la palabra clave val, por ejemplo:</h5>

<pre>
    val edad: Int
    edad = 48
    val sueldo: Float
    sueldo = 1200.55f
    val total: Double
    total = 70000.24
    val titulo: String
    titulo = "Sistema de Ventas"
</pre>

<p>
Hemos definido cuatro variables y le hemos asignado sus respectivos valores.

Una vez que le asignamos un valor a una variable inmutable su contenido no se puede cambiar, si lo intentamos el compilador nos generará un error:
</p>

<pre>
    val edad: Int
    edad = 48
    edad = 78
</pre>

<p>
Si compilamos aparece un error ya que estamos tratando de cambiar el contenido de la variable edad que tiene un 48. Como la definimos con la palabra clave val significa que no se cambiará durante toda la ejecución del programa.

En otras situaciones necesitamos que la variable pueda cambiar el valor almacenado, para esto utilizamos la palabra clave var para definir la variable:
</p>

<pre>
    var mes: Int
    mes = 1
    // algunas líneas más de código
    mes = 2
</pre>

<p>La variable mes es de tipo Int y almacena un 1 y luego en cualquier otro momento del programa le podemos asignar otro valor.</p>


<h4>Problema</h4>

<p>
Crear un programa que defina dos variables inmutables de tipo Int. Luego definir una tercer variable mutable que almacene la suma de las dos primeras variables y las muestre. Seguidamente almacenar en la variable el producto de las dos primeras variables y mostrar el resultado.

Realizar los mismos pasos vistos anteriormente para crear un proyecto y crear el archivo variables.kt donde codificar el programa respectivo (Si tenemos abierto el IntelliJ IDEA podemos crear un nuevo proyecto desde el menú de opciones: New -> Project)
</p>
<pre>

    fun main(args: Array<String>)  {
    
        println("Enter the first number")
        val firstNumber: Int = readLine()!!.toInt()
    
        println("Enter the second number")
        val secondNumber: Int = readLine()!!.toInt()
    
        val sum = firstNumber.plus(secondNumber);
    
        println("The sum of the two numbers is: $sum ")
    }

</pre>

<h3>Resultado</h3>
<pre>
Enter the first number
3
Enter the second number
2

The sum of the two numbers is: 5 
</pre>


<p>Declaramos las variable y la mandamos a pedir por consola con <code> readline() </code></p>
<pre>
    val firstNumber: Int = readLine()!!.toInt()
    val secondNumber: Int = readLine()!!.toInt()
</pre>

<h3>Menos codigo en el programa</h3>
<p>Lo hacemos omitiendo el tipo de dato de la variable para que kotlin nos ayude a inferirlo</p>
<pre>

    fun main(args: Array<String>)  {

        println("Enter the first number")
        val firstNumber = readLine()!!.toInt()
    
        println("Enter the second number")
        val secondNumber = readLine()!!.toInt()
    
        val sum = firstNumber.plus(secondNumber);
    
        println("The sum of the two numbers is: $sum ")
    }

</pre>

<p>al hacer tendremos el mismo resultado, al quitarle el tipo de dato afecta nuestro
codigo ya que kotlin su filosofia es que sea conciso y facil de entender</p>

<h3> Problemas propuestos </h3>

<p><li>Definir una variable inmutable con el valor 50 que representa el lado de un cuadrado, en otras dos variables inmutables almacenar la superficie y el perímetro del cuadrado. Mostrar la superficie y el perímetro por la Consola.</li>
    <li>Definir tres variables inmutables y cargar por asignación los pesos de tres personas con valores Float. Calcular el promedio de pesos de las personas y mostrarlo. </li> </p>
