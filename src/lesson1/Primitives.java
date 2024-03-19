package lesson1;

public class Primitives {
    public static void main(String[] args) {
        System.out.println("========Целочисленный примитивный тип данных=======");
        //Целочисленный примитивный тип данных
        //byte -128 till 127
        byte myByte = 45;
        System.out.println("My byte " + myByte);

        // short -32768 till 32767
        short myShort = 300;
        System.out.println("My short " + myShort);

        // int -2^31 till 2^31-1
        int myInt = 327673;
        System.out.println("My Int " + myInt);

        // long -2^63 till 2^63 -1
        long myLong = 1241412412;
        System.out.println("My Long " + myLong);
        System.out.println("========Числа с плавающей точкой======");
        //Числа с плавающей точкой
        //float
        float myFloat = 6.0F;
        System.out.println("My Float " + myFloat);

        //double
        double myDouble = 14.54;
        System.out.println("My double" + myDouble);
    }
}

