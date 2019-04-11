package br.edu.ifsp.scl.sdm.myapplication

fun main() {
    var nome: String?
    nome = null

    var sobrenome: String?
    sobrenome = null

    var sn: String
    sn = sobrenome ?: "Gibertoni"

    println(sobrenome?.capitalize())
    println(sobrenome?.length)
}