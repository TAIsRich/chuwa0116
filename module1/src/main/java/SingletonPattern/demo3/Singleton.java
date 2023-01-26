package SingletonPattern.demo3;
//lazy load
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;
    //thread-safe
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

