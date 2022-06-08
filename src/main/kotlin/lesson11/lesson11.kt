package lesson11

fun main() {
    val manager1 = Manager ("Kirill", 120000)
    manager1.addProject("ProjectX")
    val manager2 = Manager ("Tim", 140000)

    val programmer1 = Programmer ("Sam", 110000)
    programmer1.addProject("Project1")
    programmer1.addProject("Project2")
    programmer1.addProject("Project3")
    val programmer2 = Programmer ("Tod", 190000)
    programmer2.addProject("Project3")

    val employees = listOf<Employee>(programmer1,programmer2,manager1,manager2)

    for (employee in employees)
        employee.addProject("General project")
    for (employee in employees)
        employee.printAllProjects()
}
//суперкласс
open class Employee(
    val name: String,
    val salary: Int
) {
    private val projects: MutableList<String> = mutableListOf<String>()


    fun addProject (projectName: String){
        projects.add(projectName)
        println("Employee $name starting project $projectName")
    }

    fun printAllProjects (){
        println("Project employee $name: ${projects.joinToString()}")
    }
}


//Класс программер (наследник)
class Programmer(name: String, salary: Int): Employee (name, salary) {

    fun readArticle(articleName: String) {
        println("Programmer $name read $articleName")
    }
}




//Класс манагер (наследник)
class Manager(name: String, salary: Int): Employee (name, salary) {

    fun callToClient(clientName: String) {
        println("Manager $name call to client $clientName")
    }
}
