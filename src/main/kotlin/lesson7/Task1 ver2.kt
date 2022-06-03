package lesson7

/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

data class User (val name:String, val age: Int, val exp:Int)
data class Car (val brand:String, val cost: Int)

/* Написать функцию, которой на вход приходят возраст и стаж водителя.
Функция должна вернуть сообщение о том может ли он пользоваться каршерингом и какие авто ему доступны.*/

fun userStatus (user:User):String {
    val userStatus = when {
        user.age >= 26 && user.exp >= 6 -> "You can use all cars"
        user.age >= 21 && user.exp >= 2 -> "You can use all cars, except BMW & Audi"
        else -> "You can't use car sharing"
    }
    return userStatus
}


// Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
//Boolean (доступно ему это авто или нет)

fun carAvailable (user:User, car:Car):Boolean {
    val carAvailable = when {
        user.age>=26 && user.exp>=6 -> true
        user.age>=21 && user.exp>=2 && !(car.brand == "BMW" || car.brand == "Audi") -> true
        else -> false
    }
    return carAvailable
}

fun main() {
    val user = User ("Misha", 22, 5)
    val car = Car ("BMW", 50)

    val getResult = userStatus(user)
    println(getResult)

    val getCar = carAvailable(user, car)
    println(getCar)


}