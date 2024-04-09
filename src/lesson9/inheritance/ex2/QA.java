package lesson9.inheritance.ex2;

public class QA extends TeamMember{

    public QA (String name, int age){
        super(name, age);
        //вызывает родительский дефолтный конструктор!!!
        this.profession = "Quality Assurance";
    }

    @Override
    public void doWork(){
        System.out.println("I am " + name + ", and I will test like a God!!!");
    }
}
