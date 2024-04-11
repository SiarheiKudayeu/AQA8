package lesson10.static_key_word.fields_methods;

public class MainForExampleStatic {
    public static void main(String[] args) {
        ExampleStatic exampleStatic = new ExampleStatic();
        System.out.println(exampleStatic.nonStaticString);
        System.out.println(ExampleStatic.staticString);
        System.out.println(exampleStatic.staticString);
        System.out.println("================");
        ExampleStatic.staticMethod();
        exampleStatic.nonStaticMethod();
        exampleStatic.staticMethod();
        System.out.println("=========");
        exampleStatic.printInfoWithHelpOfNonStaticMethod();
        System.out.println("=========");
        ExampleStatic.printInfoFromStaticMethod();
        System.out.println("=========");
        exampleStatic.printInfoFromStaticMethod();
    }
}
