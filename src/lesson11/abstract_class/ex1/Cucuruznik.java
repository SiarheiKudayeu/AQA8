package lesson11.abstract_class.ex1;

public class Cucuruznik extends Plane{
    public Cucuruznik(String name, int cost) {
        super(name, cost);
    }

    @Override
    void takeFuel() {
        System.out.println("Cucuruznik fuel");
    }


}
