fun main() {
    println("Digite sua nota: ")
    val nota1 = readln().toFloat()
    println("Digite sua nota: ")
    val nota2 = readln().toFloat()

    val media = (nota1 + nota2) / 2

    println("Nota 1: $nota1")
    println("Nota 2: $nota2")
    println("A média entre $nota1 e $nota2 é de $media")
}