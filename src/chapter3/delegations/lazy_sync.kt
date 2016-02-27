package chapter3.delegations

/**
 * Created by snake
 * on 16/2/27.
 */


fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}

val lazyValue: String by lazy {
    println("first call to execute...")
    "What????"
}