package chapter1.idioms

/**
 * Created by snake
 * on 16/2/21.
 */

fun main(args: Array<String>) {
    println(colorInt("green"))
}

fun colorInt(color : String):Int {
    return when(color) {
        "green" -> 0
        "red" -> 1
        "black" -> 2
        else -> -1
    }
}

fun tryCatch() {
    val result = try {
        // do something
    }catch(e : Exception) {
        e.printStackTrace()
    }
    // working with result
}

fun foo(param : Int) {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }
}

/** Builder Style **/
fun arrOfMinus(size : Int) : IntArray {
    return IntArray(size).apply { fill(-1) }
}

/** single expression **/
fun answer() = 2
/** this is equivalent to previous one **/
fun answer2(): Int {
    return 2
}

/** combine with other idioms, leading to shorter code**/
fun transformColor(color : String): Int = colorInt(color)