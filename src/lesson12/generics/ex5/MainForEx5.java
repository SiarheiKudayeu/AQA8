package lesson12.generics.ex5;

public class MainForEx5 {
    public static void main(String[] args) {
        action(new ClassWithTwoGenerics<>(33, "Text"));
        division(new ClassWithTwoGenerics<>(333, 11.0));
    }
    public static void action(ClassWithTwoGenerics<?,?> classWithTwoGenerics){
        System.out.println(classWithTwoGenerics.getFirstType());
        System.out.println(classWithTwoGenerics.getSecondType());
    }

    public static void division(ClassWithTwoGenerics<? extends Number,? extends Number> classWithTwoGenerics){
        System.out.println(classWithTwoGenerics.getFirstType().doubleValue()/classWithTwoGenerics.getSecondType().doubleValue());
    }


}
