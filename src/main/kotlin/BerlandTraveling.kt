private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    val amountOfCities = readInt()
    val selfiesRequiredPerCity = readInts()

    val trainTravels = selfiesRequiredPerCity.max()!!
    val visits = (trainTravels - 1).toBigInteger() * amountOfCities.toBigInteger() + (selfiesRequiredPerCity.lastIndexOf(trainTravels) + 1).toBigInteger()

    println(visits)
}