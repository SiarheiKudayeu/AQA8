package lesson7.overload;

import lesson6.my_own_methods.MyArrayMethods;
import lesson7.oop.Lesson7Tasks;

import java.util.Random;

public class OverLoadExample {
    public static void main(String[] args) {
        OverLoadExample o = new OverLoadExample();
        o.doSmth();
        o.doSmth("OverLoading :)");
        o.doSmth(3);
        o.doSmth("TEXT!!!!", 67);
        o.doSmth(65, "Text");
        o.doSmth(new int[]{34, 546, 566, 5666, 66});
    }

    public void doSmth() {
        System.out.println("I am empty!!!");
    }

    public void doSmth(String text) {
        System.out.println("Text from parameters is " + text);
    }

    public void doSmth(int number) {
        System.out.println("You inserted number " + number);
    }

    public void doSmth(int[] array) {
        Lesson7Tasks l = new Lesson7Tasks();
        l.arraySort(array);
        l.printArrayOnIntToConsole(array);
    }

    public void doSmth(int number, String text) {
        System.out.println("$$$$$$$$$");
        System.out.println("Text from parameters is " + text);
        System.out.println("You inserted number " + number);
        System.out.println("$$$$$$$$$$");
    }

    public void doSmth(String text, int number) {
        System.out.println("================");
        System.out.println("Text from parameters is " + text);
        System.out.println("You inserted number " + number);
        System.out.println("================");
    }
}
