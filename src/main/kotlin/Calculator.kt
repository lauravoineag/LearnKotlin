//Strategy pattern - chose the location to output to when we run the code
class Calculator(output:Result) {
    fun add(a: Int, b: Int): Int {
        return 0
    }
    //when it wants to output a result, it can output through interface
}

interface Result{
    fun write(answer:Int)

}

class NullResult:Result{
    override fun write(answer: Int){
    }
}