package lesson5.arrays;

import java.util.Arrays;

public class ArraysExampleClass {
    public static void main(String[] args) {
        int[] arrayInt = new int[4];
        int[] arrayInt2 = new int[4];
        int firstValue = arrayInt[0];
        System.out.println(firstValue);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);
        System.out.println(arrayInt[3]);
        System.out.println(arrayInt.equals(arrayInt2));

        //поле length
        System.out.println("Размер массива " + arrayInt.length);
        System.out.println("=============");
        //вывод массива в консоль for()
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("");
        //вывод массива в консоль toString()
        String arrayIntValues = Arrays.toString(arrayInt);
        System.out.println(arrayIntValues);

        //Способы иницифлизации элеметов массива
        //1) Вручную
        System.out.println("===================");
        arrayInt[0] = 12;
        arrayInt[1] = 13;
        arrayInt[2] = 1213;
        arrayInt[3] = 1;
        System.out.println(Arrays.toString(arrayInt));

        //2) Явная инициализация
        int[] arrayInt3 = {4, 12, 2424, 343, 343, 44};
        System.out.println(Arrays.toString(arrayInt3));
        System.out.println("Размерность массива arrayInt3 " + arrayInt3.length);

        //3) цикл for
        System.out.println("=========");
        int[] forArray = new int[20];
        for (int i = 0; i < forArray.length; i++) {
            forArray[i] = (i + 1) * 10;
        }
        System.out.println(Arrays.toString(forArray));
    }
}
