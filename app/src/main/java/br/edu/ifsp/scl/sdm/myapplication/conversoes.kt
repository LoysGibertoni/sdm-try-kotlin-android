package br.edu.ifsp.scl.sdm.myapplication

fun main() {
    val numString: String = 10.toString()
    val numDouble: Double = numString.toDouble()
    val numFloat: Float = numDouble.toFloat()
    val numInt: Int = numFloat.toInt()

    println(numInt.toString())

    val any: Any = "Any equivale a Object em java"
//    val string: String = any as String
    if (any is String) {
        println("$any: é uma String")
    }
}