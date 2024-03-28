package lesson5.tasks;

import java.util.Scanner;

public class Lesson5Task4 {
        /*
        3) Пример у вас соц сеть в которую можно загружать фотографии.
        У пользователя с консоли спрашивают сколько фотографий
        он хотел бы загрузить в свой альбом,
        но есть ограничение по размеру альбома в 100 фотографий
        */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int countOfPhoto = 0;
            while (countOfPhoto <= 100){
                System.out.println("Введите количество фото для загрузки?");
                int tempCount = scanner.nextInt();
                if(countOfPhoto + tempCount > 100){
                    System.out.println("Лимит превышен!!!");
                    System.out.println("Осталось места на "+(100 - countOfPhoto)+" фотографий!!!");
                    continue;
                }
                countOfPhoto = countOfPhoto + tempCount;
                if(countOfPhoto == 100){
                    break;
                }
                System.out.println("Осталось места на "+(100 - countOfPhoto)+" фотографий!!!");
            }
            System.out.println("Финал!!!");
        }
}
