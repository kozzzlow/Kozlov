package lesson5

/*
Написать функцию, которая возвращает текстовое представление для целых чисел от 1 до 5:
1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то возвращать: «ошибка»

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun whatNumber(number: Int): String {
    val numberToText: String = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "error"
    }
    return (numberToText)
}

fun main() {
    val number: Int = 1

    val numberToText: String = whatNumber(number)

    println(numberToText)
}