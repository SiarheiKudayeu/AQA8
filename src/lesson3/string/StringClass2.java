package lesson3.string;

public class StringClass2 {
    public static void main(String[] args) {
        //replace()
        String text = "My text for replace example";
        System.out.println(text.replace("text", "AQA8"));
        System.out.println(text);
        System.out.println(text = text.replace("text", "@@@@!!!@@@@"));
        System.out.println(text);

        System.out.println("========");
        //equals, not ==
        int a = 8;
        int c = 12;
        System.out.println(8 == 12);
        String one = "one";
        String two = "one";
        boolean result = one.equals(two); //
        System.out.println(result);
        System.out.println(one.equals(two));
        /*Door door1 = new Door();
        Door door2 = new Door();
        boolean doorResult = door1 == door2;*/

        //startsWith(), endsWith()
        System.out.println("==========");
        String greetings = "My dear friend, nice to see you!!!";
        System.out.println(greetings.startsWith("My dear friend"));
        System.out.println(greetings.endsWith("!!!"));

        //toLowerCase(), toUpperCase()
        System.out.println("==========");
        String forCaseEx = "I aM Ans YoU sa weNJJ kddsiHIIIDWWD";
        System.out.println(forCaseEx);
        System.out.println(forCaseEx.toLowerCase());
        System.out.println(forCaseEx.toUpperCase());

        //QA, Qa, qa
        //equalsIgnoreCase()
        System.out.println("============");
        String lowerCase = "qa";
        String upperCase = "QA";
        String camelCase = "Qa";
        System.out.println(lowerCase.equals(upperCase));
        System.out.println(lowerCase.equalsIgnoreCase(upperCase));
        System.out.println("============");
        System.out.println(lowerCase.equals(camelCase));
        System.out.println(lowerCase.equalsIgnoreCase(camelCase));

        //trim
        System.out.println("=========");
        String trimText = "    Some text with space   ";
        System.out.println(trimText);
        System.out.println(trimText.trim());

        //split()
        System.out.println("=========");
        String forSplit1 = "word1 word2 word3 word4";
        String[] wordsPlace = forSplit1.split(" ");
        System.out.println(wordsPlace[0]);
        System.out.println(wordsPlace[1]);
        System.out.println(wordsPlace[2]);
        System.out.println(wordsPlace[3]);
        String word1 = wordsPlace[0];
        System.out.println(wordsPlace);
        //System.out.println(wordsPlace[4]);
        System.out.println("Total amount of elements in array: " + wordsPlace.length);
        System.out.println("Total amount of characters in text: " + wordsPlace[0].length());
        System.out.println("========");
        String forSplit2 = "My text is one and this is text one bla bla bla";
        String[] forSplit2Array = forSplit2.split("one");
        System.out.println(forSplit2Array[0].trim());
        System.out.println(forSplit2Array[1].trim());
        System.out.println(forSplit2Array[2].trim());
        System.out.println("==============");
        System.out.println(forSplit2.split("one")[0].trim());
    }
}
