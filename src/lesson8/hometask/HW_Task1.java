package lesson8.hometask;

import java.util.Scanner;

public class HW_Task1 {
            /*Написати програму, використовуючи тернарний оператор,
            де користувач вводить з клавіатури два числа і символ – + або % або / або *.
        На екран виводиться результат дії над двома введеними числами.
        Якщо користувач ввів щось окрім даних символів, необхідно вивести 0.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        String char1 = scanner.next();

        double result = char1.equals("-") ? num1 - num2 :
                char1.equals("+") ? num1 + num2 :
                        char1.equals("%") ? num1 % num2 :
                                char1.equals("/") ? num1 / num2 :
                                        char1.equals("*") ? num1 * num2 : 0;
        System.out.println(result);
    }
}
