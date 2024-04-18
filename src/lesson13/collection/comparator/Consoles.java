package lesson13.collection.comparator;

import java.util.*;

public class Consoles {
    public Consoles(Name type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    public static void main(String[] args) {
        ArrayList<Consoles> consoles = new ArrayList<>();
        consoles.add(new Consoles(Name.PLAYSTATION, 5000));
        consoles.add(new Consoles(Name.NINTENDO, 4000));
        consoles.add(new Consoles(Name.XBOX, 4500));
        System.out.println(consoles);

        ComparatorForConsoles comparator = new ComparatorForConsoles();
        consoles.sort(comparator);
        System.out.println(consoles);

        consoles.sort(comparator.reversed());
        System.out.println(consoles);

        Comparator<Consoles> comparatorByName = new Comparator<Consoles>() {
            @Override
            public int compare(Consoles o1, Consoles o2) {
                return o1.getType().getName().compareTo(o2.getType().getName());
            }
        };

        //Comparator<Consoles> comparatorByName = Comparator.comparing(o -> o.getType().getName());
        System.out.println("=================");
        consoles.sort(comparatorByName);
        System.out.println(consoles);

        consoles.sort(comparatorByName.reversed());
        System.out.println(consoles);
    }

    private Name type;
    private int cost;

    public Name getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }


    @Override
    public String toString() {
        return "type=" + type.getName() +
                ", cost=" + cost;
    }

    public enum Name {
        PLAYSTATION("Playstation"), XBOX("Xbox"), NINTENDO("Nintendo");
        private String name;

        public String getName() {
            return name;
        }

        Name(String name) {
            this.name = name;
        }
    }
}
