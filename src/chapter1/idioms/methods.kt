package chapter1.idioms

import java.nio.file.Files
import java.nio.file.Paths

/**
 * Created by snake
 * on 16/2/21.
 */


fun main(args: Array<String>) {
    val turtle = Turtle()

    with(turtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

/**
 * Calling multiple methods on an object instance("with")
 */
class Turtle {
    fun penDown() {

    }

    fun penUp() {

    }

    fun turn(degrees: Double) {

    }

    fun forward(pixels: Double) {

    }
}

fun stream() {
    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
    stream
            .buffered()
            .reader()
            .use { reader -> println(reader.readText()) }
}

