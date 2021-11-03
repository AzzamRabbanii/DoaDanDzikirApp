package com.example.bebas

interface Binatang {
    fun play()
    fun eat()
    fun sleep()
    fun drink()
    fun walk()
    fun menghitung()
}

class cat2(): Binatang {
    override fun play() {
        println("buat have fun")
    }

    override fun eat() {
       println("buat makan")
    }

    override fun sleep() {
        println("buat tidur")
    }

    override fun drink() {
        println("buat minum")
    }

    override fun walk() {

    }

    override fun menghitung() {
        println("hewan mana bisa menghitung wkwkwk")
    }
}

fun main(){
    val kucing =cat2()
    kucing.play()
    kucing.eat()
    kucing.sleep()
    kucing.drink()
    kucing.walk()
    kucing.menghitung()

}
