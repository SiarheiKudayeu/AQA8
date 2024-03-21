package lesson2.string;

public class StringClass {
    public static void main(String[] args) {
        int x = 9;
        String text = new String("Hello AQA 8");
        System.out.println(text);
        String anyNamingWithHelpOfCase = "Any Value!!!";
        System.out.println(anyNamingWithHelpOfCase);
        System.out.println("==========");
        text = text.concat(" ").concat(anyNamingWithHelpOfCase);
        System.out.println(text);

        //+ == concat()
        System.out.println("=========");
        String text1 = "text1";
        String text2 = "text2";
        System.out.println(text1 + " " + text2);
        text1 = text1 + " " + text2;
        System.out.println(text1 + " " + false + " " + 4 + " " + 3.054);
        String twelve = "12";
        int expectedAmountOfMonth = 12;
        int actualAmountOfMonth = Integer.parseInt(twelve);
        boolean isActualEqualsExpected = expectedAmountOfMonth == actualAmountOfMonth;
        System.out.println(isActualEqualsExpected);

        //valueOf()
        System.out.println("============");
        int thisIntegerForFutureString = 433;
        String stringFromInteger = String.valueOf(thisIntegerForFutureString);
        System.out.println(stringFromInteger);
        System.out.println(stringFromInteger + 44);
        System.out.println(thisIntegerForFutureString + 44);

        //символы экранирования \ \n \b
        System.out.println("My favourite film is\n \b\"First film\"");
        String locator = "//a[@class='class1']";

        //length()
        String textLength = "1234567890";
        int lengthOfOurText = textLength.length();
        System.out.println("Text from line" +
                " \"" + textLength + "\" contains " + lengthOfOurText + " symbols.");

        //contains()
        System.out.println("==========");
        String name = "Alex";
        String forContainsMethod = "Nice to eet you, Alex!!!";
        boolean result1 = forContainsMethod.contains(name);
        System.out.println(result1);
        System.out.println(forContainsMethod.contains("Denis"));

        //System.out.print()
        System.out.println("==========");
        System.out.print("abcd");
        System.out.println("ABCD");
        System.out.print("abcd\n");
        //System.err.println("ERROR!!!!!");

        //charAt
        String forCharAt = "Nice to eet you, Alex!!!";
        System.out.println("First symbol is " + forCharAt.charAt(0));
        System.out.println("Last symbol is " + forCharAt.charAt(forCharAt.length()-1));

        //indexOf() lastIndexOf
        System.out.println("===========");
        String example = "My example";
        System.out.println(example.indexOf("e"));
        System.out.println(example.lastIndexOf("e"));

        //substring()
        System.out.println("=========");
        String forSubstring = "Some String for substring method!!!";
        System.out.println(forSubstring.substring(5));
        System.out.println(forSubstring.substring(5, 25));
        System.out.println(forSubstring.substring(forSubstring.length() - 9));
    }
}
