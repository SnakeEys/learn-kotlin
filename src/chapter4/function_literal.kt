package chapter4

/**
 * Created by snake
 * on 16/2/29.
 */

fun main(args: Array<String>) {
    // function literals with receiver... kind of function extensions
    // this is equivalent to the fun sumOther()
    val sum = fun Int.(other: Int) : Int = this + other

    println("${1.sum(2)}")
    println("${1.sumOther(2)}")

    println("----------------")

    // lambda function with only one parameter can be passed without parentheses, remember?
    html {
        body()
    }
}

fun Int.sumOther(other: Int) : Int {
    return this + other
}


class HTML {
    fun body() {
        println("HTML.....body")
    }
}

fun html(init: HTML.() -> Unit) : HTML {
    val html = HTML()   // create the receiver object
    html.init()               // pass the receiver to lambda
    return html
}
