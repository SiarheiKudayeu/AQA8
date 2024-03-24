package lesson3.formatter;

public class FormatterClass {
    public static void main(String[] args) {
        //System.out.printf(строка для форматирования, фргумент для замены);
        String formatMe = "This is text for formatting";
        System.out.printf(formatMe, "eeeeee");
        System.out.println();

        //String %s
        String var = "\"TEXT\"";
        String var2 = "\"AQA8\"";
        System.out.printf("This is text for formatting %s", var);
        System.out.println();
        System.out.printf("This is %s for formatting %s", var, var2);
        System.out.println();
        System.out.printf("This is %2$s for formatting %1$s", var, var2);
        System.out.println();
        String resultFormat = String.format("This is %2$s for formatting %1$s", var, var2);
        System.out.println(resultFormat);
        System.out.println("====================");

        //%c = char
        //%d - byte, short, int, long
        //%f - float, double
        System.out.printf("This is %s for formatting %c and then %d and then %f"
        , "\"TEXT\"", 'C', 12345, 44.03);

        //%b - boolean
        System.out.println("==========");
        System.out.printf("Boolean formatter %b", 10>6);
        System.out.println();
        System.out.printf("Boolean formatter %b", 10<6);
        System.out.println();
        System.out.printf("Boolean formatter %b", "23.0");
        System.out.println();
        System.out.printf("Boolean formatter %b", null);
        System.out.println();
    }
}
