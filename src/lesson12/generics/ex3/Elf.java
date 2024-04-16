package lesson12.generics.ex3;

public class Elf extends Humanable{
    public Elf(String name) {
        super(name);
        this.type = Type.ELF;
    }

    @Override
    public void askWhoAmI() {
        System.out.println("My name is "+ name + ". My type is " + type);
    }
}
