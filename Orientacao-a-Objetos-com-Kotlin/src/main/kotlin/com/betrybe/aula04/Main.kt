package com.betrybe.aula04

interface Notification {
    fun sendMessage (message: String)
}

open class EmailNotification: Notification {
    override fun sendMessage(message: String) {
        println("Enviando e-mail: $message")
    }
}

open class SMSNotification: Notification {
    override fun sendMessage(message: String) {
        println("Enviando SMS: $message")
    }
}

open class WhatsAppNotification: Notification {
    override fun sendMessage(message: String) {
        println("Enviando WhatsApp: $message")
    }
}

class NotificationSystem(val type: Notification): Notification  {
    override fun sendMessage(message: String) {
        this.sendMessage(message)
    }
}

class NotificationSystemDelegate (val type: Notification): Notification by type

fun main () {
//    val emailNotification = EmailNotification()
//
//    var notificationSystem = NotificationSystemDelegate(emailNotification)
//
//    notificationSystem.sendMessage("Um erro ocorreu")
//
//    val smsNotification = SMSNotification()
//
//    notificationSystem = NotificationSystemDelegate(smsNotification)
//
//    notificationSystem.sendMessage("Um erro ocorreu")
//
//    val whastAppNotification = WhatsAppNotification()
//
//    notificationSystem = NotificationSystemDelegate(whastAppNotification)
//
//    notificationSystem.sendMessage("Um erro ocorreu")

    val name: String by lazy {
        println("Olá")
        "Écio"
    }

    println(name)
    println(name)
}