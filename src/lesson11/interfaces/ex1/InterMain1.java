package lesson11.interfaces.ex1;

public class InterMain1 {
    public static void main(String[] args) {
        Car car = new Car();
        Fish fish = new Fish();
        car.move();
        fish.move();
        fish.eat();
        fish.defaultMethod();

    }
}
