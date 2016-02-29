package chapter4

/**
 * Created by snake
 * on 16/2/29.
 */


fun main(args: Array<String>) {
    getSum(arrayOf(1, 3, 5, 2, 4, 6))
}

/**
 * lambda can access to the variable out of the scope.
 */
fun getSum(collection: Array<Int>) {
    var sum = 0;
    collection
        .filter { it % 2 == 1 }
        .forEach {
            sum += it
        }
    println(sum)
}