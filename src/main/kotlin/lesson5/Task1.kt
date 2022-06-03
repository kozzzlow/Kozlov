package lesson5
/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun getMax(number1: Int, number2: Int): Int {
    val maxNumber: Int = if (number1 > number2)
        number1
    else
        number2

    return (maxNumber)
}


fun main() {
    val num1: Int = 34
    val num2: Int = 42

    val max: Int = getMax(num1, num2)

    println(max)
}