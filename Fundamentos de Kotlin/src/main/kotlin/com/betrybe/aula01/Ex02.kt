package com.betrybe.aula01

/*
Escreva um programa que receba o salário base de um funcionário, calcule
e mostre o salário a receber, sabendo-se que o funcionário tem gratificação
de 5% sobre o salário base e paga imposto de 7% também sobre o salário base.
*/

fun main() {
    print("Digite o salário base: ")

    val salary = readln().toDouble()

    val taxes = getTaxes(salary)
    val bonus = getBonus(salary)

    println("O salário a receber é igual a ${salary + bonus - taxes}")
}

fun getBonus (salary: Double) = salary * 0.05

fun getTaxes (salary: Double) = salary * 0.07
