
interface Time{
    fun setTime(hours: Int, mins: Int,secs: Int = 0)
}
class YetiTime: Time{ //:
    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("Not yet implemented")
    }
}

abstract class Individual{
    var firstName: String = ""
    var lastName: String = ""
    open fun getName(): String = "$firstName $lastName"
}

class Pupil: Individual() {
    override fun getName(): String{return ""}
}