package com.betrybe.aula02

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    val subtract = { x: Int, y: Int -> x - y }
    val multiply = { x: Int, y: Int -> x * y }
    val divide = { x: Int, y: Int -> x / y }

    println(operation(10, 5, sum))
    println(operation(10, 5, subtract))
    println(operation(10, 5, multiply))
    println(operation(10, 5, divide))

    val numbers = listOf(1, 2, 3, 4, 5)

    numbers
        .filter { it > 2 }
        .map { it * it }
        .forEach { println(it) }
}

fun operation(a: Int, b: Int, f: (Int, Int) -> Int) = f(a, b)
