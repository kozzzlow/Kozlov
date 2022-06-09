package lesson12

fun main() {
    // длины стен по комнатам в сантиметрах
    val gostinaya = listOf<Int>(86, 160, 426, 270, 77, 33)
    val koridor = listOf<Int>(51, 20, 123, 290, 16, 466, 30, 16, 16, 65, 90, 62, 9, 200, 63, 130, 79, 4)
    val spalnia = listOf<Int>(22, 12, 157, 355, 277, 346, 4)
    val kabinet = listOf<Int>(290, 205, 14, 18, 53, 71, 74, 70, 70, 123, 167)
    val garderob = listOf<Int>(8, 8, 116, 147, 44, 66, 61)
    val detskaya = listOf<Int>(363, 6, 126, 55, 154, 402, 280)

    val perimetr1 = perimetr(gostinaya).toDouble()
    println("Perimetr gostinaya - ${perimetr1 / 100} metrov")
    val perimetr2 = perimetr(koridor).toDouble()
    println("Perimetr koridor - ${perimetr2 / 100} metrov")
    val perimetr3 = perimetr(spalnia).toDouble()
    println("Perimetr spalnia - ${perimetr3 / 100} metrov")
    val perimetr4 = perimetr(kabinet).toDouble()
    println("Perimetr kabinet - ${perimetr4 / 100} metrov")
    val perimetr5 = perimetr(garderob).toDouble()
    println("Perimetr garderob - ${perimetr5 / 100} metrov")
    val perimetr6 = perimetr(detskaya).toDouble()
    println("Perimetr detskaya - ${perimetr6 / 100} metrov")

    val collec = listOf<Double>(perimetr1/100, perimetr2/100, perimetr3/100, perimetr4/100, perimetr5/100, perimetr6/100)

    val izdelia = metrInIzd(collec)
    println("Kollichestvo izdelii po komnatam = $izdelia")

    val kolIzdel = kolIzdelii(izdelia)
    println("Tochnoe kolichestvo palok plintusa $kolIzdel")
    println("Okruglennoe kolichestvo palok plintusa ${Math.round(kolIzdel)}")


}
// не получилось внутри функции сделать чтобы поделить на сто (привести см. в метры) и не получилось
// вывести название комнаты в печать, поэтому вывел принт в main
fun perimetr(komnata: List<Int>): Int {
    var sum = 0
    for (el in komnata) {
        sum += el


    }
    return sum
}
// та же херня - не придумал как поделить на 100, чтобы перевести в метры, пришлось писать внутри коллекции
fun metrInIzd(perimCollec: List<Double>) :List<Double> {
    var newList = mutableListOf<Double>()
    for (el in perimCollec) {
        newList.add(el/2.5) // 2.5 м - длина одной палки плинтуса
    }
    return newList

}

fun kolIzdelii(summa: List<Double>): Double {
    var sum = 0.0
    for (el in summa) {
        sum += el

    }
    return sum
}