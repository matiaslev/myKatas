private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    val problemsListSize = readInt()
    val complexityList = readInts()

    if (complexityList.sorted().distinct().size > 2) {
        val firstThreeProblemsComplexity = complexityList.sorted().distinct().subList(0, 3)
        val firstComplexityValue = firstThreeProblemsComplexity.first() // position 0
        val secondComplexityValue = firstThreeProblemsComplexity[1] // position 1
        val thirtComplexityValue = firstThreeProblemsComplexity.last() // position 2

        if (firstComplexityValue < secondComplexityValue && secondComplexityValue < thirtComplexityValue) {
            val firstProblemPosition = complexityList.indexOf(firstComplexityValue) + 1
            val secondProblemPosition = complexityList.indexOf(secondComplexityValue) + 1
            val thirthProblemPosition = complexityList.indexOf(thirtComplexityValue) + 1
            println("$firstProblemPosition $secondProblemPosition $thirthProblemPosition")
        } else {
            println("-1 -1 -1")
        }
    } else {
        println("-1 -1 -1")
    }

}