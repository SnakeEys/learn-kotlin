package chapter1.syntax

/**
 * Created by snake
 * on 16/2/18.
 */

fun main(args: Array<String>) {
    val a = 1
    val b = 3
    val x = max(a, b)
    val y = 3
    max2(x, y)

    println()

    var j = parseInt("3")
    var k = parseInt("    ")
    println("j = $j, k = $k")

    println()

    println("get the length of getLength() ${getLength("")}")
    println("get the length of getLength2(111)  ${getLength2(111)}")
    println("get the length of getLength3(\"Kotlin\") ${getLength3("kotlin")}")

}

/**
 * Condition expressions
 */
fun max(a: Int, b: Int): Int {
    println("return $a if $a is bigger than $b, else $b")
    if (a > b)
        return a
    else
        return b
}

/**
 * Using if  as expression
 */
fun max2(a: Int, b: Int) = if (a > b) a else b

/**
 * When nullable value is possible, reference must be explicitly marked as null with the ? symbol
 */
fun parseInt(str: String): Int? {
    // Notice about null, empty and blank
    if (str.isNullOrBlank())
        return null
    else
        return str.toInt()
}


/**
 * Type check, inside type check, the instance will be cast to specific type automatically
 */
fun getLength(obj: Any): Int? {
    if (obj is String)
        return obj.length
    else
        return null
}

fun getLength2(obj: Any): Int? {
    if (obj !is String) {
        return null
    } else {
        // Automatically cast to String
        return obj.length
    }
}

/**
 * There is a side-effect after type check on the right hand of &&
 */
fun getLength3(obj: Any): Int? {
    if (obj is String && obj.isNotEmpty())
        return obj.length
    return null
}