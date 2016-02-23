package chapter2.flow

/**
 * Created by snake
 * on 16/2/23.
 */

fun main(args: Array<String>) {

    traditionalUsage(3, 5)

    cascading(4, 4)
}

fun traditionalUsage(a: Int, b: Int) {
    if (a > b)
        println("$a is bigger than $b")
    else
        println("$a is smaller than $b")

    // expression
    val max = if (a > b) a else b
}

fun cascading(a: Int, b: Int) {
    val value = if (a > b) {
        println(" choose $a")
        a
    } else if (a == b) {
        println("$a equals $b")
        a
    } else {
        println(" choose $b")
        b
    }
    println(value)
}