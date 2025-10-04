package days


class Day1 : Day(1, "Sonar Sweep") {
    override fun solvePart1(input: List<String>): String {
        return input
            .map(String::toInt)
            .windowed(size = 2) { it.last() - it.first() > 0 }
            .count { it }
            .toString()
    }

    override fun solvePart2(input: List<String>): String {
        return "TODO(Not yet implemented)"
    }
}