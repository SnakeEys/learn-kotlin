package chapter3.inheritances

/**
 * Created by snake
 * on 16/2/24.
 */

fun main(args: Array<String>) {
    val human = Human()
    human.move()
}

/**
 * Implicitly inherits from Any(this is not java.lang.Object)
 */
class Element {

}

/**
 * open is opposite to final in java
 * which allows other class to inherit from this class
 * By
 */
open class BaseElement{

}

/**
 * Explicitly inherits from another class
 */
class SingleEle(p: Int) : BaseElement() {
}


open class Animal {
    open fun move() {}

    fun grow() { }
}

interface Behavior {
    fun move() {}

    fun sleep() {}
}

class Human : Animal(), Behavior {
    override fun move() {
        super<Animal>.move()
        super<Behavior>.move()

        println("moving....")
    }

    override fun sleep() {
        super.sleep()
    }

}