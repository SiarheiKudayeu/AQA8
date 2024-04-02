package lesson6.arrays_methods_personal;

import java.util.Arrays;
import java.util.Random;

public class FindArrayMinimumClass {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayRandom = new int[random.nextInt(5, 10)];
        for(int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = random.nextInt(-30, 30);
        }
        System.out.println(Arrays.toString(arrayRandom));

        int minimum = arrayRandom[0];
        for(int i = 0; i < arrayRandom.length; i++){
            if(minimum > arrayRandom[i]){
                minimum = arrayRandom[i];
            }
        }
        System.out.println("Minimum from array is: " + minimum);
    }
}
