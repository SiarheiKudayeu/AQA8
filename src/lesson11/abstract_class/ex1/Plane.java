package lesson11.abstract_class.ex1;

public abstract class Plane extends Vehicles{
    public Plane(String name, int cost) {
        super(name, cost);
    }

    @Override
    void move() {
        System.out.println("I believe I can fly!!!");
    }
}
