import java.io.FileReader
import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    var reader = FileReader("filename")

    try {
        reader.read()
    } catch(e :IOException) {

    } finally {

    }

}

fun ranges() {
    var numbers = listOf(1, 2, 3, 4, 5)

    for (i in numbers) {
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for ((name, age) in ages) {
        println("$name is $age")
    }

    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    var range = 'a'..'z'
}

class Question {
    var Answer:String? = null
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }

    fun printResult(){
        when (Answer) {
            CorrectAnswer -> println("You were correct")
            else -> println("Try again?")
        }
    }
}

fun useQuestion() {
    println("Hello, World")
    val q:Question = Question()
//    q = Question()


    q.Answer = "Four"
    //q.Question = ""

    q.display()

    println("The answer to the question ${q.Question} is ${q.Answer}")

    val message = if(q.Answer == q.CorrectAnswer) {
        "You were correct"
    } else {
        "Try again?"
    }

    println(message)

    q.printResult()

    val number:Int? = try {
        Integer.parseInt(q.Answer)
    } catch(e:NumberFormatException) {
        null
    }

    println("Number is $number")
}

