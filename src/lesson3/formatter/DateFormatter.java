package lesson3.formatter;

import javax.xml.crypto.Data;
import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {
        Date date = new Date();
        //System.out.println(date);

        //%t %T
        //H - часы, M - минуты, S -секунды, L - миллисекунды, N - наносекунды,
        //p - pm и am
        System.out.printf("Show time at the next format: %tH", date);
        System.out.printf("\nShow time at the next format: %tM", date);
        System.out.printf("\nShow time at the next format: %tS", date);
        System.out.printf("\nShow time at the next format: %1$tH:%1$tM:%1$tS\n", date);

        //A - день недели, d - две цифры даты, B - месяц, m - месяц в виде цифры
        // Y - год, y - две цифры года
        System.out.printf("\nShow time at the next format: %1$tA %1$td %1$tB", date);

        System.out.println("\n==================");
        String todayDate = String.format("%td", date);
        int todayDateInt = Integer.parseInt(todayDate);
        int tomorrowDate = todayDateInt + 1;
        System.out.printf("\nЗавтра будет "+tomorrowDate+" %tB", date);
    }
}
