package days

import AdventOfCodeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class Day2Test : AdventOfCodeTest {

    private val day = Day2()
    private val input =
        """
            forward 5
            down 5
            forward 8
            up 3
            down 8
            forward 2
        """.trimIndent().split('\n')


    @Test
    override fun solvePart1Test() {
        assertEquals("150", day.solvePart1(input))
    }

    @Test
    override fun solvePart2Test() {

    }

}