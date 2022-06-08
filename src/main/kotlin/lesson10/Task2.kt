package lesson10

class Round (val radius:Int) {

    fun area ():Double {
        return Math.PI*radius*radius
    }

    fun circle ():Double {
        return 2*Math.PI*radius
    }
}

fun main() {
    val round = Round (1)

    val result1 = round.area()
    println(result1)
    val result2 = round.circle()
    println(result2)
}

