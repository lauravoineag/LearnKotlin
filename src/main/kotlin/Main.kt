interface Signatory{
    fun sign()
}
open class Person (val name:String, var age:Int, var isMarried: Boolean = false):Signatory{

    init{
        if(name == "Kevin" && age > 54) throw Exception("Invalid")//runs first
    }
    override fun sign() = println("$name id $age and can sign and their marital status is $isMarried")
}

fun main(args: Array<String>) {
    val p = Person("Kevin",24) //creating an instance
    p.sign()
    p.age=36
    p.sign()
}

class Student(name: String,age: Int):Person(name,age)






