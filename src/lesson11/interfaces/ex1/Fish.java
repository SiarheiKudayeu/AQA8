package lesson11.interfaces.ex1;

public class Fish implements Movable, Eatable{
    @Override
    public void move() {
        System.out.println("I can swim like a dolphin...");
    }

    @Override
    public void moveBack() {
        System.out.println("I can't swim back");
    }

    @Override
    public void eat() {
        System.out.println("I eat worms!!!");
    }
}
