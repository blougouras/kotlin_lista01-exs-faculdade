fun main() {
    println("Digite o salário de um funcionário: ")
    val salary = readln().toFloat()
    val aumento = salary * 0.15

    val newSalary = salary + aumento

    println("O valor de seu novo salário com o aumento de 15% é de R$$newSalary")
}