data class DataUser2(val namex : String, val agex : Int){
    fun coba(){
        println("My namex is $namex, I am $agex years old")
    }
}

fun main(){
    val DataUser2 = DataUser2("nrohmen", 23)
    DataUser2.coba()
}