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

data class UserA (val name:String, val age:Int, val exp:Int)
data class CarA (val brand:String, val price: Int)

fun carsharing (user1:UserA, car1:CarA):String {
    val whatCar: String = when {
        user1.age>=26 && user1.exp>=6 && (car1.brand == "BMW" || car1.brand == "Audi") -> "You can use BMW & Audi"
        user1.age>=21 && user1.exp>=2 -> "You can use carsharing"
        else -> "You can't use carsharing"

    }
    return whatCar

}

fun main() {
    val user1 = UserA ("Misha", 31, 13)
    val user2 = UserA ("Nasty", 31, 5)
    val car1 = CarA ("BMW", 50)

    val getResult = carsharing (user2, car1)

    println(getResult)
}
