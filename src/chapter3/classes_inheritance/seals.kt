package chapter3.classes_inheritance

/**
 * Created by snake
 * on 16/2/25.
 */

fun main(args: Array<String>) {
    val d = eval(Expr.NotNumber)
    println(d)
}

/**
 * a sealed class is kind of extension of enum, but not actually the same
 * all subclasses of a sealed class must be nested inside it
 * while, the subs of subclasses can be placed in anywhere
 */
sealed class Expr {
    class Const(val n: Double) : Expr()
    class Sum(val x: Expr, val y: Expr) : Expr()
    object NotNumber : Expr()
}

/**
 * the best practice of sealed class is when expression,
 * if possible to verify all the types, no else is required
 */
fun eval(expr: Expr): Double =  when (expr) {
    is Expr.Const -> expr.n
    is Expr.Sum -> eval(expr.x) + eval(expr.y)
    Expr.NotNumber -> Double.NaN
}