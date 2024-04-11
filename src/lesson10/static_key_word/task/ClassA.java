package lesson10.static_key_word.task;

public class ClassA {
    public ClassA(){
        System.out.println("Constructor from Class A");
    }

    static {
        System.out.println("Static block Class A");
    }
}
