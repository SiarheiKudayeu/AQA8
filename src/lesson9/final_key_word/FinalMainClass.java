package lesson9.final_key_word;

import java.util.Locale;

public class FinalMainClass {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.text = "new text";
        //parentClass.finalText = "new final text";

        final String finalText2 = "finalText";
        //finalText2 = finalText2.toLowerCase();
        System.out.println(finalText2);
    }
}
