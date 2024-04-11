package lesson10.recursion;

import java.util.Scanner;

public class RecursionTask2 {
    //Пользователь вводит с клавиатуры сумму, которую он хочет взять в кредит, а также сумму
//которую он будет выплачивать каждый месяц. В консоль выводится порядковый номер месяца,
// и сумма оставшаяся для выплаты кредита. Как только кредит погашен, в консоль выводится
//фраза: Кредит погашен за {кол-во месяцев}.
    public static void main(String[] args) {
        RecursionTask2 r = new RecursionTask2();
        r.takeCredit();
    }

    private void credit(int sum, int monthlyPay, int counter) {
        sum = sum - monthlyPay;
        System.out.println("Month number " + counter + ". You need to pay " + sum + " more!");
        if (sum <= 0) {
            System.out.println("Credit already done in " + counter + " month.");
        } else {
            counter++;
            credit(sum, monthlyPay, counter);
        }
    }

    public void takeCredit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert sum of money that you want to take:");
        int sumOfMoney = scanner.nextInt();
        System.out.println("Insert you monthly pay:");
        int monthlyPay = scanner.nextInt();
        credit(sumOfMoney, monthlyPay, 1);
    }
}
