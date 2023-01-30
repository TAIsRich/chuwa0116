package Coding.generic;

public class GenericsClass<T> {
    T obj;
    public GenericsClass(T o){
        this.obj = o;
    }
    public T getObj() {
        return obj;
    }
}
