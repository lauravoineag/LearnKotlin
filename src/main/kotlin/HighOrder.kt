
val action = {println("Hello")}
val calc ={x: Int, y: Int -> x * y}

fun main(args:Array<String>){
    doSmth(action)
}
fun doSmth(func:()->Unit){ //no param, returns void
    func()
}
