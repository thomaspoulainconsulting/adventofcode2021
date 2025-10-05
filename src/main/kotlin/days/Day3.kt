package days

class Day3 : Day(3, "Binary Diagnostic") {
    override fun solvePart1(input: List<String>): String {
        val gammaRate = buildString {
            for (i in 0 until input.first().length) {
                var zeros = 0
                var ones = 0
                for (j in 0 until input.size) {
                    if (input[j][i] == '0') zeros++
                    else ones++
                }
                if (zeros > ones) append("0")
                else append("1")
            }
        }

        val epsilonRate = gammaRate
            .map { if (it == '0') "1" else "0" }
            .joinToString("").toInt(radix = 2)

        val realGamma = gammaRate.toInt(radix = 2)

        return (realGamma * epsilonRate).toString()
    }

    override fun solvePart2(input: List<String>): String {
        TODO("Not yet implemented")
    }
}