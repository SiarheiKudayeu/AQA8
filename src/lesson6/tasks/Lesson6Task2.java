package lesson6.tasks;

import java.util.Arrays;
import java.util.Random;

public class Lesson6Task2 {
    /*
1)Заполнить массив на 10 элементов случайными числами
от -50 до +50.
Вывестив консоль сам массив.
Вывести в консоль сумму всех его элементов.
*/
    public static void main(String[] args) {
        int[] i = new int[10];
        Random random = new Random();
        int sum = 0;
        for (int j = 0; j < i.length; j++) {
            i[j] = random.nextInt(-50, 50);
            sum = sum + i[j];
        }
        System.out.println(Arrays.toString(i));
        System.out.println(sum);
    }
}
