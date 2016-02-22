package chapter1.idioms

/**
 * Created by snake
 * on 16/2/20.
 */

data class Customer(var name: String, var age: Int)

fun main(args: Array<String>) {
    defaultValue()
    println()
    println(filter(listOf(1, 3, -3, 5, 3)))

    println()
    // String interpolation
    var name = "jack"
    println("Name $name")
    println()
    var map = mapOf("a" to "1", "b" to "2")
    traverse(map)
    // Access to map
    println(map["a"])
    // map["a"] = "3" this doesn't work while the documents writes map[key] = value
    println()
    "Convert this to came case".space2CamelCase()
}

/**
 * Define default value for arguments
 */
fun defaultValue(a: Int = 0, b: String = "") {
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
fun filter(arr: Collection<Int>): Collection<Int> {
    return arr.filter { x -> x > 0 }
    // or
    //    arr.filter { it > 0 }
}

/**
 * Traversing a map/list
 */
fun traverse(map: Map<String, String>) {
    for ((k, v) in map) {
        println("Key : $k")
        println("Value : $v")
    }
}

/**
 * Extension Function
 * a function which extends origin class.
 */
fun String.space2CamelCase() {
    println(this)
    println(this.length)
    println("----- to Camel Case")
}