package lesson8

/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun main() {
    val employee1 = Employee("Mark1", 28)
    val employee2 = Employee("Mark2", 18)
    val employee3 = Employee("Mark3", 43)
    val employee4 = Employee("Mark4", 33)
    val employee5 = Employee("Mark5", 27)
    val employee6 = Employee("Mark6", 49)
    val employee7 = Employee("Mark7", 23)

    val employeesIt = listOf(employee1, employee2, employee3)
    val employeesHr = listOf(employee4)
    val employeesSales = listOf(employee5, employee6, employee7)

    // val allemp = listOf(employeesIt,  employeesHr, employeesSales)


    val depIt = Department("IT", employeesIt)
    val depHr = Department("HR", employeesHr)
    val depSales = Department("Sales", employeesSales)

    val departments = listOf(depIt, depHr, depSales)

    val company = Company("Volma", departments)

    val totalNumberOfEmployees = totalNumberOfEmployees(company)
    println(totalNumberOfEmployees)

    val averageAgeOfEmployees = averageAgeOfEmployees(company)
    println(averageAgeOfEmployees)


}

fun totalNumberOfEmployees (company: Company) :Int {

    var sumEmployees = 0

    for (depart in company.departments) {
        for (employee in depart.employees)
            sumEmployees++

    }
    return sumEmployees
}

fun averageAgeOfEmployees (company: Company) :Int {

    var sumEmployees = 0
    var sumAge = 0

    for (depart in company.departments) {
        for (employee in depart.employees)
            sumAge += employee.age



    }
    return sumAge/ totalNumberOfEmployees(company)
}