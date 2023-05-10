package rsk.kotlin

import rsk.java.Meeting
import rsk.java.Organizer
import java.util.*


fun main (args: Array<String>){
    val people: List<Person?> = listOf(Person(23), Person(31), Person(84), null)
    var totalAge = 0


    for (p in people!!.filterNotNull()) {
        totalAge += p.age
    }

    // only because it's mutable
    //people?.add(Person(32))

    for ( person in people!!){
        if(person != null)
            totalAge += person.age
    }

}

class Person(val age:Int) : Organizer {
    override fun processMeetings(meetings: MutableList<Meeting?>?) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}