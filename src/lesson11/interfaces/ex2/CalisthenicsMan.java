package lesson11.interfaces.ex2;

public class CalisthenicsMan implements Sportable{
    private String name;

    public CalisthenicsMan(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CalisthenicsMan{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю турник. Мое имя "+name+".");
    }
}
