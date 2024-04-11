package lesson10.static_key_word.nested_class;

public class NestedClassExample {

    public String text = "text";
    public static String staticText = "staticText";

    public void method(){
        System.out.println("method");
    }
    public static String staticMethod(){
        return "staticMethod";
    }

    public static class Url{
        public final static String url1 = "www.www" + staticText;
        private final static String url2 = "www.www" + staticMethod();
    }

    public void openUrl2(){
        System.out.println("I opened " + Url.url2);
    }
}
