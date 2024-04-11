package lesson10.static_key_word.task;

public class ClassD extends ClassC{
    public ClassD(){
        System.out.println("Constructor from Class D");
    }

    static {
        System.out.println("Static block Class D");
    }
}
