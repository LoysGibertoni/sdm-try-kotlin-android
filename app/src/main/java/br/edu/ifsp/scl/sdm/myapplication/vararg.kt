package br.edu.ifsp.scl.sdm.myapplication

fun multiplica(vararg numeros: Double): Double {
    if (numeros.isEmpty()) {
        return 0.0
    }
    return numeros.reduce { x, y -> x * y }
}

fun main() {
    println(multiplica(2.0, 3.0, 4.0, 5.0))

    val listaParametros: List<Double> = listOf(2.0, 3.0, 4.0, 5.0)
    println(multiplica(*listaParametros.toDoubleArray()))
}