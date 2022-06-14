package lesson13

import lesson11.Figure
import lesson12.Rectangle2
import lesson12.Round
import lesson12.Triangle
import kotlin.math.sqrt

/*
Создайте интерфейс Movable (перемещаемый), в котором будут описаны функции moveLeft(step: Int), moveRight(step: Int),
moveDown(step: Int), moveUp(step: Int).

Сделайте так, чтобы класс Figure из предыдущего задания реализовывал интерфейс Movable (скопируйте сюда код написанного
вами класса Figure)

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