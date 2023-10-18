fun fact(n:Int):Int{
    if(n==0 || n==1){
        return 1
    }
    return n*fact(n-1)

}

fun main() {
    print("donner un nombre ")
    val n = readLine()!!.toInt()
//    var m:Int=0
//
//    for (i in 1..n){
//        print("donner le nomber $i ")
//        val nb = readLine()!!.toInt()
//        m+=nb/n
//    }
//    print("la moyeen des nombre est ${m}")
    println(fact(n))

}