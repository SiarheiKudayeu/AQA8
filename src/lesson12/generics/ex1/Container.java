package lesson12.generics.ex1;

public class Container {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Container(Object object) {
        this.object = object;
    }
}
