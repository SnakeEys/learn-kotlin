package chapter3.properties_fields

/**
 * Created by snake
 * on 16/2/25.
 */
fun main(args: Array<String>) {
    display(B())
}

open class A

class B : A()

fun A.foo() = "From A"

fun B.foo() = "From B"

fun display(a: A) {
    println(a.foo())
}
