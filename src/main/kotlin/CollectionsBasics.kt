fun main(args:Array<String>){
    var people: List<Human?>? = null //we can assign null to it
    //people = listOf(Human(23),Human(45)) //cannot add to list
    people = mutableListOf(Human(23),Human(45)) //can add & remove to list
    people.add(Human(43))
    for(i in people.filterNotNull())println(i.age)

    val items=IntArray(2)
    items[0] = 1
    items[0] = 2

    val numers = intArrayOf(1,2,3,4,5)
    numers.forEachIndexed{index,element -> println("$index is $element")}
}
class Human(val age:Int){}