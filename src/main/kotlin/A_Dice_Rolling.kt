private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()

fun main() {
    val queries = readInt()
    val listOfNumbers = mutableListOf<Int>()

    for (i in 1..queries) {
        listOfNumbers.add(readInt())
    }

    println(diceRolling(queries, listOfNumbers).joinToString("\n"))
}

fun diceRolling(queries: Int, input: List<Int>): List<Int> {
    val rta = mutableListOf<Int>()

    for (i in 0..queries-1) {
        rta.add(algorithm(input[i]))
    }

    return rta
}

fun algorithm(number: Int): Int {
    return when {
        number % 7 == 0 -> return number / 7
        number % 6 == 0 -> return number / 6
        number % 5 == 0 -> return number / 5
        number % 4 == 0 -> return number / 4
        number % 3 == 0 -> return number / 3
        number % 2 == 0 -> return number / 2
        else -> {
            1 + algorithm(number - 2)
        }
    }
}
