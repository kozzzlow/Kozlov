package lesson9

/* Простейшая лямбда функция
fun main() {
    val lambdaFun = {a:Int, b:Int -> if (a>b) a else b}

    val result = lambdaFun(3,33)

    println(result)
} */


/*
fun main() {
    val user1 = User("Mark1", 53)
    val user2 = User("Mark2", 21)
    val user3 = User("Mark3", 17)
    val user4 = User("Mark4", 31)

    val users = listOf(user1, user2, user3, user4)

    val filteredUsers = filtrUsersByCondition(users) { it.age > 18 } //работает вместе с функцией filtrUsersByCondition
//Стандартная альтернатива функции выше
    val filtredUsersStandart = users.filter { it.age > 35 }


    println(filteredUsers)
}
/*Сокращение функции до короткого лямбда:
1.
fun conditionAgeMore18(user: User): Boolean {
    return if (user.age > 18)
        true
    else
        false
}
2.
fun conditionAgeMore18(user: User): Boolean {
    return user.age > 18
}

3.
val conditionAgeMore18 = { user: User -> user.age > 18 }


4.
val filteredUsers = filtrUsersByCondition(users, { user: User -> user.age > 18 })

5. val filteredUsers = filtrUsersByCondition(users) { it.age > 18 }
*/


//Функция ниже, с которой работает
fun filtrUsersByCondition(users: List<User>, condition: (User) -> Boolean): List<User> {
    val filteredUsers = mutableListOf<User>()
    for (user in users) {
        if (condition(user))
            filteredUsers.add(user)
    }
    return filteredUsers
}


data class User(val name: String, val age: Int)

fun filtrUsersByAge(users: List<User>, minAge: Int): List<User> {
    val filteredUsers = mutableListOf<User>()
    for (user in users) {
        if (user.age > minAge)
            filteredUsers.add(user)
    }
    return filteredUsers
}

fun filtrUsersByFirstLetter(users: List<User>, firstLetter: Char): List<User> {
    val filteredUsers = mutableListOf<User>()
    for (user in users) {
        if (user.name[0] == firstLetter)
            filteredUsers.add(user)
    }
    return filteredUsers
}

 */