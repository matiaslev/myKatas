import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class A_Dice_Rolling_Test() {

    val listOfNumbers = mutableListOf<Int>()

    @Before
    fun populateList() {
        for (i in 2..101) {
            listOfNumbers.add(i)
        }
    }

    @Test
    fun kataTest() {
        // diceRolling(100, listOfNumbers).forEach { println(it) }
        assertEquals(3, diceRolling(1, listOf(9)).first())
        assertEquals(4 , diceRolling(1, listOf(11)).first())
    }

}