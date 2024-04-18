package lesson13.collection.base;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void fillSet(Set<String> set){
        set.add("auto");
        set.add("car");
        set.add("helicopter");
        set.add("boat");
        set.add("plane");
        set.add("bus");
        set.add("cycle");
        set.add("car");
    }

    public static void main(String[] args) {
        //HashSet
        Set<String> hashSet = new HashSet<>();
        fillSet(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet);

        //LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        fillSet(linkedHashSet);
        System.out.println(linkedHashSet);

        //TreeSet
        Set<String> treeSet = new TreeSet<>();
        fillSet(treeSet);
        System.out.println(treeSet);
    }
}
