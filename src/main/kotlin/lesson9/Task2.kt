package lesson9

/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.

Напишите функции, которые должны принимать на вход список пользователей и лямбда выражение (наподобии того, как это было в уроке с функцией filter):
2. Функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean
*/
/*
fun main() {
    val users = listOf(
        User("Jack", 32),
        User("Bob", 14),
        User("Frank", 46)
    )
    val result = containsElement(users) { it.name[0] == 'B' }
    println(result)
}

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean {
    for (user in users)
        if (condition(user) == true)
            return true

        return false
}

 */



