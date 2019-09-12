fun main() {
    var name: String? = "sarasa"
    name?.run {
        getHello()
    }
    println(name)
}

fun getHello() = "Hello"