package lesson13
/*
Создайте класс Animal с полями name: String, x: Int, y: Int, который будет реализовывать интерфейс Movable
из предыдущей задачи (любой вариант реализации на ваш выбор)

Для этой задачи есть видео с разбором.
*/
/*
fun main() {


}

interface Movable {
    fun moveLeft(step: Int)
    fun moveRight(step: Int)
    fun moveDown(step: Int)
    fun moveUp(step: Int)

    class Animal(
        name: String,

    ):Movable {
        var x: Int = 0
        var y: Int = 0
        override fun moveLeft(step: Int) {
            x-=step
            println("Move left to $step step(s)")
                    }

        override fun moveRight(step: Int) {
            x+=step
            println("Move right to $step step(s)")
        }

        override fun moveDown(step: Int) {
            y-=step
            println("Move down to $step step(s)")
        }

        override fun moveUp(step: Int) {
            y+=step
            println("Move up to $step step(s)")
        }

    }

    abstract class Figure(
        val color: String,
    ) : Movable {
        abstract fun area(): Double
        abstract fun lenght(): Double

        var x: Int = 0
        var y: Int = 0


        override fun moveLeft(step: Int) {
            y -= step
        }

        override fun moveRight(step: Int) {
            y += step
        }

        override fun moveDown(step: Int) {
            x -= step
        }

        override fun moveUp(step: Int) {
            x += step
        }

    }
}

 */