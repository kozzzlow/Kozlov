package lesson8

/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val user1 = User("Mark1", 24, 4)
    val user2 = User("Mark2", 29, 9)
    val user3 = User("Mark3", 19, 1)

    val users = listOf(user1, user2, user3)

    val car1 = Car("BMW", "X6", 13.5)
    val car2 = Car("Audi", "A4", 11.1)
    val car3 = Car("Skoda", "Kodiaq", 9.99)

    val cars = listOf(car1, car2, car3)

    val whatCanUse = usersCar(user2, cars)

    println(whatCanUse)

}

fun usersCar(user: User, availableCar: List<Car>): List<Car> {
    val usersCar = mutableListOf<Car>()

    for (car in availableCar) {
        val option1 = user.age >= 26 && user.experience >= 6
        val option2 = user.age >= 21 && user.experience >= 2 && car.brand != "BMW" && car.brand != "Audi"

        if (option1 || option2)
            usersCar.add(car)
    }
    return usersCar
}