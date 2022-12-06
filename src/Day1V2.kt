fun main() {
    val input = readInput("input1")
    val day2 = Day1V2()

    check(day2.part1(input, handler)  == 69310)
    check(day2.part2(input, handler)  == 206104)
}

typealias Handler =  (List<String>) -> List<Int>

class Day1V2() {
    fun part1(input: List<String>, handler: Handler) : Int {
        return handler(input).max()
    }

    fun part2(input: List<String>, handler: Handler): Int {
        return handler(input).sortedDescending().take(3).sum()
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