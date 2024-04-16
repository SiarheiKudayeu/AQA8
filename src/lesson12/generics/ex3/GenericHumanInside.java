package lesson12.generics.ex3;

public class GenericHumanInside <T extends Humanable> {
    private T humanable;

    public GenericHumanInside(T humanable) {
        this.humanable = humanable;
    }

    public T getHumanable() {
        return humanable;
    }

    public void sayInfoAboutInstance(){
        humanable.askWhoAmI();
    }
}
