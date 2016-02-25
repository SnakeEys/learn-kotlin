package chapter3.classes_inheritance

/**
 * Created by snake
 * on 16/2/25.
 */
fun main(args: Array<String>) {
    val b : Base = Child()
    b.f()


    val child = Child()
    child.f()
    child.invoke()
}

open class Base {
    open fun f() {}
}

abstract class Derived : Base() {
    // no implementation for abstract method
    // when (a class or method is) abstract, open operator goes without saying
    abstract override fun f()
}

class Child : Derived() {
    override fun f() {
        println(" invoke in Child")
    }

    fun invoke() {
        println("child's own message")
    }

}

