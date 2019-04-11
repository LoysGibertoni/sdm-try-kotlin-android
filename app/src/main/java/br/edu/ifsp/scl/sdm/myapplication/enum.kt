package br.edu.ifsp.scl.sdm.myapplication

enum class TIPO_OPERACAO {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO
}

fun subtracao(a: Int, b: Int): Int {
    return a - b
}

fun operacao(op: TIPO_OPERACAO): (Int, Int) -> Int {
    val divisao: (Int, Int) -> Int = { x, y -> x / y }

    when (op) {
        TIPO_OPERACAO.SOMA -> return fun(a: Int, b: Int): Int = a + b
        TIPO_OPERACAO.SUBTRACAO -> return ::subtracao
        TIPO_OPERACAO.MULTIPLICACAO -> return { c: Int, d: Int -> c * d }
        TIPO_OPERACAO.DIVISAO -> return divisao
    }
}

fun executaOperacao(i: Int, j: Int, f: (Int, Int) -> Int): Int {
    return f(i, j)
}

fun main() {
    var acao: (Int, Int) -> Int = operacao(TIPO_OPERACAO.SOMA)
    val soma: Int = executaOperacao(20, 10, acao)
    println("Soma: $soma")

    acao = operacao(TIPO_OPERACAO.SUBTRACAO)
    println("Subtração: ${executaOperacao(20, 10, acao)}")

    println("Multiplicação: ${executaOperacao(20, 10, operacao(TIPO_OPERACAO.MULTIPLICACAO))}")

    println("Divisão: ${executaOperacao(20, 10, operacao(TIPO_OPERACAO.DIVISAO))}")
}