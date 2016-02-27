package chapter3.delegations

import kotlin.reflect.KProperty

/**
 * Created by snake
 * on 16/2/27.
 */

fun main(args: Array<String>) {
    var de = DelegateExample()
    println(de.s)
    de.s = "New Value"
    println(de.s)
}


/**
 * Properties delegation,
 * But I'm still confused about properties,
 * I can generally understand how class delegate comes in kotlin(kind of Delegation Pattern), but this not.
 */
class Delegate() {
    operator fun getValue(ref: Any?, property: KProperty<*>): String {
        return "$ref, thank you for delegating '${property.name}' to me "
    }

    operator fun setValue(ref: Any?, property: KProperty<*>, value: String) {
        println("$value has been set to ${property.name} in $ref")
    }
}

class DelegateExample () {
    var s: String by Delegate()
}
