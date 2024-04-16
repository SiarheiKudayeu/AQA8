package lesson12.generics.ex5;

public class ClassWithTwoGenerics<S, M>{
    private S firstType;

    public S getFirstType() {
        return firstType;
    }

    public M getSecondType() {
        return secondType;
    }

    public ClassWithTwoGenerics(S firstType, M secondType) {
        this.firstType = firstType;
        this.secondType = secondType;
    }

    public M secondType;

    public void printInfoAboutFirstField(){
        System.out.println("Type of the field is " + firstType.getClass().getName());
        System.out.println(firstType);
    }

    public void printInfoAboutSecondField(){
        System.out.println("Type of the field is " + secondType.getClass().getName());
        System.out.println(secondType);
    }
}
