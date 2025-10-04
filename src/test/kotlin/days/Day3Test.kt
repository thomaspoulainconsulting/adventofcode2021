package days

import AdventOfCodeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class Day3Test : AdventOfCodeTest {

    private val day = Day3()
    private val input =
        """
            00100
            11110
            10110
            10111
            10101
            01111
            00111
            11100
            10000
            11001
            00010
            01010
        """.trimIndent().split('\n')


    @Test
    override fun solvePart1Test() {
        assertEquals("198", day.solvePart1(input))
    }

    @Test
    override fun solvePart2Test() {
    }
}