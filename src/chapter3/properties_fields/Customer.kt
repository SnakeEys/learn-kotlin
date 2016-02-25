package chapter3.properties_fields

import kotlin.reflect.jvm.internal.impl.javax.inject.Inject

/**
 * Created by snake
 * on 16/2/25.
 */

fun main(args: Array<String>) {
    val customer = Customer("Jake", 14, 'M')
    displayCustomer(customer)
}

public class Customer public @Inject constructor(name: String, age: Int, gender: Char){
    // declaring properties, use var for mutable and val for immutable
    public var name: String = name
    public var age: Int = age
    public var gender: Char = gender
}

fun displayCustomer(customer: Customer) {
    println("name : ${customer.name}")
    println("age : ${customer.age}")
    println("gender: ${if (customer.gender == 'M') "Male" else "Female"}")
}

