package lesson11.interfaces.ex1;

public interface Eatable {
    void eat();

    default void defaultMethod(){
        System.out.println("I am default");
    }
}
