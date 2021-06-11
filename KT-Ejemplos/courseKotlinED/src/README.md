## Example 1

<li>
    1. Create fruit variable and initialize it with variable orange value
</li>
<li>
    2. Reinitialize fruit variable with with banana value
</li>

<pre>
  var fruit:String = "Orange" // 1
  fruit = "Banana"    // 2
</pre>

### Example 2

<li>
    1. Create fruit variable and initialize it with string orange value
</li>  
<li>
    2. Compiler will throw an error, because fruit variable was already initialized
</li>

<pre>
 var fruit:String = "orange"  // 1
 a = "banana" // 2
</pre>

> _"Kotlin also allows us to define variables and functions at the level
of the file. We will discuss it further in Chapter 3 , Playing with
Functions."_ 🔥

### Example 3
<pre>
    val list = mutableListOf("a","b","c") //1
    list = mutableListOf("d", "e") //2 Error
    list.remove("a") //3
</pre>

<li>
     1. Initialize mutable list
</li>
<li>
     2. Compiler will throw an error, because value reference cannot be changed
        (reassigned)
</li>
<li>
     3. Compiler will allow to modify content of the list
</li>


| Variable/value definition   | Reference can change   | Object state can change   |
| --------------------------- | -----------------------| --------------------------|
|  val = listOf(1,2,3)        | No                     | No                        |   
|  val = mutableListOf(1,2,3) | No                     | Yes                       |   
|  var = listOf(1,2,3)        | Yes                    | No                        |
|  var = mutableListOf(1,2,3) | Yes                    | Yes                       |    




