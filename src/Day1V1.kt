
fun main() {
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

    val input = readInput("input1")
    val day1 = Day1V1()

    check(day1.part1(input) { handler(input) } == 69310)
    check(day1.part2(input) { handler(input) } == 206104)
}

typealias Day1V1Handler = (List<String>) -> List<Int>

class Day1V1 {
    fun part1(arg0: List<String>, handler: Day1V1Handler): Int {
        return handler(arg0).max()
    }

    fun part2(arg0: List<String>, handler: Day1V1Handler): Int {
        return handler(arg0).sortedDescending().take(3).sum()
    }
}

