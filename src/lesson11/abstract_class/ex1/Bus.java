package lesson11.abstract_class.ex1;

public class Bus extends Vehicles{
    public Bus(String name, int cost) {
        super(name, cost);
    }

    @Override
    void move() {
        System.out.println("I drive from bus stop to another bus stop :)");
    }

    @Override
    void takeFuel() {
        System.out.println("Bus fuel");
    }
}
