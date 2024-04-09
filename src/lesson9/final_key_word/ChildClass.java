package lesson9.final_key_word;

public class ChildClass extends ParentClass {

    @Override
    public void justMethod() {
        System.out.println("I can override justMethod");
    }

 /*   @Override
    public final void justFinalMethod() {
        System.out.println("I am justFinalMethod");
    }*/
}
