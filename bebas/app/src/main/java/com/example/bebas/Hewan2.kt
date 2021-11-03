package com.example.bebas
fun main(){
    val contoh = Hewan2("udin",0f,true,20)
    contoh.info()
}
class Hewan2(nama:String, berat:Float, berbulu: Boolean, umur:Int ) {
    val name: String
    val weight: Float
    val berbulu: Boolean
    val age: Int

    init {
        this.name = nama
        this.weight = if (berat <= 0) 0.1f else berat
        this.berbulu = berbulu
        this.age = if (umur < 0) 0 else umur
    }

    fun info(){
        println("nama $name \nberat $weight \nHewan2 $berbulu \numur $age")
    }
}