fun main() {
    println("Введите число1: ")
    var num1 = readln().toInt()
    println("Введите число2: ")
    var num2 = readln().toInt()
    if (num1 == num2) {
        println("Числа должны быть разные")
    } else if (num1 > 9){
        println("Число1 должно быть меньше 10")
    } else if (num2 > 9){
        println("Число2 должно быть меньше 10")
    }
    var new_num1 = "$num1$num2"
    var new_num2 = "$num2$num1"
    var count = 0
    if (new_num1.toInt() % 2 == 1){
        count++
        println(new_num1)
    }
    if (new_num2.toInt() % 2 == 1){
        count++
        println(new_num2)
    }
    if (count == 0){
        print("Создать нечетное число невозможно");
    }
}