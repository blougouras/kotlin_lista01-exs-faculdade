fun main() {
    println("Qual é o seu nome: ")
    val name = readln()

    println("Qual é o seu Salário: ")
    val salary = readln().toFloat()

    println("Nome do Funcionário: $name| Salário: $salary")
    println("O funcionário $name tem um salário de R$ $salary em junho.")
}