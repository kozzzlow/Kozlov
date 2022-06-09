package lesson12
/*
fun main() {
    val programmer1 = Programmer ("Kir", 120000)
    programmer1.addProject("project1")
    val manager1 = Manager("Olga", 200000)
    manager1.addProject("project2")

    val employees = listOf<Employee>(programmer1, manager1)
    for (employee in employees) {
        employee.addProject("Project for everyone")
        some (programmer1)
        some (manager1)
    }
}
    fun some (employee: Employee){

    }

    //суперкласс
    abstract class Employee(
        val name: String,
        val salary: Int,
    ) {
        protected val projects: MutableList<String> = mutableListOf<String>()


        abstract fun addProject(projectName: String)

        fun printAllProjects() {
            println("Project employee $name: ${projects.joinToString()}")
        }
    }


    //Класс программер (наследник)
    class Programmer (name: String, salary: Int) : Employee(name, salary) {

        fun readArticle(articleName: String) {
            println("Programmer $name read $articleName")
        }

        override fun addProject(projectName: String) {
            projects.add(projectName)
            println("Programmer $name starting project $projectName")
        }
    }


    //Класс манагер (наследник)
    class Manager(name: String, salary: Int) : Employee(name, salary) {

        fun callToClient(clientName: String) {
            println("Manager $name call to client $clientName")
        }

        override fun addProject(projectName: String) {
            projects.add(projectName)
            println("Manager $name move project $projectName to programmer")
        }
    }

*/