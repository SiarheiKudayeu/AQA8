package lesson9.casting;

public class OtherChild extends Parent{
    public String field;

    public OtherChild(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSomething(){
        System.out.println("I do other child stuff!!!");
    }
}
