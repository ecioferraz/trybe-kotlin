package com.betrybe.aula01

fun main() {
    print("Digite a primeira nota: ")
    val grade1 = readln().toDouble()

    print("Digite a segunda nota: ")
    val grade2 = readln().toDouble()

    print("Digite a terceira nota: ")
    val grade3 = readln().toDouble()

    val average = getAverage(grade1, grade2, grade3)

    if (average >= 0 && average < 3) {
        println("REPROVADO")
    } else if (average >= 3 && average < 7) {
        println("EXAME")
    } else {
        println("APROVADO")
    }
}

fun getAverage(grade1: Double, grade2: Double, grade3: Double) = (grade1 + grade2 + grade3) / 3