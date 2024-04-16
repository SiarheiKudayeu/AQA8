package lesson12.generics.ex3;

public class HorseMan extends Humanable{
    public HorseMan(String name) {
        super(name);
        this.type = Type.HORSEMAN;
    }

    @Override
    public void askWhoAmI() {
        System.out.println("My name is "+ name + ". My type is " + type);
    }
}
