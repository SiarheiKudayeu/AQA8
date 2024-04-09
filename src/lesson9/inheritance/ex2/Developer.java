package lesson9.inheritance.ex2;

public class Developer extends TeamMember {
    public Developer() {
        super("Maxim", 31);
        this.profession = "Developer";
    }

    @Override
    public void doWork() {
        System.out.println("I am " + name + ", and I am a real creator!!!!");
    }

}
