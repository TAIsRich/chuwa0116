package generic;

public class GenericClass<T> {
    T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
