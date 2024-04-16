package lesson12.exception.ex2;

import java.util.Scanner;

public class ExceptionExampleClass2 {
    public static void main(String[] args) {
/*        System.out.println("1");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("1");*/

        int[] array = {12, 15, 77, 0, 33};
        System.out.println("Insert index of array:");
        try {
            System.out.println(15 / array[new Scanner(System.in).nextInt()]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Away from Index");
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("All is still working");
    }
}
