fun main(args: Array<String>) {
    var program = Program()
    var total = 0
//    program.fibonacci(8)

    //Separating out the concerns - one piece of code that calculates Fibonacci no and
    //a strategy that is used to do something with that number

//    program.fibonacci(8, object : Process{ //takes in some implementation of process- define anonymous object to implement the interface Process - execute function
//        override fun execute(value: Int) { // and have that class implement the execute method- do somethig in execute method
//            println(value)
//        }
//    })

//    program.fibonacci(8) {n -> println(n)}
//    program.fibonacci(8) {println(it)}
//    program.fibonacci(8, ::println)

    program.fibonacci(8) {it -> total += it}

    println(total)

}

interface Process {
    fun execute(value: Int)
}

class Program {

    // 1, 1, 2, 3, 5, 8, 13
    //functional language

    fun fibonacci(limit: Int, action: (Int) -> Unit) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int, action: Process) { //pass in an implementation of the Process interface into the method
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action.execute(current) // this is strategy - pass in object to implement some algorithm, and the algorithm does something with the fibonacci number

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            println(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}