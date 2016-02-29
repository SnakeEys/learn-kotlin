package chapter4

/**
 * Created by snake
 * on 16/2/29.
 */
fun main(args: Array<String>) {
    anonyFun()
}


/**
 * this is actually an error, package-level functions must have a name,
 * while as a part of lambda expression, anonymous functions is totally allowed
 * see the example below
 */
// fun(x: Int, y: Int): Int = x + y

fun anonyFun() {
    val arr = arrayOf(1, 3, 5, 6, 7, 8)
    val odd = arr.filter(fun(it) = it % 2 == 0)
    // which is absolutely equivalent to
    val even = arr.filter { it % 2 != 0 }
    // remember java anonymous method?
    // view.setOnClickListener(new OnClickListener() {
    //      public void onClick(View v) {
    //          ...
    //      }
    // })

    println("even numbers : $even")
    println("odd numbers: $odd")

}