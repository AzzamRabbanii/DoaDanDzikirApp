package com.example.generic

class Covariant<out T>(val data: T){
    fun data(): T{
        return data
    }
}

fun main(){
    val covariant1 : Covariant<String> = Covariant("btr")
    val covariant2 : Covariant<Any> = Covariant(23)

    println(covariant1.data)
}

