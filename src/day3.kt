fun main() {
    val input = readInput("input3")

    check(part1(input.take(1)) == 12)
    check(part1(input) == 8233)

    check(part2(input.take(3)) == 52)
    check(part2(input) == 2821)
}

val dict = (('a'..'z') + ('A'..'Z'))
    .withIndex()
    .associate { (i, c) -> c to i + 1 }

fun part1(input: List<String>): Int = input
    .map { s -> s.chunked(s.length / 2, CharSequence::toSet) }
    .map { it.reduce(Set<Char>::intersect).single() }
    .sumOf { dict[it]!! }

fun part2(input: List<String>): Int = input
    .chunked(3) { it.map(String::toSet) }
    .map { it.reduce(Set<Char>::intersect).single() }
    .sumOf { dict[it]!! }