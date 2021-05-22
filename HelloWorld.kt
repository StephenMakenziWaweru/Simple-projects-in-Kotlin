import kotlin.reflect.*

fun main(args: Array<String>) {
    val a = A()
    a::x.flip()
    println(a.x)
}

class A {
    var x = false
}

fun KMutableProperty0<Boolean>.flip() = set(!get())