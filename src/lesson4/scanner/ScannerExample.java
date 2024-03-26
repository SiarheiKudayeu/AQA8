package lesson4.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scannerForLesson4 = new Scanner(System.in);
        //Для получения строки
        System.out.println("Insert some text:");
        String textFromScanner = scannerForLesson4.nextLine();
        String[] wordsFromTextFromScanner = textFromScanner.split("\\s");
        String lastWord = wordsFromTextFromScanner[wordsFromTextFromScanner.length-1];
        System.out.println("Final word from textFromScanner is \""+lastWord+"\"");

        //для получения числа
        System.out.println("Insert some number:");
        int myIntFromScanner = scannerForLesson4.nextInt();
        System.out.println("Number from keyboard is \""+myIntFromScanner+"\"");

        //для получения числа c плавающей точкой
        System.out.println("Insert some double:");
        double myDoubleFromScanner = scannerForLesson4.nextDouble();
        System.out.println("Double from keyboard is \""+myDoubleFromScanner+"\"");

    }
}
