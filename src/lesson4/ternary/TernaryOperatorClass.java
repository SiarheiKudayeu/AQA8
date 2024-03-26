package lesson4.ternary;

import java.util.Scanner;

public class TernaryOperatorClass {
    public static void main(String[] args) {
        // условия ? выражение1 : выражение2

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your age:");
        int age = scanner.nextInt();
        String messageToPrint = age > 18 ? "You are adult" : "Go to school";
        System.out.println(messageToPrint);*/

        //Входит ли введенное число в интервал от 5 до 100?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = scanner.nextInt();
        String result;
        String positiveResult = "введенное число входит в интервал от 5 до 100";
        String negativeResult = "введенное число не входит в интервал от 5 до 100";
        result = number < 5 ? negativeResult : number > 100 ? negativeResult : positiveResult;
        String result2 = number < 5 || number > 100 ? negativeResult : positiveResult;
        System.out.println(result);
        System.out.println(result2);
    }
}
