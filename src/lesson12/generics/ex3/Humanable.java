package lesson12.generics.ex3;

public abstract class Humanable {
    protected String name;
    protected Type type;

    @Override
    public String toString() {
        return "name = " +name +
                ", type = " + type +
                '.';
    }

    public Humanable(String name) {
        this.name = name;
    }
    public abstract void askWhoAmI();
}
