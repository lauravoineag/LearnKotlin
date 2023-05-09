interface Signatory{
    fun sign()
}

class Student(name: String,age: Int):Person(name,age)

data class User(val name:String, val id:Int)

open class Person (val name:String, var age:Int, var isMarried: Boolean = false):Signatory {
    init {
        if (name == "Kevin" && age > 54) throw Exception("Invalid")//runs first
    }
    override fun sign() = println("$name id $age and can sign and their marital status is $isMarried")
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person("Kevin", 24) //creating an instance
            p.sign()
            p.age = 36
            p.sign()
            val kevin = User("Kevin",1)
            println(kevin)//data class - calls the toString to Kevin - prints out identifier for Kevin
            val(name,id)=kevin
            println("User is $name and has $id")//data class - deconstruction
            val otheruser =kevin.copy(id =2)//data class - copy
            println(otheruser)
        }
    }
}








