class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser4 = dataUser.copy()
    println(dataUser4)
    val dataUser5 = dataUser.copy(age = 18)
    println(dataUser5)

    println()
    val name = dataUser5.component1()
    val age = dataUser5.component2()
    println("My name is $name, I am $age years old")

    val (name1, age1) = dataUser

    println("My name is $name1, I am $age1 years old")
}