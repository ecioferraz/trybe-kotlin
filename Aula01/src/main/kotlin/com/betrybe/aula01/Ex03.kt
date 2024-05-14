package com.betrybe.aula01

import kotlin.math.pow

/*
Escreva um programa que receba a altura e o peso de uma pessoa,
calcule e mostre o IMC correspondente sabendo-se que o cálculo do IMC é
igual ao peso, em quilos, dividido pela altura, em metros, ao quadrado.
 */

fun main () {
    print("Digite a sua altura: ")
    val height = readln().toDouble()

    print("Digite o seu peso: ")
    val weight = readln().toDouble()

    println("Seu IMC é igual a ${getIMC(height, weight)}")
}

fun getIMC (height: Double, weight: Double) = weight / height.pow(2)
