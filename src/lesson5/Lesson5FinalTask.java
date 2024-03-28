package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5FinalTask {
    //Пользователь вводит строку с клавиатуры. Все цифры из данной строки
    //должны быть помещены в массив. Массив необходимо отсортировать по возрастанию
    //и вывести на экран.
    //afbasfb89abfafb74kjbkljashg904j8;kj;h498
    public static void main(String[] args) {
        /*char numeric = '6';
        char nonNumeric = 'e';
        System.out.println(Character.isDigit(numeric));
        System.out.println(Character.isDigit(nonNumeric));
        String withNumbers = "wfefe3lklkj4lkjlk4";
        String withoutNumbers = "lklklklklkj";
        System.out.println(withNumbers.split("\\d").length);
        System.out.println(withoutNumbers.split("\\d").length);*/
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String result = "";
        if (text.split("\\d").length == 1) {
            System.out.println("В данном тексте нет числовых значений");
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) {
                    result = result + text.charAt(i);
                    while (i + 1 != text.length() && Character.isDigit(text.charAt(i + 1))) {
                        i = i + 1;
                        result = result + text.charAt(i);
                    }
                    result = result + " ";
                }
            }
        }
        result = result.trim();
        System.out.println(result);

        String[] resultArrayString = result.split("\\s");
        int[] arrayInt = new int[resultArrayString.length];
        for (int i = 0; i < resultArrayString.length; i++){
            arrayInt[i] = Integer.parseInt(resultArrayString[i]);
        }

        System.out.println(Arrays.toString(arrayInt));

    }
}
