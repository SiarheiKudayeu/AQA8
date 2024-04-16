package lesson12.generics.ex3;

public class Hobbit extends Humanable{
    public Hobbit(String name) {
        super(name);
        this.type = Type.HOBBIT;
    }

    @Override
    public void askWhoAmI() {
        System.out.println("My name is "+ name + ". My type is " + type);
    }
}
