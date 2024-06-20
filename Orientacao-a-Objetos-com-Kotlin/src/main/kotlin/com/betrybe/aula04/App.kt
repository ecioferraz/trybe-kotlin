package com.betrybe.aula04

interface OnClickListener {
    fun onClick ()
}

//class Main {
//    init {
//        button.setOnClickListener(object: OnClickListener {
//            override fun onClick() {
//                TODO("Not yet implemented")
//            }
//        })
//    }
//}

class Me

object DBConn {
    var instance: Me? = null

    fun init (): Me? {
        if (instance === null) {
            instance = Me()
        }

        return instance!!
    }
}

enum class WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY
}

enum class Colors (val hex: String) {
    RED("FF0000"),
    GREEN("#00FF00"),
    BLUE("0000FF"),
    WHITE("#FFFFFF"),
    BLACK("#000000")
}

data class User (
    val name: String,
    val age: Int
)

fun main () {
    println(Colors.RED.hex)

    println(DBConn.init())
}