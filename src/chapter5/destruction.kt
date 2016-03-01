package chapter5


/**
 * Created by snake
 * on 16/3/1.
 */

fun main(args: Array<String>) {

    val (result, status) = function()
    println(result)
    println(status)
}

/**
 * data classes automatically declare componentN() functions
 */
data class Result(var result: Int, var status: String)
fun function() : Result{
    return Result(1, "")
}

fun <K, V>traverse(map: Map<K, V>) {
    for ((k, v) in map) {
        // destructing a map
    }
}