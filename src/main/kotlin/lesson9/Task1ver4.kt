package lesson9

/*Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.
______________________________________________________________________________
Напишите функции, которые должны принимать на вход список пользователей и лямбда выражение (наподобии того, как это было в уроке с функцией filter):

1. Функцию преобразования каждого элемента в String в соответствии с заданным лямбда-выражением

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>
*/
/*
fun main() {
    val users = listOf(
        User ("Jack", 32),
        User ("Bob", 14),
        User ("Frank", 46)
    )

    val result = convertToStrings(users) {"Name ${it.name}, age ${it.age}"}

    println(result)
}

fun convertToStrings (users: List<User>, conversion: (User)->String):List <String>{
    val result = mutableListOf<String>()

    for (user in users) {
        val string = conversion (user)
        result.add(string)
    }
    return result
}

 */