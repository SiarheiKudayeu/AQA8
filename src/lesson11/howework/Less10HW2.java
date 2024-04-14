package lesson11.howework;

import java.util.Random;
import java.util.Scanner;

public class Less10HW2 {
    /*• За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
     та пропонує гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name.
      • Перед початком на екран виводиться текст:
       Let the game begin! • Сам процес гри обробляється у нескінченному циклі.
        • Гравцеві пропонується ввести число в консоль, після чого програма
         порівнює загадану кількість з тим, що ввів користувач.
         • Якщо введене число менше загаданого, програма виводить на екран текст:
          Your number is too small. Please, try again..
          Якщо введене число більше за загадане, то програма виводить на екран текст:
           Your number is too big. Please, try again..
            Якщо введене число відповідає загаданому,
            то програма виводить текст: Congratulations, {name}!*/
    public static void main(String[] args) {
        int randomValue = new Random().nextInt(100);
        System.out.println("Let the game begin! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your name:");
        String name = scanner.nextLine();
        System.out.println(randomValue);
        System.out.println("Insert value:");
        int myValue = scanner.nextInt();
        if (myValue == randomValue) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            while (true) {
                if (myValue > randomValue) {
                    System.out.println("Your number is too big. Please, try again..");
                    System.out.println("Insert value:");
                    myValue = scanner.nextInt();
                } else if (myValue < randomValue) {
                    System.out.println("Your number is too small. Please, try again..");
                    System.out.println("Insert value:");
                    myValue = scanner.nextInt();
                } else {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            }
        }
    }
}
