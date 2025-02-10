fun main() {
    println("Quanto dinheiro você tem na carteira (R$): ")
    val reais = readln().toFloat()
    val dol = reais / 3.45

    println("Na atual cotação seus R$ $reais são convertidos para USD ${"%.2f".format(dol)}")
}