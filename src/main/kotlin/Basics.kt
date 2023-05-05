import java.util.TreeMap

class Basics {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val q = Question()
            q.answer ="Try your best"
//            for (i in 1..10){
//                println(i)
//            }

            var numbers = listOf("Ana","Marie ")
            for (i in numbers){
                println(i)
            }

            var ages = TreeMap<String,Int>()
            ages["Kevin"] = 55
            ages["Sam"] = 24
            ages["Alex"] = 24
            ages["Harry"] = 26

            for((name,age) in ages){
                println("$name is $age")
            }

            for ((index,element) in numbers.withIndex()){
                println("$index is $element")
            }

        }
    }
}

class Question{
    var answer: String = ""
    val question: String = "What is the meaning of everything?"
}

