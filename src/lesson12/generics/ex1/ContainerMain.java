package lesson12.generics.ex1;

public class ContainerMain {
    public static void main(String[] args) {
        Container container1 = new Container("Text");
        Container container2 = new Container("Text2");
        //container1.setObject(33);
        String result = "";
        if (container1.getObject() instanceof String && container2.getObject() instanceof String){
            result = (String) container1.getObject() + (String) container2.getObject();
        }else {
            System.out.println("Different types");
        }

        GenericContainer<Integer> genericContainer1 = new GenericContainer<>(32);
        GenericContainer<Integer> genericContainer2 = new GenericContainer<>(44);
        GenericContainer<String> genericContainer3 = new GenericContainer<>("Text");
        GenericContainer<String> genericContainer4 = new GenericContainer<>("Text2");

        int resultInt = genericContainer1.getObject() / genericContainer2.getObject();
        String stringResult = genericContainer3.getObject() + genericContainer4.getObject();

        System.out.println(stringResult);
        System.out.println(stringResult);

        genericContainer4.setObject("Normal");

    }
}
