package br.edu.ifsp.scl.sdm.myapplication

fun processaTexto(str1: String, str2: String, processa: (String, String) -> String): String {
    return processa(str1, str2)
}

fun concatena(a: String, b: String): String {
    return "$a$b"
}

fun inverte(a: String, b: String): String {
    return a.reversed().plus(b.reversed())
}

fun <T> List<T>.paraCada(funcao: (T) -> T) : List<T> {
    return this.map(funcao)
}

fun List<String>.paraCadaString(funcao: (String) -> String): List<String> {
    return this.map(funcao)
}

fun primeiraLetra(str: String): String {
    return str.first().toString()
}

fun main() {
    println(processaTexto("Olá", "Mundo", ::concatena))
    println(processaTexto("Olá", "Mundo", ::inverte))
    println(processaTexto("Olá", "Mundo", { x, y -> x.toUpperCase() + y.toUpperCase() }))

    val listaNomes: List<String> = listOf("Pedro", "João", "Maria", "José")
    var listaPrimeiraLetra: List<String> = listaNomes.paraCadaString(::primeiraLetra)
    listaPrimeiraLetra.forEach(::println)
}