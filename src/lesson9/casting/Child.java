package lesson9.casting;

public class Child extends Parent{
    public String[] toys;

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSomething(){
        System.out.println("I do child stuff!!!");
    }
}
