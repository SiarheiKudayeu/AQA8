package lesson9.casting;

public class Parent {
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name;
    public int age;

    public void doSomething(){
        System.out.println("I am a Parent. I do adult things!!!");
    }
}
