package chapter2.basic_types

/**
 * Created by snake
 * on 16/2/22.
 */
fun main(args: Array<String>) {
    // there is a cached range of Integer, from -128 to 127.
    // when a is in the range, the === comparing is true, false else
    val a: Int = 1000
    print(a === a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA === anotherBoxedA) // !!!Prints 'false'!!! like equals() method in Java, this is comparing reference
    print(boxedA == anotherBoxedA) // !!! Prints "true"!!!, this just compares the value
    println()


    val b: Int = 1
    println(b === b)
    val boxedB: Int? = b
    val boxedB2: Int? = b
    println(boxedB === boxedB2)
}
