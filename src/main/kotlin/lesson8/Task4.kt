package lesson8

/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val employee1 = Employee("Mark1", 34)
    val employee2 = Employee("Mark2", 19)
    val employee3 = Employee("Mark3", 57)

    val itDep = listOf(employee1, employee2, employee3)

    val dep1 = Department("IT", itDep)

    val minAge = minAge(dep1)

    println(minAge)
}

fun minAge(depart: Department): Int {
    var sumOfAge = 0

    for (employee in depart.employees) {
        sumOfAge += employee.age
    }
    return sumOfAge / depart.employees.size
}