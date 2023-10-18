class Etudiant(var name:String, val code:Int, val sexe:String, val addresse:String, val age:Int){
    override fun toString(): String {
        return "name: $name, code: $code, sexe: $sexe, sexe: $addresse, age: $age"
    }

}
fun main() {
    val etudiants = mutableListOf<Etudiant>()
    etudiants.add(Etudiant("saad",1,"male","safi",20))
    etudiants.add(Etudiant("ahlame",2,"female","safi",22))
    etudiants.add(Etudiant("said",3,"male","safi",22))
    etudiants.add(Etudiant("morad",4,"male","safi",22))
    etudiants.add(Etudiant("farida",5,"female","safi",22))
    etudiants.add(Etudiant("kholode",6,"female","safi",22))

//    println(etudiants)

    println(etudiants)
    etudiants.groupBy{it.name}.get("saad")
//    println(etudiants.first { it.sexe == "Femme" }.name)

//
    println(" Q3 sorted By names")
    etudiants.sortBy{it.name}
    for (et in etudiants){
        println(et)
    }
    println(" Q4 groupe By sexe")
    val listSexe = etudiants.groupBy{it.sexe}
    println(listSexe)
    println(" Q5 groupe By sexe male")
    val listMale = etudiants.groupBy{it.sexe}.get("male")
    println(listMale)
    println(" Q6 first boy in the list ")
    println(etudiants.first { it.sexe == "male" }.name)
    println(" Q7 to modify the name of the first boy ")
    if ( etudiants.first { it.sexe == "male" }.name is String) {
        etudiants[0].name = "Otmane"
    }
    println(etudiants)
    println(" Q8  names ")
    val Names = mutableListOf<String>()
    etudiants.forEach {
        Names.add(it.name)
    }
    println(Names)
    println(" Q9  delete female ")
    etudiants.removeIf{it.sexe == "female"}
    println(etudiants)
    println("Q10 inverser")
    println(etudiants.reversed())
    println("Q11 Clear")
    etudiants.clear()
    println(etudiants)


}