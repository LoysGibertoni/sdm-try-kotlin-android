package br.edu.ifsp.scl.sdm.myapplication

fun main() {
    var frase: String = "Hello, World!"

    println(frase)
    println("olha a frase: $frase")
    println("olha a frase: ${frase}")

    println("Quantidade de caracteres: ${frase.count()}")
    println("Quantidade de caracteres: ${frase.length}")
}