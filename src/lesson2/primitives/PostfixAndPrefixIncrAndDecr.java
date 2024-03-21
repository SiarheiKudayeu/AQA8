package lesson2.primitives;

public class PostfixAndPrefixIncrAndDecr {
    public static void main(String[] args) {
        //постфиксный инкремент a = a + 1;
        int a = 5;
        System.out.println(a++);   //a = a + 1; a=6
        System.out.println(a);
        System.out.println("===================");
        //префиксный инкремент
        int b = 5;
        System.out.println(++b);
        System.out.println(b);
        System.out.println("===================");
        //постфиксный декремент
        int c = 5;
        System.out.println(c--);
        System.out.println(c);
        System.out.println("===================");
        //префиксный декремент
        int d = 5;
        System.out.println(--d);
        System.out.println(d);
    }
}
