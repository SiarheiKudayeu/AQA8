package lesson11.howework;

import lesson6.my_own_methods.MyArrayMethods;

import java.util.Arrays;
import java.util.Random;

public class Less10HW3 {
    public static void main(String[] args) {
        int[][] numbersMultiple = {{33, 54, 2}, {1, 4, 6}, {12, 44, 8}};
        int[] numbersSingle = new int[numbersMultiple.length];
        System.out.println(MyArrayMethods.returnMaximumFromArray(new int[]{33, 54, 2}));
        for (int i = 0; i < numbersSingle.length; i++) {
            numbersSingle[i] = MyArrayMethods.returnMaximumFromArray(numbersMultiple[i]);
        }
        System.out.println(Arrays.toString(numbersSingle));

        int[] array = new int[new Random().nextInt(30)];
        MyArrayMethods.arrayFill(array, 0, 45);
        System.out.println(Arrays.toString(array));

        int[][] numbersMultiple2 = new int[new Random().nextInt(10)][new Random().nextInt(10)];
        for (int i = 0; i < numbersMultiple2.length; i++) {
            MyArrayMethods.arrayFill(numbersMultiple2[i], -20, 20);
        }

        System.out.println(Arrays.deepToString(numbersMultiple2));

        System.out.println(Arrays.toString(MyArrayMethods.reverseSort(numbersSingle)));
    }
}
