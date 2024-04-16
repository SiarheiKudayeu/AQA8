package lesson12.exception.ex1;

import lesson12.generics.ex1.Container;
import lesson12.generics.ex3.Elf;

import java.util.Scanner;

public class ExceptionExampleClass1 {
    public static void main(String[] args) {
       /* //ArithmeticException
        System.out.println(13/0);*/

     /*   //ArrayIndexOutOfBoundsException
        int[] array = new int[3];
        System.out.println(array[-1000]);*/

/*        //ClassCastException
        Container container1 = new Container("Text");
        Container container2 = new Container(33);
        System.out.println(container1.getObject() + (String)container2.getObject());*/

/*        //NullPointerException
        Elf elf = null;
        elf.askWhoAmI();*/
        try {
            int x = 15;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert Number");
            int y = scanner.nextInt();
            System.out.println(x/y);
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("I am FINALLY!!!!");
        }
        System.out.println("Hello");
    }
}
