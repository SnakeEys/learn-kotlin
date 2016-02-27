
import kotlin.properties.Delegates

/**
 * Created by snake
 * on 16/2/27.
 */
fun main(args: Array<String>) {
    val user = User()
    user.name = "first access"
    user.name = "second access"
}

class User {
    var name: String by Delegates.observable("initial param") {
        prop, old, new ->
        println("$old -> $new")
    }
}

//class User2 {
//    var name: String by Delegates.vetoable("initial param") {
//        prop, old, new ->
//        println("$old -> $new")
//    }
//}