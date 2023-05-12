fun main(args:Array<String>):Unit{
    val ints = listOf(1,2,3,4,5)

    val smallInts = ints.filter { it < 4}
    for (i:Int in smallInts) println(i)

    val squareInts =ints.map {it * it}
    for (i:Int in squareInts) println(i)

    val smallSquaredInts = ints
        .filter { it < 5}
        .map{ it * it }
    for(i:Int in smallSquaredInts) println(i)

    val appointments = listOf(Appointment(1,"Appt1"),Appointment(2,"Committe2"))

    var ppl: List<Someone> =appointments
        //.flatMap{it -> it.people}
        .flatMap(Appointment::people)
        .distinct()
    for (p in ppl) println(p.name)

    val titles:List<String> = appointments
        .filter {it -> it.title.startsWith("C")  }
        .map{ m -> m.title}
    for (t in titles) println(t)
}

class Appointment (val id:Int,val title:String){
    val people = listOf(Someone("Sam"),Someone("Alex"))
}

data class Someone(val name:String){}

