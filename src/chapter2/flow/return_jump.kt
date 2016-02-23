package chapter2.flow

/**
 * Created by snake
 * on 16/2/23.
 */

fun main(args: Array<String>) {
    //    break_expression()
    return_expression()
}


// expression with a label @ sign
fun break_expression() {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j * i > 50 && j * i < 100) {
                break@loop
                // or continue@loop
            } else {
                println("$j * $i = ${j * i}")
            }
        }
    }
}

fun return_expression() {


    val arr = arrayOf(1, 3, 5, 6)
    arr.forEach lit@{
        if (it % 3 == 0) return@lit
        println(it)
    }

    println("-----------")
    arr.forEach {
        if (it % 2 == 0) return@forEach
        println(it)
    }
}


