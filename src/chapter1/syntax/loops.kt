package chapter1.syntax

/**
 * Created by snake
 * on 16/2/18.
 */

fun main(args : Array<String>) {
    var arr = arrayOf("1", "2", "3")
    forloop(arr)

    var arr2 = arrayOf("", 1000L, 1, 100)
    for (i in arr2.indices) {
        whenCondition(arr2[i])
    }
    println()
    rangeOperator(4)
    println()
    checkIndex(arr2)
    println()
    checkElement("Jack", listOf("Jack", "Mark", "Green", "Snake"))
    println()
    lambda(listOf("x-ray", "x-professor", "x-fighter"))
}

fun forloop(arr: Array<String>) {

    // the in operator can be used to iterate over a range,
    // of course in the following example you will see more.
    // just like for each in Java
    for (a in arr) {
        println(a)
    }

    // or by indices
    for (i in arr.indices) {
        println("the ${i + 1} value is ${arr[i]}")
    }
}

fun whileLoop(arr : Array<Int>) {
    var i = 0
    while(i < arr.size) {
        println(arr[i++])
    }
}

/**
 * Instance check by when operator
 */
fun whenCondition(obj : Any) {
    // something like switch case, but in kotlin, type can be checked by using when operator
    when (obj) {
        is Int -> println("Int value")
        is String -> println("String value")
        is Long -> println("Long value")
        1 -> println("number of 1")
        else -> println("unknown")
    }
}

fun rangeOperator(a : Int) {
    // range/loop
    if (a in 1..10) {
        println("$a is in the range from 1 to 10.")
    }
}

fun checkIndex(arr : Array<Any>) {
    if (10 !in 0..arr.lastIndex) {
        println("array's size is less than 10")
    }
    println("the size of array is ${arr.size}")
}


/**
 * Collection
 */
fun checkElement(c : String, cl : Collection<String>) {
    // like contains() method in Java
    if (c in cl) {
        println("$cl contains the element of $c")
    }
}

/**
 * Lambda expression to operate Collection
 */
fun lambda(arr : Collection<String>) {
    arr
        .filter { it.startsWith("x") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}
/**
 * More information please check <Higher Functions and Lambda>
 */


