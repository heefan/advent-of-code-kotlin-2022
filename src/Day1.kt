fun main() {
    val input = readInputAsText("input1")

    check(part1(input) == 69310)
    check(part2(input) == 206104)
}

fun part1(input: String): Int = input
    .split("\n\n")
    .maxOf { it.split("\n").sumOf(String::toInt)}


fun part2(input: String): Int = input
    .split("\n\n")
    .map { it.split("\n").sumOf(String::toInt)}
    .sortedDescending()
    .take(3)
    .sum()