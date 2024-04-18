package lesson13.collection.base;

import java.util.*;

public class MapExample2 {
    public static <K, V> V getValueByKey(Map<K, V> map, K key){
        V result = null;
        for(Map.Entry<K, V> entry: map.entrySet()){
            if(entry.getKey().equals(key)){
                result = entry.getValue();
                break;
            }
        }
        return result;
    }
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
        Map<Integer, String> hashMap = new HashMap<>();
        fillMap(hashMap);
        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);

        Collection<String> values = hashMap.values();
        System.out.println(values);

        System.out.println(getValueByKey(hashMap, 676));
        System.out.println(getValueByKey(hashMap, 111));
    }
}
