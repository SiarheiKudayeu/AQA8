package lesson10.static_key_word.blocks;

import javax.xml.crypto.Data;
import java.util.Date;

public class ClassWithStaticBlocks {
    static Date DATE;

    static double USD;
    static double EURO;

    public static void justBe(){}

    public static double getUSDFromBank(){
        return 39.5;
    }
    public static double getEUROFromBank(){
        return 43.2;
    }

    static {
        System.out.println("I am static block!!!");
        USD = getUSDFromBank();
        EURO = getEUROFromBank();
        DATE = new Date();
    }

    public void printDate(){
        System.out.printf("%1$ta %1$td %1$tB", DATE);
    }

    public void printCurrencies(){
        System.out.println("Euro = " + EURO);
        System.out.println("USD = " + USD);
    }
}
