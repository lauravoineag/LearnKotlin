@file:JvmName("DisplayFunctions")

package rsk

fun main(args: Array<String>) {
    log(message = "Hello, World")
}

@JvmOverloads
fun log(message: String, loglevel: Int = 1)  {
    println(message + loglevel)
}


