package lesson5

/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, которой на вход приходят возраст и стаж водителя.
Функция должна вернуть сообщение о том может ли он пользоваться каршерингом и какие авто ему доступны.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun carsharing(age: Int, exp: Int): String {
    val mayI: String = when {
        age >= 26 && exp >= 6 -> "you can use premium car"
        age < 21 || exp < 2 -> "you can't use car sharing"
        else -> "you can use regular car"
    }
    return mayI
}

fun main() {
    val age: Int = 26
    val exp: Int = 19

    val whatForMe: String = carsharing(age, exp)

    println(whatForMe)
}