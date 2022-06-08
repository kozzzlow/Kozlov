package lesson9

fun main() {
    val user1 = User("Mark1", 53)
    val user2 = User("Mark2", 21)
    val user3 = User("Mark3", 17)
    val user4 = User("Mark4", 31)

    val users = listOf(user1, user2, user3, user4)

   // val filtredUsersStandart = users.filter { it.age > 35 }
    val maxAge = users.maxByOrNull {it.age} // старший из коллекции
    val minAge = users.minByOrNull {it.age} // младший из коллекции
    val minName = users.minByOrNull {it.name} // первый по алфавиту
    val sorted = users.sortedBy {it.name} // отсортировать по имени



    println(maxAge)
}