abstract class Personne(val nom:String,val prenom:String)
open class Enfant(n:String, p:String,var age:Int,var taille:Int):Personne(n,p)
class BasketBalleur(n:String, p:String,a:Int,t:Int):Enfant(n,p,a,t){
    var type:String= when{
        age<=7 && taille>140 -> "Minime"
        age<=12 && taille>150 -> "Cadet"
        age<=15 && taille>170 -> "Junior"
        else -> "non titulaire" }
    init{
        println("je suis $nom $prenom, j'ai $age de taille $taille cm et je suis $type") }
}
fun main() {
    println("Saad")
    var b1 = BasketBalleur("saad","jaghlal",15,175)

}