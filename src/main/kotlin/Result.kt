sealed class Result {
    data class Sucess(val n:Int) : Result()
    data class Echec(val n:Int) : Result()
}