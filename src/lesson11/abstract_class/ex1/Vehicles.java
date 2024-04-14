package lesson11.abstract_class.ex1;

public abstract class Vehicles {
    private String name;
    private int cost;

    public Vehicles(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public void getInfo(){
        System.out.println("Vehicle's name is: " + name);
        System.out.println("Vehicle's cost is " + cost);
    }

    abstract void move();
    abstract void takeFuel();
}
