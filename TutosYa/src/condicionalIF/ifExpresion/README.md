## Estructura condicional if como expresión

<p>
En Kotlin existe la posibilidad de que la estructura condicional if retorne un valor,
característica no común a otros lenguajes de programación.

Veremos con una serie de ejemplos la sintaxis para utilizar el if como expresión.
</p>

### Problema 1
<p>
Cargar dos valores enteros, almacenar el mayor de los mismos en otra variable y mostrarlo.

Example.kt
</p>
<pre>

    fun main(args: Array<String>) {

        print("Ingrese primer valor:")
        val valor1 = readLine()!!.toInt()
    
        print("Ingrese segundo valor:")
        val valor2 = readLine()!!.toInt()
    
        val mayor = if (valor1 > valor2) valor1 else valor2
        println("El mayor entre $valor1 y $valor2 es $mayor")
    }

</pre>

Como podemos ver asignamos a una variable llamada mayor el valor que devuelve la
expresión if. Si la condición del if es verdadera retorna el contenido de la variable valor1 y
sino retorna valor2:

<pre>val mayor = if (valor1 > valor2) valor1 else valor2</pre>

<p> El compilador de Kotlin infiere que la variable mayor debe ser de tipo Int ya que tanto valor1
como valor2 son Int.

Las llaves no las disponemos debido a que hay una solo operación tanto por el verdadero
como por el falso.

Lo más común es que se utilice un if como expresión donde se retorna un valor necesitando
una sola actividad por el verdadero y el falso, pero el lenguaje nos permite disponer más de
una instrucción por cada rama del if. </p>










