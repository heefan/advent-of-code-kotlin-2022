import java.io.File

fun main() {
    var maxValue = 0
    var curValue = 0

    File("./day1.txt").useLines { lines ->
        lines.forEach {
            if(it.isBlank()) {
               maxValue = maxOf(maxValue, curValue)
               curValue = 0
            } else {
               curValue += it.toInt()
            }
        }}
    println(maxValue)
}
