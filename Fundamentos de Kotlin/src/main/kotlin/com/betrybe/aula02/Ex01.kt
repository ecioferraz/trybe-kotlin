package com.betrybe.aula02

/*
Escreva um programa em Kotlin que preencha dois arrays de dez elementos
numéricos cada um e mostre o o array resultante da intercalação deles.
 */

fun main() {
    val array1 = mutableListOf<Int>()
    val array2 = Array(10) { 0 }
    val array3 = Array(20) { 0 }

    for (i in 0 ..< 10) {
        print("Digite o valor do indice $i do array1: ")
        array1.add(readln().toInt())
    }

    for (i in array2.indices) {
        print("Digite o valor do indice $i do array2: ")
        array2[i] = readln().toInt()
    }

    var array1Index = 0
    var array2Index = 0

    for (i in array3.indices) {
        if (i % 2 == 0) {
            array3[i] = array1[array1Index]
            array1Index++
        } else {
            array3[i] = array2[array2Index]
            array2Index++
        }
    }

    array1.forEach { print("$it ") }
    println()
    array2.forEach { print("$it ") }
    println()
    array3.forEach { print("$it ") }
}
