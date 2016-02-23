package chapter2.basic_types

/**
 * Created by snake
 * on 16/2/23.
 */
fun main(args: Array<String>) {
    literalStr()

    strTemplate()
}

fun literalStr() {
    // like java String
    val s = "Hello kotlin\n"

    // raw string
    val str =
            """
      select * from students
            where id  ....
    """

    println(s)

    println(str)
}

fun strTemplate() {
    val i = 10
    val s = "i = $i"
    println(s)

    val dollar = "$9.99"
    println(dollar)

    // represent a literal $ in raw string
    val rawDollar = """$9.99"""
    // val raw = """ ${'$'}9.99""" another way to represent $

    println(rawDollar)

    val price = "${'$'}9.99"
    println(price)
}
