package lesson9.home;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberString = String.valueOf(number);
        /*String reverse = "";
        for(int i = numberString.length() - 1; i > -1; i-- ){
            reverse = reverse + numberString.charAt(i);
        }
        if(reverse.equals(numberString)){
            System.out.println("Number " + number + " is palindrome");
        }else {
            System.out.println("Number " + number + " is not palindrome");
        }*/

        StringBuilder builder = new StringBuilder(numberString);
        String revert = String.valueOf(builder.reverse());
        if(revert.equals(numberString)){
            System.out.println("Number " + number + " is palindrome");
        }else {
            System.out.println("Number " + number + " is not palindrome");
        }
    }
}
