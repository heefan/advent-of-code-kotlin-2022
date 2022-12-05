fun main() {
    val input = readInput("input1")
    val day2 = Day1Ex2()

    check(day2.part1(input, handler)  == 69310)
    check(day2.part2(input, handler)  == 206104)
}

class Day1Ex2() {
    fun part1(input: List<String>, handler: (List<String>) -> List<Int>): Int {
        return handler(input).max()
    }

    fun part2(arg0: List<String>, handler: (arg1: List<String>) -> List<Int>): Int {
        return handler(arg0).sortedDescending().take(3).sum()
    }
}

val handler = { input: List<String> ->
    var sums = mutableListOf(0)
    input.forEach {
        if (it.isBlank()) {
            sums.add(0)
        } else {
            sums[sums.lastIndex] += it.toInt()
        }
    }
    sums
}