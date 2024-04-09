package lesson9.casting;

public class CastingMain {
    public static void main(String[] args) {
        Parent child1 = new Child("Matvii", 5);
        child1.doSomething();

        Parent child2 = new OtherChild("Alona", 6);
        child2.doSomething();

        Child child3 = new Child("Alex", 12);

        Parent parent = new Parent("Mat", 34);

        System.out.println("===========");
        Parent[] children = {child1, child2, child3, parent};
        for (Parent person: children){
            person.doSomething();
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
        }



    }
}
