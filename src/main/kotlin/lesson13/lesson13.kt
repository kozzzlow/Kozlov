package lesson13


fun main() {
    val robot1 = Robot (1)
    robot1.callToClient("Nick")
    val manager1 = Manager ("John", 100000)
    manager1.callToClient("Nick")

    val clientWorker = listOf<ClientWorker>(robot1, manager1)

    for (clientWorker in clientWorker)
        clientWorker.callToClient("Jack")


}

interface ClientWorker {
    fun callToClient(clientName: String)
    fun emailToClient (clientName: String)
}

class Robot (val id:Int): ClientWorker {
    override fun callToClient(clientName: String) {
        println("Robot $id call to client $clientName")
    }

    override fun emailToClient(clientName: String) {
        println("Robot $id email to client $clientName")
    }
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
    class Manager(name: String, salary: Int) : Employee(name, salary), ClientWorker {

        override fun callToClient(clientName: String) {
            println("Manager $name call to client $clientName")
        }

        override fun emailToClient(clientName: String) {
            println("Manager $name call to client $clientName")
        }

        override fun addProject(projectName: String) {
            projects.add(projectName)
            println("Manager $name move project $projectName to programmer")
        }
    }

