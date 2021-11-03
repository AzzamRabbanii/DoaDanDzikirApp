package com.example.bebas

fun main(){
    val contoh = Hewan3("udin",0f,true,20)
    contoh.info()
    val kucing = Hewan3("caca", 3f,true,45)
    kucing.info()


}
class Hewan3(nama:String, berat:Float, berbulu: Boolean) {
    val name: String
    val weight: Float
    val berbulu: Boolean
    var umur:Int? = null

    init {
        this.name = nama
        this.weight = if (berat <= 0) 0.1f else berat
        this.berbulu = berbulu

    }
    constructor(nama:String, berat:Float, berbulu: Boolean, umur:Int): this(nama,berat,berbulu){
        this.umur = if (umur < 0) 0 else umur
    }

    fun info(){
        println("nama $name \nberat $weight \nHewan2 $berbulu \numur $umur")
    }
}