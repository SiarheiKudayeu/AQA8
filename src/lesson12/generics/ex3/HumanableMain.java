package lesson12.generics.ex3;

public class HumanableMain {
    public static void main(String[] args) {
        GenericHumanInside<Elf> elf = new GenericHumanInside<>(new Elf("Elfman"));
        elf.sayInfoAboutInstance();
        System.out.println(elf.getHumanable());
        System.out.println("===========");
        GenericHumanInside<Human> human = new GenericHumanInside<>(new Human("Human"));
        human.sayInfoAboutInstance();
        System.out.println(human.getHumanable());
    }
}
