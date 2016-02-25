package chapter3.properties_fields

import java.util.*
import kotlin.reflect.jvm.internal.impl.javax.inject.Inject

/**
 * Created by snake
 * on 16/2/25.
 */

fun main(args: Array<String>) {

}

class Person constructor(height: Int?) {
    var name: String = ""
        get() = this.name
        protected set // change visibility of setters but don't change the implementation

    var weight: Double = 0.0
        set(value) {
            // function to parse value to weight
            field = value// backing field
        }

    var age: Int = 0 // default setter and getters
        @Inject set

    val height: Int? = height // must be initialized in constructor

    constructor(height: Int?, age: Int) : this(height) {

    }

    constructor(height: Int?, name: String) : this(height) {

    }

    val gender: Char = 'M' // when declare by val, there is only getters by default

    // custom getters
    val hasHeight: Boolean
        get() = this.height == null // no backing FIELD

    // backing properties
    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null)
                _table = HashMap()
            return _table ?: throw AssertionError("Set to null by another thread")// multi thread works on _table
        }
}

