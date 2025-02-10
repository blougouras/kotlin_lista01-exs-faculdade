fun main() {
    println("Digite dois valores para serem usados como altura e largura de uma parede: ")
    val altura = readln().toInt()
    val largura = readln().toInt()

    val area = largura * altura
    val quantTinta = area / 2

    println("Para uma parede de $area m² serão necessários $quantTinta Litros")
}