package br.edu.ifsp.scl.sdm.myapplication

fun processaInteiro(i: Int, f: (Int) -> Int): Int {
    return f(i)
}

fun processaInteiro(i: Int, j: Int, f: (Int, Int) -> Int): Int {
    return f(i, j)
}

fun soma(i: Int, j: Int): Int {
    return i + j
}

fun multiplicacao(i: Int, j: Int): Int {
    return i * j
}

fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero) {
            return n
        }
    }
    return -1
}

fun main() {
    println(processaInteiro(10, 20, ::soma))
    println(processaInteiro(10, 20, ::multiplicacao))
    println(processaInteiro(16, ::raizQuadrada))

    println(processaInteiro(10, 20, { i, j -> i + j }))
    println(processaInteiro(10, 20, { i, j -> i * j }))
    println(processaInteiro(16) {
        for (n in 1..it) {
            if (n * n == it) {
                return@processaInteiro n
            }
        }
        return@processaInteiro -1
    })
}