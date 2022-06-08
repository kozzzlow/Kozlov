package lesson11

/*
Для созданных в предыдущих задачах классов Rectangle и Round (нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве относитльено начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/

fun main() {
val figure1 = Rectangle2(1,3, color = "white")
    figure1.moveLeft(3)
    figure1.moveRight(7)
    figure1.moveDown(1)
    figure1.showPosition()
}

open class Figure(
    val color: String,
) {
    var x: Int = 0
    var y: Int = 0

    fun moveLeft (step:Int){
        y-=step
    }

    fun moveRight (step:Int){
        y+=step
    }

    fun moveDown (step:Int){
        x-=step
    }

    fun moveUp (step:Int){
        x+=step
    }

    fun showPosition () {
        println("X:$x")
        println("Y:$y")
    }

}

class Rectangle2
    (
    private val height: Int,
    private val width: Int,
    color: String,
) : Figure(color) {

    fun area(): Int {
        return height * width
    }

    fun perimetr(): Int {
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

    fun area(): Double {
        return Math.PI * radius * radius
    }

    fun circle(): Double {
        return 2 * Math.PI * radius
    }
}