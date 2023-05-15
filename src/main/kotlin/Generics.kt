fun main(args:Array<String>) {
    var names = listOf("Kevin","Alex")

    val name = names.itemAt(0)
    println(name)

    val n:Node<Int> = Node(3)
    println(n.value())
}

fun <T>List<T>.itemAt(index:Int): T{ //extension - will take a number which will be an index and return it
    return this[index]
}

//class Node<T>(private val item:T){
//    fun value():T{
//        return item
//    }
//}

class Node<T: Number>(private val item:T) { //constraining T to number
    fun value(): T {
        return item
    }
}