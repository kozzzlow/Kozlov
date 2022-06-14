package lesson14

fun main() {
    val inputChildrenCount: Int? = null

    //val childrenCount = inputChildrenCount ?: 0 // ?: Это Элвис оператор. Если inputChildrenCount равна null,
// то  childrenCount будет равен 0, если не равен null, то childrenCount будет равен inputChildrenCount

    val rectangle: Rectangle? = null

    rectangle?.printArea() // если ректангл не null -напечатать printArea


}


class Rectangle (val a: Int, val b: Int) {

    fun printArea () {
        val result = a*b
        println(result)
    }
}

