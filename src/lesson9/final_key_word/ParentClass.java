package lesson9.final_key_word;

public class ParentClass {
    public String text = "Text!!";
    public final String finalText = "finalText";


    public void justMethod(){
        System.out.println("I am justMethod");
    }

    public final void justFinalMethod(){
        System.out.println("I am justFinalMethod");
    }
}
