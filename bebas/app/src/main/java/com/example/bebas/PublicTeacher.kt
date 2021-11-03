package com.example.bebas

class PublicTeacher(name:String,email:String,subject:String,val school:String):
Teacher(name,email,subject){
    fun school(){
        specialsubject()
        println("teaching at $school as a public teacher")
    }
}