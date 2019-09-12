private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints


fun main()
{
    val days = readInt()
    val numberOfVisits = readInts()

    var count = 0

    var firstGreatestNumberOfVisits = 0
    var secondGreatestNumberOfVisits = 0

    for (i in 0 until days) {
        when {
            numberOfVisits[i] > firstGreatestNumberOfVisits -> {
                secondGreatestNumberOfVisits = firstGreatestNumberOfVisits
                firstGreatestNumberOfVisits = numberOfVisits[i]
            }
            numberOfVisits[i] > secondGreatestNumberOfVisits -> secondGreatestNumberOfVisits = numberOfVisits[i]
            (numberOfVisits[i] < firstGreatestNumberOfVisits) && (numberOfVisits[i] < secondGreatestNumberOfVisits) -> count += 1
        }
    }


    println(count)
}
