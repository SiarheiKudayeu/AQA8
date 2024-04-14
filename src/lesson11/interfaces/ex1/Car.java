package lesson11.interfaces.ex1;

public class Car implements Movable{
    @Override
    public void move() {
        System.out.println("I can drive");
    }

    @Override
    public void moveBack() {
        System.out.println("I can drive back");
    }
}
