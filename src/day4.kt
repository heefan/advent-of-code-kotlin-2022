// Dry run
// 1. Parse the input in the following,
// e.g
// 57-93,9-57
// 55-55,55-83
//
// sequence :
//  list:
//     set<int>:  [57, 58, …, 93]
//     set<int>:  [9, 10, …, 57]
//  list:
//      set<int>: [55]
//      set<int>: [55, 56, …, 83]
//
// 2. Compare the two sets if contain with each other.

fun main() {
    val input = readInputAsSequence("input4").take(1)

    check(part1(input) == 2)
    check(part2(input) == 4)
}

fun Sequence<String>.splitToSets(): Sequence<List<Set<Int>>> =
    map {
        it.split(',')
            .map {
                it.split('-')
                    .map(String::toInt)
                    .let { (a, b) -> (a..b).toSet() }
            }
    }

fun part1(input: Sequence<String>): Int = input
    .splitToSets()
    .count { (s1: Set<Int>, s2: Set<Int>) -> s1.containsAll(s2) || s2.containsAll(s1) }

fun part2(input: Sequence<String>): Int = input
    .splitToSets()
    .count { (s1: Set<Int>, s2: Set<Int>) -> s1.any(s2::contains) || s1.any(s2::contains) }

