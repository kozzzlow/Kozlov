package lesson5

/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun check(age: Int, exp: Int, car: String): Boolean {
    val checkYou: Boolean = when {
        age >= 26 && exp >= 6 && (car == "Audi" || car == "BMW") -> true
        !(car == "Audi" || car == "BMW") && age >= 21 && exp >= 2 -> true
        else -> false


    }
    return checkYou
}

fun main() {
    val age: Int = 25
    val exp: Int = 5
    val car: String = "BM"

    val checkCar: Boolean = check(age, exp, car)

    println(checkCar)

}