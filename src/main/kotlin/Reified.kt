fun main(args:Array<String>){
    val meeteings = listOf(BoardMeeting(),FinanceMeeting())

    val board = meeteings.typeOf<BoardMeeting>() //I want to filter the list based on that type
    println(board.count())
}

inline fun <reified T> List<*>.typeOf() : List<T>{
    val returnList = mutableListOf<T>()
    for(item in this){
        if(item is T){ //now we can use item inside the list - we can check the type at runtime
            returnList.add(item)
        }
    }
return returnList
}
        //function of type T - extension function of list of any - use star (I just want a list here, don't care type
        //call the function typeOf which will return a list of some type - so T
        // this - is the incomming list

open class Meeteeing{

}

class BoardMeeting: Meeteeing() {

}

class FinanceMeeting: Meeteeing() {

}