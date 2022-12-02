import java.io.File
import kotlin.*

fun main() {
    var calorieCount = mutableListOf(0)

    File("resources/day1.txt").useLines { lines ->
        lines.forEach {
            if(it.isBlank()) {
               calorieCount.add(0)
            } else {
               calorieCount[calorieCount.lastIndex] += it.toInt()
            }
        }}
    println(calorieCount.max())
    println(calorieCount.sortedDescending().take(3).sum())
}
