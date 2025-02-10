fun main() {
    println("Valores A, B, C: ")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val delta = (b * b)-(4 * a * c)

    println("O valor do delta é de $delta")
}