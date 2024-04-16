package lesson12.hw_lesson12;

public class Lesson12_HW1 {
    /*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
При вводе boolean выводитсообщение, что введен тип boolean.

convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
При вводе boolean выводит сообщение, что введен тип boolean.

converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).

У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
А также только один метод геттер для получения информации о названии данного конвертра.*/

    public static void main(String[] args) {
        System.out.println(new Lesson12_HW1().convertToInt("1234"));
    }
    public int convertToInt(byte bytes){
        return bytes;
    }

    public int convertToInt(short shorts){
        return shorts;
    }

    public int convertToInt(int ints){
        return ints;
    }
    public int convertToInt(long longs){
        return (int) longs;
    }

    public int convertToInt(String text){
        return Integer.parseInt(text);
    }


}
