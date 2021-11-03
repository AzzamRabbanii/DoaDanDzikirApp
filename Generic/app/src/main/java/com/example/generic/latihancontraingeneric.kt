package com.example.generic

import java.lang.reflect.Type

interface List<T>{
    operator fun get(index: Int): T
}
//untuk contraint type parameter
class ListNumber<T:Any>: List<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}

fun main(){
    val number = ListNumber<Int>()
    val number2 = ListNumber<Long>()
    val number3 = ListNumber<Short>()
    val number4 = ListNumber<String>()
    val number5 = ListNumber<Char>()

}
