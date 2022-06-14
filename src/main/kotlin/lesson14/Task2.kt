/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/

fun main() {
    val address1: Address = Address ("Kirova","Volgograd")
    val address2: Address = Address ("Lenina", "Moscow")

    val company1:Company = Company ("Volma",address1)
    val company2:Company = Company ("585", address2)

    val companies = listOf(company1, company2)

    val employee1:Employee = Employee ("Mark1", null)
    val employee2:Employee = Employee ("Mark2", company2)

    val employees = listOf(employee1,employee2)

    val result = employeeCity(employee1)

    println(result)


}

class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

fun employeeCity(employee: Employee): String {
    return employee.company?.address?.city ?: return "Unknown"

}

