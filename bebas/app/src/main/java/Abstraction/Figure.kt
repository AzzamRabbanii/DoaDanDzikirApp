package Abstraction

 open abstract class Figure {
     var color: String? = "test"
    open abstract fun getArea(): Float
}

class Triangle(val base:Float,val height:Float): Figure(){
    override fun getArea(): Float {
        return 5f * (base * height)
    }
}

fun main(){
    val surface = Triangle(10f,16f)
    println(surface.getArea())
}