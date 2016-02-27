package chapter3.delegations

/**
 * Created by snake
 * on 16/2/27.
 */

class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    val user = User(mapOf(
            "name" to "Jack",
            "age" to 20
    ))

    println("${user.map}")
    println("${user.name}")
    println("${user.age}")

}