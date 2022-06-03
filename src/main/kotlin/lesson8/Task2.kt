package lesson8

/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val employee1 = Employee("Mark", 43)
    val employee2 = Employee("Mark2", 21)
    val employee3 = Employee("Mark3", 33)
    val employee4 = Employee("Mark4", 26)

    val employees = listOf(employee1, employee2, employee3, employee4)

    val minAge = minAgeFun(employees)

    println(minAge)

}

fun minAgeFun (employees: List <Employee>) :Employee {
    var minAge = employees[0]

    for (employee in employees) {
        if (employee.age < minAge.age)
            minAge = employee
    }
    return minAge

}