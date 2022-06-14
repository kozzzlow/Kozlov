package lesson13

import kotlin.math.sqrt


/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val animal1 = Movable.Animal("Giraffe")
    val animal2 = Movable.Animal("Wolf")
    val figure1 = Movable.Rectangle ("white", 2.1, 1.2)
    val figure2 = Movable.Triangle("Black", 2.1, 2.1, 1.2)

    val movable = listOf(animal1, animal2, figure1, figure2)

    for (item in movable)
        item.moveLeft(10)

    //movable.moveRight (10) почему не могу вот тут так вызвать функцию???


}

interface Movable {
    fun moveLeft(step: Int)
    fun moveRight(step: Int)
    fun moveDown(step: Int)
    fun moveUp(step: Int)

    class Animal(
        val name: String

    ) : Movable {
        var x: Int = 0
        var y: Int = 0
        override fun moveLeft(step: Int) {
            x -= step
            println("Move left to $step step(s)")
        }

        override fun moveRight(step: Int) {
            x += step
            println("Move animal right to $step step(s)")
        }

        override fun moveDown(step: Int) {
            y -= step
            println("Move down to $step step(s)")
        }

        override fun moveUp(step: Int) {
            y += step
            println("Move up to $step step(s)")
        }

    }

    abstract class Figure(val color: String) : Movable {
        var x: Int = 0
        var y: Int = 0

        abstract fun area(): Double

        abstract fun length(): Double

        override fun moveLeft(step: Int) {
            x -= step
        }

        override fun moveRight(step: Int) {
            x += step
        }

        override fun moveDown(step: Int) {
            y += step
        }

        override fun moveUp(step: Int) {
            y -= step
        }
    }

    class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
        override fun area(): Double {
            return width * height
        }

        override fun length(): Double {
            return 2 * (width + height)
        }

        fun isSquare(): Boolean {
            return width == height
        }
    }


    class Triangle(color: String, val a: Double, val b: Double, val c: Double) : Figure(color) {
        override fun area(): Double {
            val p = (a + b + c) / 2
            return sqrt(p * (p - a) * (p - b) * (p - c))
        }

        override fun length(): Double {
            return a + b + c
        }
    }
}