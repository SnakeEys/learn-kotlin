package chapter4


/**
 * Created by snake
 * on 16/2/29.
 */

fun main(args: Array<String>) {
    println(sum(1, 3))


    /**
     * Automatically inferred the return type
     * the arguments can be passed outside of the parentheses
     * the only parameter will be omitted in function and implicitly represent by it
     */
    var arr = arrayOf(1, 3, 5, 6, 7);
    val odd = arr
            .filter { it % 2 != 0 }
            .map { it * 10 }
    println(odd)

    max(arrayListOf("a", "b", "jack", "green"), {a, b -> a.length < b.length})

    max(odd, {a, b -> a < b})
}

/**
 * Lambda expression function
 * the 2 functions below are totally equivalent
 */
//val sum = { x: Int, y: Int -> x + y }
 val sum : (Int, Int) -> Int = {x, y -> x + y}

/**
 * function type
 */
fun <T> max(collection: Collection<T>, less : (T, T) -> Boolean) : T? {
    var max: T? = null
    for (it in collection) {
        if (max == null || less(max, it)) {
            max = it
        }
    }
    return max
}
