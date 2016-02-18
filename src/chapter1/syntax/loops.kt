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
}

fun forloop(arr: Array<String>) {

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

fun whenCondition(obj : Any) {
    when (obj) {
        is Int -> println("Int value")
        is String -> println("String value")
        is Long -> println("Long value")
        1 -> println("number of 1")
        else -> println("unknown")
    }
}

