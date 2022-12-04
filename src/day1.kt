
fun main() {
    val day1 = Day1()
    val input = readInput("input1")

    check(day1.part1(input) { handler(input) } == 69310)
    check(day1.part2(input) { handler(input) } == 206104)
}

class Day1 {
    //todo:  How to avoid the duplicate declaration of the handling?
    fun part1(arg0: List<String>, handler: (arg1: List<String>) -> List<Int>): Int {
        return handler(arg0).max()
    }
    fun part2(arg0: List<String>, handler: (arg1: List<String>) -> List<Int>): Int {
        return handler(arg0).sortedDescending().take(3).sum()
    }
}

fun handler(input: List<String>) : List<Int> {
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