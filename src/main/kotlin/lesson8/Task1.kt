package lesson8

/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val employee1 = Employee("Mark1", 33)
    val employee2 = Employee("Mark2", 44)
    val employee3 = Employee("Mark3", 19)
    val employee4 = Employee("Mark4", 42)

    val employees = listOf(employee1, employee2, employee3, employee4)

    val averageAge = averageAgeFun(employees)

    println(averageAge)

}

fun averageAgeFun(employees: List<Employee>): Int {
    var sumAge = 0

    for (employee in employees) {
        sumAge = +employee.age
    }


    return sumAge / employees.size

}

