package lesson9.access_modifier.package1;

public class Class1 {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        System.out.println(class1.publicString);
    }
    public String publicString = "publicString";
    private String privateString = "privateString";

    public String getPublicString() {
        return publicString;
    }

    public String getPrivateString() {
        return privateString;
    }

    public String getProtectedString() {
        return protectedString;
    }

    public String getDefaultString() {
        return defaultString;
    }

    protected String protectedString = "protectedString";
    String defaultString = "defaultString";

    public void printFieldsFromClass1(){
        Class1 class1 = new Class1();
        System.out.println(class1.publicString);
        System.out.println(class1.privateString);
        System.out.println(class1.protectedString);
        System.out.println(class1.defaultString);
    }
}
