fun main(args:Array<String>){
    val h1 = Header("H1")
    val h2 = Header("H2")
    val h3 = h1.plus(h2)
    println(h3.Name)
    val h4 = h1 add h2
    println(h4.Name)

    val h5 = h1 + h2
    println(h5.Name)
}

class Header(var Name:String){}

operator fun Header.plus(other:Header):Header{ //extension method /operator overloading - I can use the plus symbol rather than name plus or add or put together
    return Header(this.Name + other.Name)
}
infix fun Header.add(other:Header):Header { //using infix
    return Header(this.Name + other.Name)
}
