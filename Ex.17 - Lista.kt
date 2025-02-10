fun main() {
    println("Quantidade de cigarros fumados por dia: ")
    val cigarros = readln().toInt()
    println("Por quantos anos você fumou?: ")
    val anos = readln().toInt()

    val dias = anos * 365
    val cigarrosFumados = cigarros * dias

    val minutosPerdidos = cigarrosFumados * 10
    val diasPerdidos = minutosPerdidos / 1440

    println("Foram perdidos $diasPerdidos dias da vida de um fumante")
}