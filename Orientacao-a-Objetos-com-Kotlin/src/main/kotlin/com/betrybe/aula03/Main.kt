package com.betrybe.aula03

import kotlin.math.pow

interface Form2D {
//    fun calcArea (): Double

    var area: Double
}

class Rectangle(val width: Double, val height: Double): Form2D {
    //    override fun calcArea(): Double = width * height

    override var area: Double
        get() = width * height
        set(value) {}
}

class Circle(val radius: Double): Form2D {
    //    override fun calcArea(): Double = Math.PI * radius.pow(2.0)

    override var area: Double
        get() = Math.PI * radius.pow(2.0)
        set(value) {}
}

fun main () {
    val rectangleArea = Rectangle(3.0, 5.0)
    val circleArea = Circle(10.0)

    println(rectangleArea.area)
    println(circleArea.area)
}