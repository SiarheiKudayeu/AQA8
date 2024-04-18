package lesson13.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        //[2,4,5,6,7,8]
        List<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        Iterator<String> iterator = arrayList.iterator();
        System.out.println(arrayList);
        while (iterator.hasNext()) {
            if (iterator.next().equals("Two")) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);

        ListIterator<String> listIterator = arrayList.listIterator();

    }
}
