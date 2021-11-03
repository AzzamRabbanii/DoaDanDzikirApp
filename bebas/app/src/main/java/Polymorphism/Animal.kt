package Polymorphism

open class Animal {
    open fun sound(){
        println()
    }
}
class duck:Animal() {
    override fun sound(){
        println("suara bebek wekwekwek")
    }
}

class cat:Animal() {
    override fun sound(){
        println("suara kucing meow meow meow")
    }
}

fun main(){
    val hewan = Animal()
    val bebek = duck()
    val kucing = cat()

    hewan.sound()
    bebek.sound()
    kucing.sound()
}