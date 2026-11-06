fun main() {
    println("=== 1. O Filtro de Vogais ===")
    exercicio1FiltroVogais()

    println("\n=== 2. O Primeiro Múltiplo Comum ===")
    exercicio2MultiploComum()

    println("\n=== 3. Somador com Limite de Carga ===")
    exercicio3SomadorComLimite()

    println("\n=== 4. Simulador de Caixa Eletrônico ===")
    exercicio4CaixaEletronico()

    println("\n=== 5. Detecção de Números Primos ===")
    exercicio5DetectorPrimos(29)
    exercicio5DetectorPrimos(35)

    println("\n=== 6. O Menu Teimoso ===")
    exercicio6MenuTeimoso()

    println("\n=== 7. Pula-Obstáculos Numérico ===")
    exercicio7PulaObstaculos()

    println("\n=== 8. Cofre com Bloqueio Progressivo ===")
    exercicio8CofreBloqueio()

    println("\n=== Demonstração de Manipulação com Label (@loop) ===")
    exemploComLabel()
}

// 1. O Filtro de Vogais
fun exercicio1FiltroVogais() {
    val palavra = "Universidade"
    val vogais = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    print("Consoantes encontradas: ")
    for (char in palavra) {
        if (char in vogais) {
            continue
        }
        print(char)
    }
    println()
}

// 2. O Primeiro Múltiplo Comum
fun exercicio2MultiploComum() {
    var numero = 1
    while (true) {
        if (numero % 7 == 0 && numero % 13 == 0) {
            println("Primeiro múltiplo comum entre 7 e 13: $numero")
            break
        }
        numero++
    }
}

// 3. Somador com Limite de Carga
fun exercicio3SomadorComLimite() {
    var total = 0
    for (i in 1..100) {
        if (i % 10 == 0) {
            continue
        }
        total += i
        if (total > 500) {
            println("Limite ultrapassado no número $i. Total acumulado: $total")
            break
        }
    }
    println("Valor final da variável total: $total")
}

// 4. Simulador de Caixa Eletrônico
fun exercicio4CaixaEletronico() {
    var saldo = 1000.0
    val valorSaque = 150.0

    while (true) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
            println("Saque de R$ $valorSaque realizado. Saldo restante: R$ $saldo")
        } else {
            println("Saldo Insuficiente! Saldo atual: R$ $saldo")
            break
        }
    }
}

// 5. Detecção de Números Primos
fun exercicio5DetectorPrimos(alvo: Int) {
    if (alvo <= 1) {
        println("O número $alvo não é primo.")
        return
    }

    var ehPrimo = true
    for (divisor in 2..<alvo) {
        if (alvo % divisor == 0) {
            ehPrimo = false
            break
        }
    }

    if (ehPrimo) {
        println("O número $alvo é primo.")
    } else {
        println("O número $alvo não é primo.")
    }
}

// 6. O Menu Teimoso
fun exercicio6MenuTeimoso() {
    val entradasSimuladas = listOf(3, 1, 2, 0)
    var indice = 0

    while (true) {
        val opcao = entradasSimuladas[indice++]
        println("Opção escolhida: $opcao")

        when (opcao) {
            1, 2 -> {
                println("Processando...")
            }
            3 -> {
                println("Módulo em manutenção")
                continue
            }
            0 -> {
                println("Encerrando o programa.")
                break
            }
            else -> println("Opção inválida.")
        }
    }
}

// 7. Pula-Obstáculos Numérico
fun exercicio7PulaObstaculos() {
    print("Sequência: ")
    for (numero in 1..50) {
        if (numero % 10 == 7) {
            continue
        }
        print("$numero ")
    }
    println()
}

// 8. Cofre com Bloqueio Progressivo
fun exercicio8CofreBloqueio() {
    val senhaCorreta = 4321
    val tentativasUsuario = listOf(1111, 2222, 3333, 4321, 9999)
    var erros = 0

    for (tentativa in 1..5) {
        val senhaDigitada = tentativasUsuario[tentativa - 1]
        println("Tentativa $tentativa/5 - Digitado: $senhaDigitada")

        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido!")
            break
        } else {
            erros++
            println("Senha incorreta!")

            if (erros == 3) {
                println("Cofre travado administrativamente")
                break
            }
        }
    }
}

// Demonstração de Labels (@loopMatriz)
fun exemploComLabel() {
    println("Buscando coordenada específica em matriz 3x3...")
    loopMatriz@ for (linha in 1..3) {
        for (coluna in 1..3) {
            println("Testando posição: linha $linha, coluna $coluna")
            if (linha == 2 && coluna == 2) {
                println("Alvo encontrado na posição (2, 2)! Abortando todos os laços com break@loopMatriz.")
                break@loopMatriz
            }
        }
    }
}