package lesson9.access_modifier.package2;

import lesson9.access_modifier.package1.Class1;

public class Class4 extends Class1 {

    public void printFieldsFromClass11(){
        System.out.println(protectedString);
        System.out.println(publicString);

        Class1 class1 = new Class1();
        System.out.println(class1.publicString);
        System.out.println(class1.getDefaultString());
        System.out.println(class1.getPrivateString());
        System.out.println(class1.getProtectedString());
    }
    public static void main(String[] args) {
      /*  Class1 class1 = new Class1();
        lesson9.access_modifier.package1.Class1 class11 = new lesson9.access_modifier.package1.Class1();
       */
    }
}
