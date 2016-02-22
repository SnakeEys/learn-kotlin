package chapter1.conventions

/**
 * Created by snake
 * on 16/2/22.
 */

fun main(args: Array<String>) {
    lambda(listOf("x-ray", "x-professor", "x-fighter"))
}

fun nameStyle() {
    // camelCase
    val userName: String = "Jack"

    // types start with upper case
    // methods start with lower case
    // 4 space indent
    // comments on public methods such as it appears in Kotlin Doc
}

interface Boo {

}

/**
 * Inheritance by ":" to separate type and super type
 * AppCompatActivity : Activity (in android)
 */
interface Foo<out T : Any> : Boo {
    fun foo(a: Int): T
}

/**
 * Using it instead of declaring parameter
 * In nested lambda, parameters should be declared explicitly
 */
fun lambda(arr: Collection<String>) {
    arr
            .filter { it.startsWith("x") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach {
                println(it)
            }
}
