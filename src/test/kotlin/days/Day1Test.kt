package days

import AdventOfCodeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test : AdventOfCodeTest {

    private val day = Day1()
    private val input =
        """
            199
            200
            208
            210
            200
            207
            240
            269
            260
            263
        """.trimIndent().split('\n')


    @Test
    override fun solvePart1Test() {
        assertEquals("7", day.solvePart1(input))
    }

    @Test
    override fun solvePart2Test() {
    }

}