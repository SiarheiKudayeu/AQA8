package lesson7.oop;

public class Animal {
    //поля
    public String name;
    public int age;
    public String species;

    //метод который ничего не возвращает и ничего не принимает в параметры
    public void getInfoAboutYourAnimalToConsole() {
        System.out.println("Name of your animal is: " + name + ".");
        System.out.println("Specie of your animal is: " + species + ".");
        System.out.println("Age of your animal is: " + age + ".");
    }

    //метод который возвращает значение и ничего не принимает в параметры
    public int returnAgeOfTheAnimal() {
        int ageOfPet = age;
        return ageOfPet;
    }

    //метод который ничего не возвращает и принимает аргументы в параметры метода
    public void someActionFromParameters(String action, int countOfActions) {
        System.out.println("Your pet can " + action + " " + countOfActions + " count of times.");
    }

    //метод который возвращает значение и принимает аргументы в параметры метода
    public int howLongMyAnimalCanLeaveMore(int averageLive){
        return averageLive - age;
    }
}
