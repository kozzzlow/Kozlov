package lesson10
/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися
через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

class Rectangle(
    val width: Int,
    val height: Int,
) {
    fun area(rectangle: Rectangle): Int {
        val result = rectangle.width * rectangle.height
        println(result)

        return result
    }

    fun perimetr(rectangle: Rectangle): Int {
        val result = 2 * (rectangle.width + rectangle.height)
        println(result)

        return result
    }

    fun isItSquare(rectangle: Rectangle): Boolean {
        var result = false
        if (rectangle.width == rectangle.height)
            println(true)
        else
            println(false)

        return (result)

    }

}

fun main() {
    val obj = Rectangle(3, 3)

    obj.area(obj)
    obj.perimetr(obj)
    obj.isItSquare(obj)


}