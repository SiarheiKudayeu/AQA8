package lesson5.arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ArraysForString {
    public static void main(String[] args) {
        String[] arrayString = new String[4];
        System.out.println(Arrays.toString(arrayString));

        //1) Вручную
        arrayString[0] = "Text";
        arrayString[3] = "Text";
        System.out.println(Arrays.toString(arrayString));

     /*   Scanner scanner = new Scanner(System.in);
        arrayString[2] = scanner.nextLine();
        System.out.println(Arrays.toString(arrayString));*/

        //2)Явная
        String[] arrayString2 = {"Text", null, "Scanner", "Text"};
        System.out.println("=========");
        System.out.println(Arrays.toString(arrayString2));

        Scanner[] scanners = new Scanner[4];
        scanners[0] = new Scanner(System.in);
        System.out.println(Arrays.toString(scanners));

        System.out.println("======");
        Object[] objects = new Object[3];
        objects[0] = 13;
        objects[1] = "String";
        objects[2] = new Scanner(System.in);
        System.out.println(Arrays.toString(objects));
    }
}
