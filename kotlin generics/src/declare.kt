package src

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}

interface List<T> {
    operator fun get(index: Int): T
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

