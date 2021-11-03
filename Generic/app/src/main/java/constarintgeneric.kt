import kotlin.math.E

interface List2<T>{
    operator fun get(index: Int): T
}

class ListNumber<T: Any>: List<T>{
    override fun get(index: Int): T {
        return this[index]
    }

}

//fun main(){
    val number1 = ListNumber<Long>()
    val number2 = ListNumber<Int>()
    val number3 = ListNumber<String>()
    val number4 = ListNumber<String>()
    val number5 = ListNumber<Char>()
//}
//sebagai super class
open class Employed

//sebagai child class
class Manager: Employed()

class VicePresident: Employed()

class Company <T:Employed> (val Employed: T)

fun main(){
    val data1 = Company(Manager())
    val data2 = Company(VicePresident())
    val data3 = Company(Employed())
    }