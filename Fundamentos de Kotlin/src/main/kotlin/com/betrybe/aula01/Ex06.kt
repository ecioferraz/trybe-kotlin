package com.betrybe.aula01

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toDouble()

    print("Digite o segundo número: ")
    val num2 = readln().toDouble()

    println("O número maior é ${getBiggerNum(num1, num2)}")
}

fun getBiggerNum(num1: Double, num2: Double) = if (num1 > num2) num1 else num2