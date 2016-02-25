package chapter3.classes_inheritance

import kotlin.reflect.jvm.internal.impl.javax.inject.Inject

/**
 * Created by snake
 * on 16/2/24.
 */
fun main(args: Array<String>) {
    // creating instance of classes
    // kotlin doesn't use new operator
    val p = Customer("Jone")
}

/**
 *  class User constructor(name: String)
 *  primary constructor, if there is no annotation or visibility modifiers,
 *  the key constructor can be omitted
 **/
class User(name: String) {

    // init
    init {

    }

}

// empty class, no header(properties field, primary constructor), either body
class Empty


// when it has visibility modifiers the key word constructor is needed
// which go before it
class Customer public @Inject constructor(name: String) {

}

// secondary constructor
class Customer1 {
    constructor(customer: Customer1) {
//        customer.children.add(this)
    }
}

// secondary constructor
// delegate to the primary constructor
class Person (val name: String) {
    constructor(name: String, parent: Person) : this(name) {
    }

}

/**
 * Invisible primary constructor for non-abstract class
 */
class InvisibleClass private constructor() {

}
