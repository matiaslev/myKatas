


fun main() {
    fun foo(a: String): Int = a.toInt()
    fun bar(b: Int): Double = b.toDouble() * b.toDouble()

    val myFun = ::bar compose ::foo

    println(myFun("2"))
}

infix fun <IP, R, P1> ((IP) -> R).compose(f: (P1) -> IP): (P1) -> R {
    return { p1: P1 -> this(f(p1)) }
}