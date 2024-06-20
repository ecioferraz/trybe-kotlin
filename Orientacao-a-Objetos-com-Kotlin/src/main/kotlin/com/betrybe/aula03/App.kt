package com.betrybe.aula03

abstract class Animal {
    abstract val race: String

    open fun eat () {
        println("Ate!")
    }
}

class Rabbit: Animal() {
    override val race: String
        get() = TODO("Not yet implemented")

    override fun eat() {
        TODO("Not yet implemented")
    }
}

class Cat: Animal() {
    override val race: String
        get() = TODO("Not yet implemented")
}

class Person (val name: String, var age: Int) {

    fun printName() {
        println(name)
    }

    fun printAge() {
        println(age)
    }

    fun ageUp() {
        age += 1
    }
}

fun main () {
    val me = Person("Écio Ferraz", 32)

    println(me.name)
    println(me.age)

    me.printAge()
    me.printName()

    me.ageUp()

    me.printAge()
}