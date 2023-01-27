package GenericExercise;

public class GenericClass<T> {
    //T can be any type: Integer, User, String...
    T obj;

    public GenericClass(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }
}
