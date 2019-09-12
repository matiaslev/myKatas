private fun readLn() = readLine()!!

fun main() {
    val input = readLn().split(" ")
    var number = input[0].toInt()
    var steps = input[1].toInt()
    
    while (steps != 0) {
        number = if (number % 10 != 0) {
            number - 1
        } else {
            number / 10
        }
        steps -= 1
    }

    println(number.toString())
}