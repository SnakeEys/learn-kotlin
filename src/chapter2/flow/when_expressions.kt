package chapter2.flow

/**
 * Created by snake
 * on 16/2/23.
 */

fun main(args: Array<String>) {
    when_check(1)
    when_check3(4)
    when_check4("123.")
    when_check5(10)
}


// like switch case in Java,
// note the else, like "default"
fun when_check(a: Int) {
    when(a) {
        0 -> println("zero")
        1 -> println("one")
        else -> println("neither 0, nor 1")
    }
}

// handle many cases in a same way
fun when_check2(a: Int) {
    when(a) {
        0, 1 -> println("0, or 1")
        else -> println("neither 0, nor 1")
    }
}

fun when_check3(a: Int) {
    val validNumber = 4..5
    when(a) {
        in 1..3 -> println("$a is in the range of 1 - 3")
        in validNumber -> println("$a is in the valid range of $validNumber")
        !in 6..9 -> println("$a is not valid")
        else -> println("none of above")
    }
}

// smart casts
fun when_check4(s: Any) {
    val isString = when(s) {
        is String -> s.endsWith(".")
        else -> false
    }
    println(isString)
}

fun when_check5(a: Int) {
    when {
        a.isOdd() -> println("is odd number")
        a.isEven() -> println("is even number")
        else -> println("Interesting")
    }
}

fun Int.isOdd(): Boolean {
    return this % 2 == 0
}

fun Int.isEven(): Boolean {
    return this % 2 != 0
}



