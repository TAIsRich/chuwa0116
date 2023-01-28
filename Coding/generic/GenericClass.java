public class GenericClass<T>{
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getobj() {
        return this.obj;
    }
}