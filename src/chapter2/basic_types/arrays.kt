package chapter2.basic_types

/**
 * Created by snake
 * on 16/2/23.
 */
fun main(args: Array<String>) {

}

fun createArr() {
    // library functions
    arrayOf(1, 2, 3, 4, 5)
    // create initialized size array of null
    arrayOfNulls<Any>(10)

    // factory function
    // create with values
    Array(10, { i -> (i + 1).toString() })
}

fun differentArray() {
    val intArr: IntArray = intArrayOf(1, 3, 4, 5, 5)
    val shortArr: ShortArray = shortArrayOf(1, 3, 5, 6)
    val boolArr: BooleanArray = booleanArrayOf(true, false, true)
}