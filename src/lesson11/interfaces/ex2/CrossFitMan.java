package lesson11.interfaces.ex2;

public class CrossFitMan implements Sportable{
    private String name;

    public CrossFitMan(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CrossFitMan{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю кроссфит. Мое имя "+name+".");
    }
}
