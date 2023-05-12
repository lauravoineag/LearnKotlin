fun main(args:Array<String>):Unit{

    //create a list of meetings ; filter  the meetings with all that start with C and map the title so we end up with List of titles
    val meetings = listOf(Appointment(1,"Appt1"),Appointment(2,"Committe2"))
    val titles = meetings
        .asSequence()// each item is passed through the sequence - we filter we map for each ; without it we first filter all and then we map them - so less efficient
        .filter {it -> it.title.startsWith("C")}
        .map{ m -> m.title}
    for (t in titles) println(t)
    class Appointment (val id:Int, val title:String){
        val people = listOf(Someone("Sam"),Someone("Alex"))
    }
    data class Someone(val name:String){}
}
