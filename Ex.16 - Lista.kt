fun main() {
    println("Digite o número de dias trabalhados no mês: ")
    val dias = readln().toInt()
    val salary = (8 * 25) * dias

    println("O salário do funcionário pelos $dias trabalhados é de R$$salary")
}