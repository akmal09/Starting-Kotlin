fun main(){
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    val ranges2 = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }

    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}