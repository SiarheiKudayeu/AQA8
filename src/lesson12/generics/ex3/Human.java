package lesson12.generics.ex3;

public class Human extends Humanable{

    public Human(String name) {
        super(name);
        this.type = Type.HUMAN;
    }

    @Override
    public void askWhoAmI() {
        System.out.println("My name is "+ name + ". My type is " + type);
    }
}
