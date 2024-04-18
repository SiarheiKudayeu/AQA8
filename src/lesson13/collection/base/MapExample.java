package lesson13.collection.base;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void fillMap(Map<Integer, String> map) {
        map.put(3, "Leonid");
        map.put(676, "Sam");
        map.put(1, "Anna");
        map.put(4, "Alisa");
        map.put(22, "Rex");
        map.put(7, "Taras");
        map.put(99, "Gleb");
    }

    public static void main(String[] args) {
        //HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        fillMap(hashMap);
        System.out.println(hashMap);

        //LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        fillMap(linkedHashMap);
        System.out.println(linkedHashMap);

        //TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        fillMap(treeMap);
        System.out.println(treeMap);
    }
}
