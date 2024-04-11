package lesson10.static_key_word.task;

public class ClassC extends ClassB{
    public ClassC(){
        System.out.println("Constructor from Class C");
    }

    static {
        System.out.println("Static block Class C");
    }
}
