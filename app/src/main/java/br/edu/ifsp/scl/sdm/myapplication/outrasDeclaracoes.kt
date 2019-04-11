package br.edu.ifsp.scl.sdm.myapplication

fun main() {
    val listaNomes: List<String> = listOf("Loys", "Jaque", "Milex")

    for (nome in listaNomes) {
        println(nome)
    }

    val listaInteiros: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i in 0..9 step 2) {
        println(listaInteiros[i])
    }

    val listaCursos: MutableList<String> = mutableListOf("SDM", "ADS")
    listaCursos.add("TII")

    // LAMBDA
    listaCursos.forEach { println(it) }

    exercicio1()
    exercicio2()
}

fun exercicio1() {
    val listaCursos: MutableList<String> = mutableListOf(
            "Sistemas para Dispositivos Móveis",
            "Análise e Desenvolvimento de Sistemas"
    )

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    listaCursos.filter { it.contains("Sistemas") }
            .forEachIndexed { index, curso -> println("$index - $curso") }

    println("Set e MutableSet")
    val setCursos: MutableSet<String> = mutableSetOf("ADS", "SDM", "TII")
    setCursos.add("ADS")
    setCursos.add("SDM")
    setCursos.add("TMA")

    setCursos.forEach { println(it) }

    println("Map e MutableMap")
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Alcedir"), Pair("Mãe", "Cleusa"))
    familiaMap.put("Filho", "Loys")
    familiaMap.put("Gato", "Mimi")
    familiaMap.put("Cachorro", "Mel")

    familiaMap.forEach { pair -> println("${pair.key}: ${pair.value}") }
}

fun exercicio2() {
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Pedro"))
    familiaMap.put("Mãe", "Marcela")
    familiaMap.put("Filho", "João")
    familiaMap.put("Caçula", "Cadu")
    familiaMap.put("Pet", "Paçoca")

    familiaMap.forEach { parentesco, nome -> println("$parentesco: $nome") }

    fun percorreMap(par: Map.Entry<String, String>) {
        println("${par.key}: ${par.value}")
    }
    familiaMap.forEach(::percorreMap)

    val percorreMap: (String, String) -> Unit = fun (k: String, v: String) = println("$k: $v")
    familiaMap.forEach(percorreMap)
}