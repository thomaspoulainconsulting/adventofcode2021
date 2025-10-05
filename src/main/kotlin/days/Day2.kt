package days

import kotlin.math.absoluteValue

class Day2 : Day(2, "Dive!") {

    enum class Direction {
        FORWARD,
        UP,
        DOWN,
    }

    override fun solvePart1(input: List<String>): String {
        var x = 0
        var y = 0

        input
            .forEach {
            val (direction, value) = it.split(" ")
            when (Direction.valueOf(direction.uppercase())) {
                Direction.FORWARD -> x += value.toInt()
                Direction.UP -> y += value.toInt()
                Direction.DOWN -> y -= value.toInt()
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
            when (Direction.valueOf(direction.uppercase())) {
                Direction.FORWARD -> {
                    x += value.toInt()
                    y += value.toInt() * aim
                }

                Direction.UP -> {
                    aim -= value.toInt()
                }

                Direction.DOWN -> {
                    aim += value.toInt()
                }
            }
        }

        return (x * y).absoluteValue.toString()
    }
}