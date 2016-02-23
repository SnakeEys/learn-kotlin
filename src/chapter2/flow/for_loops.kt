package chapter2.flow

/**
 * Created by snake
 * on 16/2/23.
 */
fun main(args: Array<String>) {
//    iterate_index()

    for_each()
    with_index()
}

fun for_each() {
    val arr = arrayOf(1, 3, 5, 6, 7)
    for (i in arr) {
        // println("${arr[i]}") i is element not index
        println(i)
    }
}

fun iterate_index() {
    val arr = arrayOf(1, 3, 5, 6, 7)
    for (i in arr.indices) {
        println("the $i element is ${arr[i]}")
    }
}

fun with_index() {
    val arr = arrayOf(1, 3, 5, 6, 7)
    for ((index, value) in arr.withIndex()) {
        println("the $index element is $value")
    }
}

// P.S while/do..while works as usual like in Java
// traditional break and continue are supported in kotlin, almost the same as java