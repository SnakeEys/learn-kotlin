package chapter2.basic_types

/**
 * Created by snake
 * on 16/2/22.
 */
fun main(args: Array<String>) {
    // there is a cached range of Integer, from -128 to 127.
    // when a is in the range, the === comparing is true, false else
    val a: Int = 1000
    println(a === a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // !!!Prints 'false'!!! like equals() method in Java, this is comparing reference
    println(boxedA == anotherBoxedA) // !!! Prints "true"!!!, this just compares the value
    println()

    conversions()
    println()
    char()
}

fun conversions() {
//    smaller types are not subtype of bigger one
//    Hypothetical code,
//    val a: Int? = 1 // A boxed Int (java.lang.Integer)
//    val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)
//    print(a == b) print 'false'

//    actually explicit conversion is needed
    val a: Int = 1;
    val b: Long = a.toLong()
//    println(a == b)   // this doesn't compile at all because of type mismatch

    val x =  3 + 3L // type inferred
    println(x is Long)
}

fun char() {
    val str = "hello kotlin"
    for (c in str) {
        println("$c --> ${c.toInt()}") // Explicit conversion
    }
}
