import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.PI

fun main(args: Array<String>) {

    // Задание 1
    /*
    Объявление константы exercises со значением 13
    и переменной exercisesSolved со значением 0.
    Увеличение переменной exercisesSolved
    */
    val exercises = 13
    var exercisesSolved = 0
    exercisesSolved++

    // Задание 2
    /*
    Объявление константы типа Int со значением моего возраста.
    Название myAge1 определено в соответствии со стандартами.
    Увеличение переменной exercisesSolved
    */
    val myAge1: Int = 18
    exercisesSolved++

    // Задание 3
    /*
    Объявление переменной типа Double со значением моего возраста.
    Название myAge2 определено в соответствии со стандартами.
    Изменение значения переменной myAge2 на среднее арифметическое
    моего возраста и человека, которому 30 лет
    */
    var myAge2: Double = 18.0
    myAge2 = (myAge2 + 30) / 2
    exercisesSolved++

    // Задание 4
    /*
    Создание константы testNumber с любым целочисленным значением
    и константы evenOdd, значение которой это остаток от деления testNumber на 2.

    При изменении testNumber на четное число, evenOdd принимает значение 0,
    При изменении testNumber на нечетное число, evenOdd принимает значение 1
    */
    val testNumber = 20
    val evenOdd = testNumber % 2
    exercisesSolved++

    // Задание 5
    /*
    Конечный результат = 13
    */
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    exercisesSolved++

    // Задание 6
    /*
    Используется var т.к. age изменяет свое значение => age - переменная
    */
    var age: Int
    age = 16
    print(age)
    age = 30
    print(age)
    exercisesSolved++

    // Задание 7
    /*
    answer1 = 4610
    answer2 = 5600
    answer3 = 4601
    */
    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a * 100) + b
    val answer2: Int = (a * 100) + (b * 100)
    val answer3: Int = (a * 100) + (b / 10)
    exercisesSolved++

    // Задание 8
    /*
    Добавление скобок, которые указывают на порядок,
    в котором осуществляются операции
    */
    (5 * 3) - ((4 / 2) * 2)
    exercisesSolved++

    // Задание 9
    /*
    Вычисление среднего арифметического чисел a1 и b1
    */
    val a1 = 5.5
    val b1 = 10.7
    val average = (a1 + b1) / 2
    exercisesSolved++

    // Задание 10
    /*
    Перевод градусов Фаренгейта в градусы Цельсия
    */
    val fahrenheit = 79.6
    val celcius = (fahrenheit - 32) / 1.8
    exercisesSolved++

    // Задание 11
    /*
    Вычисление номеров строк и столбцов по заданной позиции
    */
    val position = 7
    val row = position / 8
    val column = position % 8
    exercisesSolved++

    // Задание 12
    /*
    Перевод градусов в радианы
    */
    val degrees = 114.6
    val radians = degrees * PI / 180
    exercisesSolved++

    // Задание 13
    /*
    Вычисление расстояния между двумя точками по их координатам
    */
    val x1 = 2.4
    val y1 = 1.5
    val x2 = 4.7
    val y2 = 5.3
    val distance = sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0))
    exercisesSolved++
}
