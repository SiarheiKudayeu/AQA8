package lesson7.oop;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Barsik";
        cat.age = 3;
        cat.species = "CAT!!!";
        System.out.println(cat.name);

        Animal dog = new Animal();
        System.out.println(dog.name);
        System.out.println("Insert dog name:");
        //dog.name = new Scanner(System.in).nextLine();
        dog.name = "Rex";
        System.out.println(dog.name);

        System.out.println("========");
/*        System.out.println(cat);
        System.out.println(dog);
        dog = cat;
        System.out.println(cat);
        System.out.println(dog);*/

        System.out.println("========");
        cat.getInfoAboutYourAnimalToConsole();
        System.out.println("========");
        dog.getInfoAboutYourAnimalToConsole();
        //String infoAboutAnimal = dog.getInfoAboutYourAnimalToConsole();
        int ageOfBarsik = cat.returnAgeOfTheAnimal();
        System.out.println("========");
        System.out.println("Age of a cat = " + ageOfBarsik);
        System.out.println("========");
        cat.someActionFromParameters("Climb on the tree", 3);
        int restOfCatsLife = cat.howLongMyAnimalCanLeaveMore(15);
        System.out.println("========");
        System.out.println("My cat " + cat.name + " will leave at least " + restOfCatsLife + " year more!!!");
    }
}
