package rsk

fun main(args: Array<String>) {
    var kevin = Student(1, "Kevin")
    var jones = Student(1, "Kevin")

    println(kevin)

    if (kevin == jones) {
        println("Equal")
    } else {
        println("Not equal")
    }

    var newKevin = kevin.copy(name = "Robert")

    println(newKevin)
}

data class Student(val id: Int, val name: String) {

}