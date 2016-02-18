package chapter1.syntax

/**
 * Created by snake
 * on 16/2/18.
 */
fun main(args : Array<String>) {
    // define read-only local variable value
    val a : Int = 2
    val b = 1            // Int type is inferred
    val c : Int            // Type required when no initializer is provided
    c = 3                 // definite assignment
    println("value of a is $a, which is immutable")
    println("value of b is $b, which is immutable")
    println("value of c is $c,  which is immutable")
//    a = 4, ERROR because value defined by val modifier is immutable

    var x = a
    println("mutable value x = $x")
    x += 1
    println("now x is changed by an expression x += 1, x = $x")
}

/**
 * String template
 * for more details please check kotlin-docs.pdf<String template>
 */
fun additional(args: Array<String>) {
    if (args.isEmpty()) return
    println("string template ${args[0]}")
}