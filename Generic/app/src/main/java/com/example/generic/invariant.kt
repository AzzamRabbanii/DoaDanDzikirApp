package com.example.generic

class InvariantType<T> (val data: T)

fun main(){
    val data1 : InvariantType<String> = InvariantType("kosong")
    val data2 = InvariantType("bapak ")
}