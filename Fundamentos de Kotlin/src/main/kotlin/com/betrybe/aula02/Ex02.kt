package com.betrybe.aula02

fun main() {
    print("Digite a altura do degrau: ")
    val stepHeight = readln().toDouble()

    print("Digite a altura a qual deseja chegar: ")
    val heightGoal = readln().toDouble()

    println("Você precisa subir ${getSteps(stepHeight, heightGoal)} degraus.")
}

fun getSteps(stepHeight: Double, heightGoal: Double) = heightGoal / stepHeight