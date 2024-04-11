package lesson10.inner_class;

public class InnerClassExample {
    public static void main(String[] args) {
        Gym gym1 = new Gym("Kanban");
        Gym gym2 = new Gym("Scrum");
        Gym.Equipment dumbbells = gym1.new Equipment("dumbbells", 3000);
        Gym.Equipment bar = gym1.new Equipment("bar", 200);
        Gym.Equipment pool = gym1.new Equipment("pool", 200000);
        gym1.printEquipment();
        System.out.println("===========");
        bar.sellToAnotherGym(gym2, 300);
        gym1.printEquipment();
        System.out.println("==========");
        gym2.printEquipment();
        //Gym.Equipment bar = new Gym("Scrum").new Equipment("bar", 200);
        gym2.addEquipment("Ball", 100);
        gym2.printEquipment();


    }
}
