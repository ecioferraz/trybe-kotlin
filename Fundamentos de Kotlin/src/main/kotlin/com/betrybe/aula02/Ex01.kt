package com.betrybe.aula02

fun main() {
    print("Digite seu salário atual: ")
    val salary = readln().toDouble()

    println("Seu novo salário é de R$ ${getNewSalary(salary)}")
}

fun getNewSalary(salary: Double) = (salary * 0.25) + salary
