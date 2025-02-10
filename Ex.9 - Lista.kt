fun main() {
    println("Digite uma distância em metros: ")
    val metros = readln().toFloat()
    val cm = metros * 100
    val mm = metros * 1000

    println("Distância de $cm cm")
    println("Distância de $mm mm")
}