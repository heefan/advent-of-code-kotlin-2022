
fun main() {
    val input = readInput("input1")
    val day1 = Day1V1()

    check(day1.part1(input, handler) == 69310)
    check(day1.part2(input, handler) == 206104)
}

typealias Day1V1Handler = (input: List<String>) -> List<Int>

class Day1V1 {
    fun part1(input: List<String>, handler: Day1V1Handler): Int {
        return handler(input).max()
    }

    fun part2(input: List<String>, handler: Day1V1Handler): Int {
        return handler(input).sortedDescending().take(3).sum()
    }
}

fun handler(input: List<String>): List<Int> {
    var sums = mutableListOf(0)
    input.forEach {
        if (it.isBlank()) {
            sums.add(0)
        } else {
            sums[sums.lastIndex] += it.toInt()
        }
    }
    return sums
}

