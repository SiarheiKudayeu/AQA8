package lesson8.hometask;

import java.util.Scanner;

public class HW_Task2 {
            /*Написати програму, використовуючи тернарний оператор,
            де користувач вводить з клавіатури два числа і символ – + або % або / або *.
        На екран виводиться результат дії над двома введеними числами.
        Якщо користувач ввів щось окрім даних символів, необхідно вивести 0.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //13%5 13+5 13-5 13/5 13*5
        String action = scanner.nextLine();
        if (action.contains("%") || action.contains("*") ||
                action.contains("-") || action.contains("+") || action.contains("/")) {
            double number1 = Double.parseDouble(action.split("[%+\\-/*]")[0]);
            double number2 = Double.parseDouble(action.split("[%+\\-/*]")[1]);
            double result = action.contains("%") ? number1 % number2 :
                    action.contains("+") ? number1 + number2 :
                            action.contains("-") ? number1 - number2 :
                                    action.contains("/") ? number1 / number2 :
                                            action.contains("*") ? number1 * number2 : 0;
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
