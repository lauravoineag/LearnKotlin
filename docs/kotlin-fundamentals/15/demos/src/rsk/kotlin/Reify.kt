package rsk.kotlin

//fun main(args: Array<String>) {
//    val names = listOf("Kevin")
//    printType(names)
//}
//
////fun <T> foo(value: Any) = value is T
//
//inline fun <reified T> foo(value: Any) = value is T
//
//fun printType(items: List<Any>) {
//
//    val names = items as List<String>
//
////    if(items is List<String>) {
////        println("We have strings")
////    }
//}

fun main(args: Array<String>) {

    val meetings = listOf(BoardMeeting(), FinanceMeeting())


}

inline fun <reified T> List<*>.typeOf(): List<T> {
    val returnList = mutableListOf<T>()
    for (item in this) {
        if (item is T) {
            returnList.add(item)
        }
    }

    return returnList;
}

fun <T : Meeting> buildMeeting(meetingClass: Class<T>, action: (T) -> Unit): T {
    val meeting: T = meetingClass.newInstance()
    action(meeting)
    return meeting
}

inline fun <reified T : Meeting> buildMeeting(noinline action: (T) -> Unit): T {
    return buildMeeting(T::class.java, action)
}

open class Meeting {
    fun attend() {

    }

}

class BoardMeeting : Meeting() {

}

class FinanceMeeting : Meeting() {
    var ChiefFinancialOfficer: String = "Jane Doe"
}