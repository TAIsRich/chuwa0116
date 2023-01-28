package basic.generics;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/26/23
 */
public class GenericClass<T> {
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
