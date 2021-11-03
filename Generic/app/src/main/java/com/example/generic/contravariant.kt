package com.example.generic

class Contravariant<in T>{
    fun sayhello(name: T){
        print("hello $name")
    }
}

fun main(){
    val datasatu:Contravariant<Any> = Contravariant()
    val datadua:Contravariant<String> = datasatu

    datadua.sayhello("azzam")
}
