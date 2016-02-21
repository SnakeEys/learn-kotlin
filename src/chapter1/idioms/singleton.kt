package chapter1.idioms

import java.io.File

/**
 * Created by snake
 * on 16/2/21.
 */

fun main(args: Array<String>) {
    println(SingleTon.instance)
    println()
    fileOperation()
    println()
    shortHand()
}

object SingleTon {
    val instance = "Instance"
}

fun fileOperation() {
    val file = File("../learn-kotlin")
    val path = file.path
    val files = file.listFiles()
    for (s in files) {
        println(s)
    }
    println(path)
}

fun shortHand() {
    val file = File("../learn-kotlin")
    val files = file.listFiles()

    // NONNULL SHORTHAND
    println(files?.size)

    // NONNULL AND ELSE SHORTHAND
    println(files?.size ?: "empty")

    // if value is null, use "?", else follow a "?" after the value
    val pathLength = files[0].path?.length ?: "length is 0"
}