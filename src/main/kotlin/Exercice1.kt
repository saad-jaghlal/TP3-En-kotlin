import java.util.Date
import kotlin.math.min
import kotlin.math.max

open class University(var nomU:String, var annee:Int) {
    val universityP = mutableListOf<Professor>()
    val universityS = mutableListOf<Student>()
    fun hire(P:Professor){
        universityP.add(P)
        println("professor ${P.nom} has been hired at $nomU")
    }
    open fun enroll(S:Student){
        universityS.add(S)
        println("Student ${S.nom} has been sign up at $nomU  ")
    }
}
class Professor(var nom:String,var age:Int,salair:Int){
    var course = mutableListOf<Course>()
    fun teach(C:Course){
        course.add(C)
        println("${C.Titre}")
    }
    fun doOralExam(s: Student, c: Course) {
        println("Testing student ${s.nom} in ${c.Titre}")
        s.grad(c, Result.Sucess(50))
    }
}
class Student(var nom:String,var age:Int,var numroM:Int){
    var inscritCoure = mutableListOf<Course>()
    var grades = mutableMapOf<Course,Result>()
    private var success:Int=50
    fun enroll(C: Course){
        inscritCoure.add(C)
        println("un étudiant s’inscrit à un cours ${C.Titre}")
    }
    fun takeExam(c: Course){
        println("${nom} is  taking exam in ${c.Titre}")
    }
    fun grad(c: Course,grad:Result){
        grades.put(c,grad)
    }
    fun learn() {
        println("$nom is learning")
    }
    fun party() {
        println("$nom is  party ")

    }


}


data class Course(val Titre: String)

fun main() {
    val u = University("NTIC", 1870)
    val prof = Professor("Saad", 44, 50_000)
    val student = Student("jaghlal", 22, 123456)
    val course = Course("kotlin")
    u.hire(prof)
    u.enroll(student)
    prof.teach(course)
    student.enroll(course)
    student.takeExam(course)
    prof.doOralExam(student, course)
    student.party()
    student.party()
    student.party()
    student.learn()

}
