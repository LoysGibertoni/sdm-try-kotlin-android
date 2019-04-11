package br.edu.ifsp.scl.sdm.myapplication

fun multiplo(a: Int = 10, b: Int = 2): Boolean = a %b == 0

//infix fun Int.multiplo(de: Int): Boolean {
//    return this % de == 0
//}

/* Extension function */
fun main() {
//    println(multiplo(1, 2))
//    println(10.multiplo(2))
//    println(10 multiplo 2)
    println(multiplo(b = 1))
}