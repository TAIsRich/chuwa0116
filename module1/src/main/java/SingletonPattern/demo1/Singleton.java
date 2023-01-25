package SingletonPattern.demo1;
//eager load
public class Singleton {
    //private constructor
    private Singleton(){

    }
    //create object in the class
    private static  Singleton instance = new Singleton();

    //provide a public getInstance method
    public static Singleton getInstance(){
        return instance;
    }
}
