package lesson9.inheritance.ex2;

public class TeamMember {
    public TeamMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name;
    public int age;
    public String profession;

    @Override
    public String toString() {
        return   "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + "\'";
    }
    public void doWork(){
        System.out.println("I do work!!!");
    }
}
