// exercice 1
fun String.elimines():String{
    return this.substring(1,this.length-1)
}
// exercic 2
fun MutableList<Int>.change(i:Int,f:Int):MutableList<Int>{
    var s:Int=0
    s = this[i]
    this[i]=this[f]
    this[f]=s
    return this
}
class Circle (val r: Double){
    fun area(): Double{
        return Math.PI * r * r;
    }
}
fun Circle.perimeter(): Double{
    return 2*Math.PI*r;
}
class StudentE{
    fun isPassed(mark: Int): Boolean{
        return mark>40
    }
}
fun StudentE.isExcellent(mark: Int):Boolean{
    return mark>90
}


fun main() {
    val str:String = "ssaadd"
    println(str.elimines())
    val nomber = mutableListOf<Int>(2,4,6,8,10)
    println(nomber)
    println(nomber.change(1,3))
    println("Q2")
    val C1 =Circle(5.0)
    print( C1.area())
    println(C1.perimeter())
    println("Q3 ")


}