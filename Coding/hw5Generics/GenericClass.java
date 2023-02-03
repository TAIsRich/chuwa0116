package Coding.hw5Generics;

/**
 * @author b1go
 * @date 7/25/22 12:17 AM
 */
public class GenericClass<T> {
    // T -> Integer, User, Product
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}
