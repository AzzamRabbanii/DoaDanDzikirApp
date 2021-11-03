


class Function(val name:String) {

    fun <T> sayHello(params: T) {
        println("hello $params, my name is $name")
    }
}

fun main() {
    val fungsi = Function("azzam")
    fungsi.sayHello<String>("babsel")

}