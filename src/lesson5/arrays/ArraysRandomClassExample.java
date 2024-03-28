package lesson5.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysRandomClassExample {
    public static void main(String[] args) {
        //Вариант 1
        Random randomObject = new Random();
        int randomInteger = randomObject.nextInt(-20, 21);
        System.out.println(randomInteger);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomObject.nextInt(-20, 21);
        }
        System.out.println(Arrays.toString(array));

        //Вариант2
        int randomInt2 = (int) ((Math.random() * 41) - 20);   //-4 -3 -2 -1 0 1 2 3 4
        System.out.println(randomInt2);

        //Получение случайного элемент массива
        String[] words = {"One", "Two", "Three", "Four", "Five", "Six"};
        int randonIndex = randomObject.nextInt(words.length);
        String randomWord = words[randonIndex];
        System.out.println(words[randomObject.nextInt(words.length)]);
    }
}
