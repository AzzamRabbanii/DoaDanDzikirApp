package com.example.generic
//parentclass
abstract class Vehicle(wheel: Int)
//childclass
class Car(speed: Int): Vehicle(4)
//childclass
class MotorCycle(speed: Int): Vehicle(2)

fun main(){
    val mobil = Car(200)
    val motor = MotorCycle(100)
    var vehicle : Vehicle = mobil
    vehicle = motor
}