package lesson10

fun main() {
    val employee1 = Employee("Kirill", 120000)
    val employee2 = Employee("Olga", 140000)
   // employee1.callToClient("Vasilii")
    //employee2.callToClient("Oleg")

    employee1.addProject("Project #1")
    employee1.addProject("Project #2")
    employee1.addProject("Project #3")

    employee1.printAllProjects()

    employee2.addProject("Project #1 for Olga")


    employee2.printAllProjects()
}

class Employee(
    val name: String,
    val salary: Int
    ) {
    private val projects: MutableList<String> = mutableListOf<String>()

    fun callToClient(clientName: String) {
      println("Employee $name call to client $clientName")
    }

    fun addProject (projectName: String){
        projects.add(projectName)
        println("Employee $name starting project $projectName")
    }

    fun printAllProjects (){
        for (project in projects)
            println(project)
    }
}