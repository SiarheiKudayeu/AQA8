package lesson12.hw_lesson12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson12_HW2 {
    public static void printAim(String[][] aim){
        for (String[] line: aim){
            System.out.println(Arrays.toString(line));}
    }

    public static void shootAim(String[][] aim, int number1, int number2){
        aim[number1][number2] = "v";
    }
    /*
      0 1 2 3 4 5
      1 - - - - -
      2 - - - - -
      3 - - - - -
      4 - - - - -
      5 - - - - -
      */
    public static void main(String[] args) {
        String[][] aim = {{"0","1","2","3","4","5"},
                {"1","-","-","-","-","-"},
                {"2","-","-","-","-","-"},
                {"3","-","-","-","-","-"},
                {"4","-","-","-","-","-"},
                {"5","-","-","-","-","-"}};

        printAim(aim);

        int[] target = new int[2];
        target[0] = new Random().nextInt(1,6);
        target[1] = new Random().nextInt(1,6);
        System.out.println(Arrays.toString(target));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number1");
        int number1 = scanner.nextInt();

        System.out.println("Insert number2");
        int number2 = scanner.nextInt();

        while (true){
            if(number1==target[0] && number2 == target[1]){
                System.out.println("Congrats");
                aim[number1][number2] = "X";
                printAim(aim);
                break;
            }
            shootAim(aim, number1, number2);
            printAim(aim);
            System.out.println("Insert number1");
            number1 = scanner.nextInt();

            System.out.println("Insert number2");
            number2 = scanner.nextInt();
        }

    }



}
