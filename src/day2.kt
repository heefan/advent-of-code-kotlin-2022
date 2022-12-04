fun main() {
    val day2 = Day2()
    val input = readInput("input2")

    println(day2.part1(input))
    println(day2.part2(input))
}

class Day2 {

    fun part1(input: List<String>): Int {
        var score = 0

        input.forEach {
           score += when(it[0]) {
               'A' -> when(it[2]) {
                   'X' -> 1+3
                   'Y' -> 2+6
                   'Z' -> 3+0
                   else -> 0
               }
               'B' -> when(it[2]) {
                   'X' -> 1+0
                   'Y' -> 2+3
                   'Z' -> 3+6
                   else -> 0
               }
               'C' -> when(it[2]) {
                   'X' -> 1+6
                   'Y' -> 2+0
                   'Z' -> 3+3
                   else -> 0
               }
               else -> 0
           }
        }

        return score
    }


    fun part2(input: List<String>): Int {
        var score = 0
        input.forEach {
            score += when(it[0]) {
                'A' -> when(it[2]) {   //rock
                    'X' -> 3  // lose(0), scissors(3)
                    'Y' -> 4  // draw(3), rock(1)
                    'Z' -> 8  // win(6), paper(2)
                    else -> 0
                }
                'B' -> when(it[2]) {
                    'X' -> 1
                    'Y' -> 5
                    'Z' -> 9
                    else -> 0
                }
                'C' -> when(it[2]) {
                    'X' -> 2
                    'Y' -> 6
                    'Z' -> 7
                    else -> 0
                }
                else -> 0
            }
        }
        return score
    }
}