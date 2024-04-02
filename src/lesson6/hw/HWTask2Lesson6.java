package lesson6.hw;

import java.util.Scanner;

public class HWTask2Lesson6 {
    public static void main(String[] args) {
        String[] names = {"Name1", "Name2", "Name3", "Name4", "Name5"};
        String result = "Your name is {NAME}";
        System.out.println("Insert Index of your name from 0 till 4:");
        int indexOfName = new Scanner(System.in).nextInt();
        while (indexOfName < 0 || indexOfName > 4) {
            System.out.println("Insert Index of your name from 0 till 4:");
            indexOfName = new Scanner(System.in).nextInt();
        }
        System.out.println(result.replace("{NAME}", names[indexOfName]));
    }
}
