package lesson13.collection.comparable;

import java.util.Set;
import java.util.TreeSet;

public class Consoles implements Comparable<Consoles> {
    public Consoles(Name type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    public static void main(String[] args) {
        Set<Consoles> consoles = new TreeSet<>();
        consoles.add(new Consoles(Name.PLAYSTATION, 5000));
        consoles.add(new Consoles(Name.NINTENDO, 4000));
        consoles.add(new Consoles(Name.XBOX, 4500));

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

    /* @Override
     public int compareTo(Consoles o) {
         if (this.cost > o.cost) {
             return 1;
         } else if (this.cost < o.cost) {
             return -1;
         } else {
             return 0;
         }
     }*/
/*    @Override
    public int compareTo(Consoles o) {
        return o.cost - this.cost;
    }*/

    @Override
    public int compareTo(Consoles o) {
        return o.type.getName().compareTo(this.type.getName());
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
