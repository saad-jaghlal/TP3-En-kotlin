import java.util.Objects

open class Produit(private var code:Int, private var prix:Float){
    fun getCode():Int = code
    fun getPrix():Float = prix
    fun setCode(c: Int){
        this.code = c
    }
    fun setPrix(p: Float){
        this.prix = p
    }
    fun prixProduit():Float = prix
   fun toSting():String ="le code de produit est ${code} est le prix est ${prix}"
//    fun equqls(obj: Any):Boolean{
//        if(((obj as? Produit)?.getCode()) == code) {
//            return true
//        }
//        return false
//    }
override fun equals(obj: Any?): Boolean {
    if (this === obj) return true
    if (javaClass != obj?.javaClass) return false

    obj as Produit

    if (code != obj.code) return false

    return true
}
}
class ProduitEnSolde(var remise:Int,code: Int,prix: Float):Produit(code,prix){
    fun getRemis():Int = remise
    fun setRemis(R:Int){
        this.remise=R

    }
    fun prixEnproduit():Float{
        return getPrix()-(getPrix()*(remise/100))
    }
    override fun toString():String = super.toString()+" le remise est $remise "

}
class Boutique(){
//    private val produits: MutableList<Produit> = ArrayList()
    private val produits: MutableList<Produit> = mutableListOf()

    fun indiceDe(code:Int):Int{
        for (i in 0 until produits.size){
            if (code ==  produits.get(i).getCode()){
                return i
            }
        }
        return -1
    }

    fun ajouter(p:Produit){
        if(indiceDe(p.getCode())==-1){
            produits.add(p)
        }
        else throw Exception("produit dija excite")
    }
    fun supprimer(code:Int):Boolean{
        if (indiceDe(code)!=-1){
            produits.removeAt(indiceDe(code))
            return true
        }
        return false
    }
    fun supprimer(p:Produit):Boolean{
        if (indiceDe(p.getCode())!=-1){
            produits.remove(p)
            return true
        }
        return false
//        if(supprimer(p.getCode())){
//            return true
//        }
//        return false
    }
    fun nombreProduitEnSolde():Int{
        var count:Int = 0
        for (p:Produit in produits){
            if (p is ProduitEnSolde){
                count++
            }
        }
        return count
    }
}
fun main(){
    val p1 = Produit(50,3000f)
    val p2 = Produit(60,3000f)
    val p3 = ProduitEnSolde(90,30,3000f)
    println(p1.toSting())
//    println(p1.hashCode())
//    println(p2.hashCode())
    println(p1.equals(p2))
    val b = Boutique()

    try{
        b.ajouter(p1)
        b.ajouter(p2)
        b.ajouter(p3)
    }catch (e:Exception){
        println("${e.message}")
    }
    println(b.nombreProduitEnSolde())
    b.supprimer(p1)
    println("""
        ${b.indiceDe(50)}
        ${b.indiceDe(60)}
        ${b.indiceDe(30)}
    """.trimIndent())


}