package lesson12

fun main() {
    val employee1 = Doctor ("Scalpel", 100000)
    val employee2 = Nurse ("3", 10000)
    val employee3 = Cleaner ("q", 40000)

    val employeesNew = listOf(employee1,employee2,employee3)

    println(employeesNew)

}

abstract class EmployeeNew(
    val salary: Int
){
    abstract fun kpi(): Int

}

class Doctor(
    val tool: String,
    salary: Int
) : EmployeeNew(salary){
    override fun kpi(): Int {
       return (salary*4)
    }
}

class Nurse(
    val children: String,
    salary: Int
) : EmployeeNew(salary){
    override fun kpi ():Int {
        return salary*3
    }
}

class Cleaner(
    val favoritChar: String,
    salary: Int
) : EmployeeNew(salary){
    override fun kpi ():Int {
        return salary*2

    }
}

fun kpiCalc (employees: List<EmployeeNew>) {
    for (employee in employees) {
        println(employee.kpi())
    }
}