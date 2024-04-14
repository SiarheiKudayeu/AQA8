package lesson11.abstract_class.ex1;

public class AbstractMain1 {
    public static void main(String[] args) {
    /*    Sportable sportable = new Sportable() {
            @Override
            public void doSport() {
                System.out.println("Do do do!!");
            }
        };

        sportable.doSport();*/
        //Vehicles vehicles = new Vehicles("Plane", 299392);

        Bus bus = new Bus("Bus", 20000);
        bus.move();
        bus.getInfo();
        System.out.println("=======");
        Cucuruznik plane1 = new Cucuruznik("Cucuruznik", 40000);
        plane1.takeFuel();
        plane1.getInfo();
        plane1.move();
    }
}
