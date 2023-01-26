package SingletonPattern.demo4;
//lazy load
public class Singleton {
    private Singleton(){

    }
    //volatile:
    private static volatile Singleton instance;

    public static Singleton getInstance(){
        //first check, if instance is not null, it is no need to Preemption lock
        if(instance == null){
            synchronized (Singleton.class){
                //second check
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
