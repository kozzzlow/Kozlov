package lesson9

/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.


Напишите функции, которые должны принимать на вход список пользователей и лямбда выражение (наподобии того, как это было в уроке с функцией filter):
3. Функцию, которая возвращает количество элементов, удовлетворяющих условию:

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int


fun main() {
    val users = listOf(
        User("Jack", 32),
        User("Bob", 14),
        User("Frank", 46)
    )
    val result = elementsCount(users) {it.age>5 }
    println(result)
}

fun elementsCount (users: List<User>, condition: (User)->Boolean): Int{
    var counter = 0
    for (user in users)
        if (condition(user))
            counter++

    return counter
}

 */
