package lesson10

/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися
через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

class Rectangle2(
    private val height: Int,
    private val width: Int,
) {

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

fun main() {
    val rectangle2 = Rectangle2(3, 3)

    val area = rectangle2.area()
    println(area)

    val perimetr = rectangle2.perimetr()
    println(perimetr)

    val sqare = rectangle2.square()
    println(sqare)
}


