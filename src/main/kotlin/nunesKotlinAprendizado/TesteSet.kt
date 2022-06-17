package nunesKotlinAprendizado

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val uniao1E2 = funcionarios1.union(funcionarios2)
    uniao1E2.forEach { println(it) }

    println("////////////////////////////")
    val funcionarios3 = setOf(joao, pedro, maria)
    val subtracaoFuncionario3E2 = funcionarios3.subtract(funcionarios2)
    subtracaoFuncionario3E2.forEach { println(it) }

    println("////////////////////////////")
    val intersectFuncionario3E2 = funcionarios3.intersect(funcionarios2)
    intersectFuncionario3E2.forEach { println(it) }

}