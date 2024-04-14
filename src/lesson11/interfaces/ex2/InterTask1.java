package lesson11.interfaces.ex2;

import java.util.ArrayList;

public class InterTask1 {
    /*Создать интерфейс Sportable в котором назаначить только один метод doSport().
Создать класс CrossFitMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
cообщение типа :"Я люблю кроссфит. Мое имя {name}.".
Создать класс BodybuildingMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
cообщение типа :"Я люблю качалку. Мое имя {name}." .
Создать класс CalisthenicsMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
cообщение типа :"Я люблю турник. Мое имя {name}.".
Создать массив типа Sportable. Разместить в него спорстменов разного вида. Пройтись циклом по всему массиву и
вызвать у каждого спортсмена метод doSport().

P.s. В классах поля сделать приватными. Не забыть про конструкторы, геттеры и сеттеры. А также методы toString,
hashCode() и equals().*/
    public static void main(String[] args) {
        BodybuildingMan sport1 = new BodybuildingMan("Alex");
        CalisthenicsMan sport2 = new CalisthenicsMan("Bob");
        CrossFitMan sport3 = new CrossFitMan("Max");

        Sportable[] arraysSport = {sport1, sport2, sport3};
        for (Sportable sportable : arraysSport) {
            sportable.doSport();
        }
        System.out.println("=========");
        Sportable sport4 = new BodybuildingMan("Alex");
        Sportable sport5 = new CalisthenicsMan("Bob");
        Sportable sport6 = new CrossFitMan("Max");
        Sportable[] arraysSport2 = {sport6, sport4, sport5};
        for (Sportable sportable : arraysSport2) {
            sportable.doSport();
        }
        System.out.println("================");
        ArrayList<Sportable> sportableArrayList = new ArrayList<>();
        sportableArrayList.add(sport2);
        sportableArrayList.add(sport6);
        System.out.println(sportableArrayList);
    }
}
