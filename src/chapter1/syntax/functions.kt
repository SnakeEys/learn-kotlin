/**
 * Defining packages
 * Package specification should be at the top of the source file:
 *
 **
 * Created by snake
 * on 16/2/18.
 *
 *
 */

/**
 * It was just like Java, the program needs an entrance, method of chapter1.syntax.main, with a string array parameter.
 */
fun main(args : Array<String>) {
    sum(a = 3, b = 4);
}

/**
 * This is a void return method, with two Int(kotlin data type) arguments
 */
fun sum(a : Int, b : Int) {
    var c  = a + b
    println("the total value of input is $c")
    println("$a + $b = $c")
}

/**
 * Return no meaningful value, also, the Unit return type can be omitted
 */
fun sum2(a : Int, b : Int) : Unit {
    println("this is a void return method")
}

fun sum3(a : Int, b : Int) : Int {
    println("this is a method return an Int value")
    return a + b;
}