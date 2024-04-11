package lesson10.static_key_word.fields_methods;

public class ExampleStatic {
    public static String staticString = "staticString";
    public String nonStaticString = "nonStaticString";

    public void nonStaticMethod() {
        System.out.println("nonStaticMethod");
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void printInfoWithHelpOfNonStaticMethod() {
        staticMethod();
        nonStaticMethod();
        System.out.println(staticString);
        System.out.println(nonStaticString);
    }

    public static void printInfoFromStaticMethod(){
        System.out.println(staticString);
        staticMethod();
 /*       nonStaticMethod();
        System.out.println(nonStaticString);*/
    }
}
