package com.betrybe.aula01

/*
Escrever um programa que receba três números inteiros,
calcule e mostre a média aritmética simples entre os números.
*/

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número: ")
    val num3 = readln().toInt()

    println("A média aritmética simples é ${getAverage(num1, num2, num3)}")
}

fun getAverage(a: Int, b: Int, c: Int): Int = (a + b + c) / 3
