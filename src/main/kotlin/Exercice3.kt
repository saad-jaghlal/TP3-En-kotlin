data class Persone( private val name:String,private val age:Int)
class Person(name: String, age: Int) {
    private val name: String
    private val age: Int

    init {
        this.name = name
        this.age = age
    }

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
}


fun main() {
    var p= Person("saad",20)

}