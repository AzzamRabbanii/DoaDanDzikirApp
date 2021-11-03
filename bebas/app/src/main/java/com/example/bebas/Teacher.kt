package com.example.bebas

open class Teacher(name: String, email: String, val subject: String): Person(name,email) {
    fun specialsubject(){
        info()
        println("is a teacher who teaches subject $subject")
    }
}