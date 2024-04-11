package lesson10.recursion;

public class RecursionTask1 {
    //Пользователь вводит положительное число с клавиатуры,
// а система выводит в консоль все числа от введенного,
//до 0. При решении данной задачи попробовать использовать рекурсию
    public static void main(String[] args) {
        RecursionTask1 r = new RecursionTask1();
        r.printAllNumbers(10);
    }

    private void printAllNumbers(int number) {
        if (number == 0) {
            System.out.println(number);
        } else if (number < 0) {
            System.out.println("Below Zero");
        } else {
            System.out.println(number);
            number--;
            printAllNumbers(number);
        }


    }
}
