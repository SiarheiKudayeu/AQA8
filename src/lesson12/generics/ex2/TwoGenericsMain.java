package lesson12.generics.ex2;

import lesson9.lesson.NewBear;

public class TwoGenericsMain {
    public static void main(String[] args) {
        ClassWithTwoGenerics<String, NewBear> generics = new ClassWithTwoGenerics<>(
                new String("Text"), new NewBear("Miha", false));

        generics.printInfoAboutFirstField();
        generics.printInfoAboutSecondField();

    }
}
