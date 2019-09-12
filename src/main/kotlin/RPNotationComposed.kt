private fun readLn() = readLine()!!

fun main() {
    val input = readLn()
    println(solveRPNComposed(input))
}

val solveRPNComposed = ::head compose ::foldl compose ::words

fun words(s: String): List<String> = s.split(" ")

fun foldl(listOfStrings: List<String>): List<Int> = listOfStrings.fold(
    mutableListOf(0),
    { acc, element ->
        when(element) {
            "+" -> {
                val firstNumber = acc.first()
                acc.removeAt(0)
                val secondNumber = acc.first()
                acc.removeAt(0)
                acc.add(0, secondNumber + firstNumber)
                acc
            }
            "-" -> {
                val firstNumber = acc.first()
                acc.removeAt(0)
                val secondNumber = acc.first()
                acc.removeAt(0)
                acc.add(0, secondNumber - firstNumber)
                acc
            }
            "*" -> {
                val firstNumber = acc.first()
                acc.removeAt(0)
                val secondNumber = acc.first()
                acc.removeAt(0)
                acc.add(0, secondNumber * firstNumber)
                acc
            }
            else -> {
                acc.add(0, element.toInt())
                acc
            }
        }
    })

fun head(listOfInts: List<Int>) = listOfInts.first()