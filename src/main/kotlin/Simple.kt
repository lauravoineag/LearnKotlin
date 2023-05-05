class Simple(var Name:String) {
    fun display(){
        println("Display:$Name")
    }

    fun lambdaDisplay(func: (s: String) -> Unit) {
        func(Name)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val s = Simple("Kayo")
            s.lambdaDisplay(::printName)
        }
        fun printName(name:String){
            println(name)
        }
    }
}
