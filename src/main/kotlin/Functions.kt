@file:JvmName("DisplayFunctions")//DisplayFunctions.log
fun main(args: Array<String>) {
    println(max(1,2))
    log("Logging")
    log(message ="Logging default")//named parameter
    log(logLevel = 4, message ="Logging default order different")//named parameter changing order

    val txt = "With    multiple  \t whitespaces"
    println(txt.replaceExtension())
}

//Default parameters
@JvmOverloads // to call default parameters
fun log(message:String,logLevel:Int = 1){
    println(message + logLevel)
}

fun max(a:Int,b:Int):Int = if(a>b) a else b

//Extension method
fun String.replaceExtension():String{ // no value passed in extension method- has a receiver =whatever string this is being called
    var regex =Regex("\\s+")
    return regex.replace(this," ")
}