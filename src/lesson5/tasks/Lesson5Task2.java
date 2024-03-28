package lesson5.tasks;

import java.util.Scanner;

public class Lesson5Task2 {
    /*
1)Программа просит ввести с клавиатуры число.
При помощи тернарного оператора вывести в консоль сообщение типа String,
является ли введенное число
больше нуля, меньше нуля, или оно равно нулю.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        String result = a > 0 ? "Больше нуля" : a < 0 ? "Меньше нуля" : "Равно нулю";
        System.out.println(result);
    }
}
