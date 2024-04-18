package lesson13.collection.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

    public static void fillList(List<Integer> list, int countOfElements){
        for (int i = 0; i < countOfElements; i++){
            list.add(i);
        }
    }

    public static void getElementFromListWithCycle(List<Integer> list, int countOfElements){
        for (int i = 0; i < countOfElements; i++){
            list.get(i);
        }
    }

    public static void fillListFromCentre(List<Integer> list, int countOfElements){
        for (int i = 0; i < countOfElements; i++){
            list.add(30, i);
        }
    }
    public static void main(String[] args) {
      /*  List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            linkedList.add(i);
        }

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arrayList.add(i);
        }

        System.out.println(linkedList);
        System.out.println(arrayList);*/

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        fillList(linkedList, 1000);
        fillList(arrayList, 1000);
        long start = System.nanoTime();
        getElementFromListWithCycle(linkedList, 1000);
        long finish = System.nanoTime();
        System.out.println("Time to get elements from linked list is " + (finish - start));

        long start1 = System.nanoTime();
        getElementFromListWithCycle(arrayList, 1000);
        long finish1 = System.nanoTime();
        System.out.println("Time to get elements from array list is " + (finish1 - start1));

        List<Integer> linkedList1 = new LinkedList<>();
        List<Integer> arrayList1 = new ArrayList<>();

        fillList(linkedList1, 1000);
        fillList(arrayList1, 1000);
        long start2 = System.nanoTime();
        fillListFromCentre(linkedList1, 1000);
        long finish2 = System.nanoTime();
        System.out.println("Time to add elements to centre from linked list is " + (finish2 - start2));

        long start3 = System.nanoTime();
        fillListFromCentre(arrayList1, 1000);
        long finish3 = System.nanoTime();
        System.out.println("Time to add elements to centre from array list is " + (finish3 - start3));

    }
}
