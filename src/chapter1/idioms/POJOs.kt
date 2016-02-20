package chapter1.idioms

/**
 * Created by snake
 * on 16/2/20.
 */

data class Customer (var name : String, var age : Int)

fun main(args: Array<String>) {
    defaultValue()
    println()
    println(filter(listOf(1, 3, -3, 5, 3)))

}

/**
 * Define default value for arguments
 */
fun defaultValue(a : Int = 0, b : String = "") {
    if (a == 0) {
        println("the function is using default value $a")
    }
    if (b.isEmpty()) {
        println("the input string is empty")
    }
}

/**
 * Using lambda expression in Collection
 */
fun filter(arr : Collection<Int>) : Collection<Int>{
    return arr.filter { x -> x > 0 }
    // or
//    arr.filter { it > 0 }
}