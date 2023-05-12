
fun main(args:Array<String>){}

class Course(val id:Int, val title: String){}

object Courses{
    var allCourses = arrayListOf<Course>()
    fun initialize(){
        allCourses.add(Course(1,"Kotlin"))
    }
}

class Gakusei(){
    fun enrole(courseName:String){
        var course = Courses.allCourses //go to allCourses singleton use its allCourses property
            .filter {it.title == courseName}//look for a course with courseName
            .firstOrNull()//and return me one if you can't find one return null
    }

}