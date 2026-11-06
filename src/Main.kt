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
    exercicio5DetectorPrimos(35) // Teste com composto

    println("\n=== 6. O Menu Teimoso ===")
    exercicio6MenuTeimoso()

    println("\n=== 7. Pula-Obstáculos Numérico ===")
    exercicio7PulaObstaculos()

    println("\n=== 8. Cofre com Bloqueio Progressivo ===")
    exercicio8CofreBloqueio()
}

// 1. O Filtro de Vogais
// Percorre a palavra ignorando vogais minúsculas ou maiúsculas via 'continue'.
fun exercicio1FiltroVogais() {
    val palavra = "Universidade"
    val vogais = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    print("Consoantes encontradas: ")
    for (char in palavra) {
        if (char in vogais) {
            continue // Pula diretamente para a próxima iteração
        }
        print(char)
    }
    println()
}

// 2. O Primeiro Múltiplo Comum
// Encontra o menor múltiplo comum de 7 e 13 partindo de 1 e aborta o laço com 'break'.
fun exercicio2MultiploComum() {
    var numero = 1
    while (true) {
        if (numero % 7 == 0 && numero % 13 == 0) {
            println("Primeiro múltiplo comum entre 7 e 13: $numero")
            break // Interrompe a execução imediatamente
        }
        numero++
    }
}

// 3. Somador com Limite de Carga
// Soma valores de 1 a 100, pulando múltiplos de 10 e abortando caso o total passe de 500.
fun exercicio3SomadorComLimite() {
    var total = 0
    for (i in 1..100) {
        if (i % 10 == 0) {
            continue // Ignora múltiplos de 10
        }
        total += i
        if (total > 500) {
            println("Limite ultrapassado no número $i. Total acumulado: $total")
            break // Interrompe o laço ao exceder 500
        }
    }
    println("Valor final da variável total: $total")
}

// 4. Simulador de Caixa Eletrônico
// Deduz saques sucessivos de R$ 150,00 até saldo insuficiente.
fun exercicio4CaixaEletronico() {
    var saldo = 1000.0
    val valorSaque = 150.0

    while (true) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
            println("Saque de R$ %.2f realizado. Saldo restante: R$ %.2f".format(valorSaque, saldo))
        } else {
            println("Saldo Insuficiente! Saldo atual: R$ %.2f".format(saldo))
            break // Encerra a operação
        }
    }
}

// 5. Detecção de Números Primos
// Testa divisibilidade de 2 até (alvo - 1). Encontrando um divisor, interrompe com 'break'.
fun exercicio5DetectorPrimos(alvo: Int) {
    if (alvo <= 1) {
        println("O número $alvo não é primo.")
        return
    }

    var ehPrimo = true
    for (divisor in 2..<alvo) {
        if (alvo % divisor == 0) {
            ehPrimo = false
            break // Divisor encontrado: interrompe testes adicionais
        }
    }

    if (ehPrimo) {
        println("O número $alvo é primo.")
    } else {
        println("O número $alvo não é primo.")
    }
}

// 6. O Menu Teimoso
// Simula sequência de entradas (3 -> 1 -> 2 -> 0) demonstrando 'continue' e 'break'.
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
                continue // Retorna imediatamente ao início do laço
            }
            0 -> {
                println("Encerrando o programa.")
                break // Sai do laço
            }
            else -> println("Opção inválida.")
        }
    }
}

// 7. Pula-Obstáculos Numérico
// Itera de 1 a 50 pulando números terminados em 7 através do operador módulo (%).
fun exercicio7PulaObstaculos() {
    print("Sequência: ")
    for (numero in 1..50) {
        if (numero % 10 == 7) {
            continue // Pula números terminados em 7
        }
        print("$numero ")
    }
    println()
}

// 8. Cofre com Bloqueio Progressivo
// Limita as tentativas a 5. Se o usuário errar 3 vezes consecutivas, aciona bloqueio via 'break'.
fun exercicio8CofreBloqueio() {
    val senhaCorreta = 4321
    val tentativasUsuario = listOf(1111, 2222, 3333, 4321, 9999) // 3 falhas consecutivas
    var erros = 0

    for (tentativa in 1..5) {
        val senhaDigitada = tentativasUsuario[tentativa - 1]
        println("Tentativa $tentativa/5 - Digitado: $senhaDigitada")

        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido!")
            break // Encerra o laço com sucesso
        } else {
            erros++
            println("Senha incorreta!")

            if (erros == 3) {
                println("Cofre travado administrativamente")
                break // Bloqueia o cofre e aborta tentativas restantes
            }
        }
    }
}