package lesson11.abstract_class.ex2;

public class ChildClass extends AbstractClass implements Interface1, Interface2 {
    @Override
    void abstractMethod() {
        System.out.println("abstractMethod");
    }

    @Override
    public void interface1() {
        System.out.println("interface1");
    }

    @Override
    public void doSmth() {
        System.out.println("doSmth");
    }

    @Override
    public void interface2() {
        System.out.println("interface2");
    }
}
