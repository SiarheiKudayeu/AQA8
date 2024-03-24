package lesson3.string;

public class Lesson3Task1 {
    /*    1) Создать пять любых переменных типа String ( word1, word2, word3 и т.д. ).
 Создать также переменную типа String result1 и result2.
 Поместить в result1 все слова word1 - word5 используя метод concat.
 Поместить в result2 все слова word1 - word5 используя оператор +.
 Вывести result1 и result2 в консоль.
 */
    public static void main(String[] args) {
        String word1 = "javagroup";
        String word2 = "practice";
        String word3 = "task1";
        String word4 = "Anna";
        String word5 = "Demyanchuk";
        String result1;
        String result2;
        result1 = word1.concat(" ").concat(word2).concat(" ").concat(word3).
                concat(" ").concat(word4).concat(" ").concat(word5);
        result2 = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5;
        System.out.println(result1);
        System.out.println(result2);

    }
}
