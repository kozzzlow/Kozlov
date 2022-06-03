package lesson5

/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun whatBigger(num1: Int, num2: Int): String {
    val theBiggest: String = when {
        num1 > num2 -> "first number is bigger"
        num2 > num1 -> "second number is bigger"
        else -> "the numbers are equal"

    }
    return (theBiggest)
}

fun main() {
    val num1: Int = 23
    val num2: Int = 23

    val result: String = whatBigger(num1, num2)

    println(result)
}