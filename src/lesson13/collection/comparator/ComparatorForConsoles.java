package lesson13.collection.comparator;

import java.util.Comparator;

public class ComparatorForConsoles implements Comparator<Consoles> {
    @Override
    public int compare(Consoles o1, Consoles o2) {
        return o1.getCost() - o2.getCost();
    }
}
