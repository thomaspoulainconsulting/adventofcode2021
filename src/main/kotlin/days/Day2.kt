package days

import kotlin.math.absoluteValue

class Day2 : Day(2, "Dive!") {

    enum class Direction(val value: String) {
        FORWARD("forward"),
        UP("up"),
        DOWN("down"),
    }

    override fun solvePart1(input: List<String>): String {
        var x = 0
        var y = 0

        input.forEach {
            val (direction, value) = it.split(" ")
            when (direction) {
                Direction.FORWARD.value -> {
                    x += value.toInt()
                }

                Direction.UP.value -> {
                    y += value.toInt()
                }

                Direction.DOWN.value -> {
                    y -= value.toInt()
                }
            }
        }

        return (x * y).absoluteValue.toString()
    }

    override fun solvePart2(input: List<String>): String {
        var x = 0
        var y = 0
        var aim = 0

        input.forEach {
            val (direction, value) = it.split(" ")
            when (direction) {
                Direction.FORWARD.value -> {
                    x += value.toInt()
                    y += value.toInt() * aim
                }

                Direction.UP.value -> {
                    aim -= value.toInt()
                }

                Direction.DOWN.value -> {
                    aim += value.toInt()
                }
            }
        }

        return (x * y).absoluteValue.toString()
    }
}