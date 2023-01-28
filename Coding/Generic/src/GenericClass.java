public class GenericClass<T> {
    //T就相当于声明 Integer/String/Product
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return this.obj;
    }
}
