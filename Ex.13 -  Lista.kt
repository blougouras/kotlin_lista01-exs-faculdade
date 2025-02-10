fun main() {
    println("Valor do Produto: ")
    val valor = readln().toFloat()
    val desc = valor * 0.05
    val valorDescontado = valor - desc

    println("O valor do produto com o desconto de 5% é de R$$valorDescontado")
}