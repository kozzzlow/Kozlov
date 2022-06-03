package lesson5

fun main() {
    val a: Int = 9
    val b: Int = 44

    val maxNumber: Int = newMaxNumber(a,b)

    println(maxNumber)
}

fun newMaxNumber (newA:Int, newB:Int) :Int {
    val maxMaxNumber: Int = if (newA>newB)
        newA
    else
        newB
    return maxMaxNumber

}