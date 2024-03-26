package lesson4.if_else;

import java.util.Scanner;

public class IfElseClass {
    /*

    if(условие){
    если условие == true
    }else{
    если условие == false
    }

    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some number:");
        int number = scanner.nextInt();
        if (number > 0) {
            if (number == 300) {
                System.out.println("You are lucky!!! You have won!!! You've entered 300");
            } else {
                System.out.println("Your printed number " + number + " is positive");
            }
        } else if (number < 0) {
            System.out.println("Your printed number " + number + " is negative");
        } else {
            System.out.println("You inserted zero");
        }
        scanner.close();
    }
}
