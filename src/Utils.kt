import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

fun readInput(name: String) = File("input", "$name.txt")
    .readLines()

fun readInputAsText(name: String) = File("input", "$name.txt")
    .readText()

fun readInputAsSequence(name: String) = File("input", "$name.txt")
    .bufferedReader()
    .lineSequence()

fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')