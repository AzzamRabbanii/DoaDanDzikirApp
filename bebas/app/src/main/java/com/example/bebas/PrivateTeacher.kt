package com.example.bebas

class PrivateTeacher(name: String,email: String,subject: String,val student: Int):
    Teacher(name,email,subject){
        fun capacity(){
            specialsubject()
            println("as a private teacher able to teach $student student.")
        }
}