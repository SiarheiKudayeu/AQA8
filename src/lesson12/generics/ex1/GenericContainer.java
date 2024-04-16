package lesson12.generics.ex1;

public class GenericContainer<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public GenericContainer(T object) {
        this.object = object;
    }
}
