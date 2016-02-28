package chapter4

import java.util.*

/**
 * Created by snake
 * on 16/2/28.
 */


fun main(args: Array<String>) {
    val x = 1.tenTimes(10)
    println(x)

    asList("d", 'c', 1)
    asList(1, 3, 5)
}


/**
 * infix notations
 */
infix fun Int.tenTimes(a: Int): Int {
    return this * a * 10
}

/** single expression */
fun double(a: Int) = a * 2

/**
 * vararg parameter
 * List<T> asList(T... t)
 */
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // iterate type arrays and put each of them into a list
        result.add(t)
    return result
}