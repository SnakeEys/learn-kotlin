package chapter3.properties_fields

/**
 * Created by snake
 * on 16/2/25.
 */

fun main(args: Array<String>) {
    val user = User("Jack", 19)
    val newUser = user.copy(age = 22)
    println(newUser)
}

data class User(val name: String = "", val age: Int = 0)