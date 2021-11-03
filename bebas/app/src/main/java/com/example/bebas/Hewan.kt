package com.example.bebas

fun main(){
    val kucing = Hewan("mici", 1.5F,true)
    kucing.tidur()
    kucing.makan()
    kucing.karpet()

}

class Hewan(val nama:String, val berat:Float, val berbulu: Boolean){
    fun makan(){
        println("$nama sedang makan untuk menambah berat badannya")}
    fun tidur(){
        println("$nama sedang tidur untuk merawat bulunya")}
    fun karpet(){
        println("ada bulu nya $berbulu")
    }





}