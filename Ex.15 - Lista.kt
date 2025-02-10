fun main() {
    println("Digite a quantidade de dias e km rodados com o carro: ")
    val dias = readln().toInt()
    val km = readln().toFloat()

    val valorTotal = (90 * dias) + (0.20 * km)
    println("O valor total para pagar pelo aluguel do carro é de R$$valorTotal")
}