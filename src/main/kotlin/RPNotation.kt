private fun readLn() = readLine()!!

fun main() {
    val input = readLn()
    println(solveRPN(input))
}

fun solveRPN(input: String): Int {
    val words = input.split(" ")
    return words.fold(
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
        }
    ).first()
}
