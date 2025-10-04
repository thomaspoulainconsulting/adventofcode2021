package days

import kotlin.collections.count


class Day1 : Day(1, "Sonar Sweep") {
    override fun solvePart1(input: List<String>): String {
        return input
            .map(String::toInt)
            .zipWithNext()
            .count { (a, b) -> b > a }
            .toString()
    }

    override fun solvePart2(input: List<String>): String {
        return input
            .map(String::toInt)
            .windowed(size = 3) {
                it[0] + it[1] + it[2]
            }
            .zipWithNext()
            .count { (a, b) -> b > a }
            .toString()
    }
}