package lesson14

/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

class SomeEmployee(
    val name: String,
    val salary: Int,
) {
    fun callToClient(clientName: String) {
        println("Employee $name call to $clientName")

    }
}

fun main() {


    val employee1: SomeEmployee = SomeEmployee("Mark1", 100000)
    val employee2: SomeEmployee = SomeEmployee("Mark2", 120000)
    val employee3: SomeEmployee = SomeEmployee("Mark3", 140000)

    val employees = listOf<SomeEmployee>(employee1, employee2, employee3)

    val findEmployeeBySalary = findEmployeeBySalary(employees, 120000)

    println(findEmployeeBySalary)

    findEmployeeBySalary?.callToClient("Kirill")

}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee? {
    for (employee in employees) {
        if (employee.salary == salary)
            return employee

    }
    return null
}

