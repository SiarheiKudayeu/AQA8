package lesson12.generics.ex4;

import lesson11.interfaces.ex2.CrossFitMan;
import lesson12.generics.ex3.*;
import lesson9.lesson.NewBear;

public class GenericsMethodClass {
    public static void main(String[] args) {
        printWhatever(new NewBear("Masha", false));
        printWhateverWithTwoArguments(new CrossFitMan("Ivan"), new Hobbit("Frodo"));
        workWithHumanable(new Hobbit("Frodo"));
        printOnlyHumanable(new GenericHumanInside<>(new HorseMan("Oleg")));
    }

    public static <T> void printWhatever(T value) {
        System.out.println(value);
    }

    public static <T, T1> void printWhateverWithTwoArguments(T value, T1 value1) {
        System.out.println(value);
        System.out.println(value1);
    }

    public static <T extends Humanable> void workWithHumanable(T instance) {
        System.out.println(instance);
    }

    public static void printOnlyHumanable(GenericHumanInside<?> humanInside){
        System.out.println(humanInside.getHumanable());
    }

/*    public static <T> int returnIntWhatever(T value){
        return (int) value;
    }*/
}
