package lesson10.static_key_word.task;

public class ClassB extends ClassA{
    public ClassB(){
        System.out.println("Constructor from Class B");
    }

    static {
        System.out.println("Static block Class B");
    }
}
