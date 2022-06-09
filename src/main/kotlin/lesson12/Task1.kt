package lesson12

import kotlin.math.sqrt

/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/
fun main() {
    val figure1 = Rectangle2(1.0, 3.2, color = "white")
    val figure2 = Round(4, "white")
    val figure3 = Triangle (1.8,2.5,4.2, "black")
    println(figure1.lenght())
    println(figure2.lenght())
    println(figure3.lenght())
    println(figure1.area())
    println(figure2.area())
    println(figure3.area())


}

abstract class Figure(
    val color: String,
) {
    abstract fun area(): Double
    abstract fun lenght(): Double

}


class Rectangle2
    (
    private val height: Double,
    private val width: Double,
    color: String,
) : Figure(color) {

    override fun area(): Double {
        return height * width
    }

    override fun lenght(): Double {
        return 2 * (height * width)
    }

    fun square(): Boolean {
        return width == height

    }

}

class Round(
    private val radius: Int,
    color: String,
) : Figure(color) {

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun lenght(): Double {
        return 2 * Math.PI * radius
    }
}

class Triangle (val a:Double, val b:Double, val c:Double, color: String):Figure (color) {
    override fun area(): Double {
    val p = (a+b+c)/2
        return sqrt(p*(p-a)*(p-b)*(p-c))
    }

    override fun lenght(): Double {
        return (a+b+c)
    }

}
