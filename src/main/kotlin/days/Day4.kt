package days

class Day4 : Day(4, "Giant Squid") {

    data class Board(
        val values: List<List<BingoNumber>>
    ) {
        fun hasWon(): Boolean {
            val hasAnyRowWon = values.any { row -> row.all { it.isMarked } }
            val hasAnyColumnWon = (0 until values.first().size).any { col ->
                values.all { row -> row[col].isMarked }
            }

            return hasAnyRowWon || hasAnyColumnWon
        }

        fun mark(draw: Int) {
            values.flatten()
                .filter { it.value == draw }
                .forEach { it.isMarked = true }
        }

        fun sumUnmarked(): Int =
            values.flatten().filterNot { it.isMarked }.sumOf { it.value }
    }

    data class BingoNumber(
        val value: Int,
        var isMarked: Boolean = false,
    )

    override fun solvePart1(input: List<String>): String {
        val draws = input.first().split(",").map(String::toInt)

        val boards = input
            .drop(2)
            .filter { it.isNotBlank() }
            .chunked(size = 5)
            .map { chunk ->
                Board(
                    values = chunk.map { bingoNumbers ->
                        bingoNumbers.split(" ").filter { it.isNotBlank() }.map {
                            BingoNumber(value = it.toInt())
                        }
                    }
                )
            }

        val (winningBoard, winningDraw) = draws.firstNotNullOfOrNull { draw ->
            boards.forEach { it.mark(draw) }
            boards.firstOrNull { it.hasWon() }?.let { it to draw }
        } ?: error("Aucun board gagnant trouvé")

        return (winningBoard.sumUnmarked() * winningDraw).toString()
    }

    override fun solvePart2(input: List<String>): String {
        // todo later
        return ""
    }
}