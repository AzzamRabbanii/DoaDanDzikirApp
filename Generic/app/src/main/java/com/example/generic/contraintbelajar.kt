package com.example.generic
//parent class
open class Employed
//child class
class VicePresident: Employed()
//child class
class Manager: Employed()
//child class
class Company<T>(val Employed: T)

fun main(){
    val data1 = Company("hai aku orang indonesia")
    val data2 = Company(Manager())
    println(data1.Employed)
}

