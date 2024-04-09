package lesson9.access_modifier;

import lesson9.access_modifier.package1.Class1;
import lesson9.access_modifier.package1.Class2;
import lesson9.access_modifier.package2.Class3;
import lesson9.access_modifier.package2.Class4;

public class AccessMain {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();
        class1.printFieldsFromClass1();
        class2.printFieldsFromClass1();
        class3.printFieldsFromClass1();
        class4.printFieldsFromClass11();
    }
}
