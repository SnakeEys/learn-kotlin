package chapter4

/**
 * Created by snake
 * on 16/2/29.
 */


fun main(args: Array<String>) {
    println(fibonacci())
}

tailrec fun fibonacci(a: Int = 0, b: Int = 1) : Int{
    println(a)
    println(b)
    if (a > 10) {
        return a + b
    } else {
        val c = a + b
        val d = b +c
        return fibonacci(c, d)
    }
}