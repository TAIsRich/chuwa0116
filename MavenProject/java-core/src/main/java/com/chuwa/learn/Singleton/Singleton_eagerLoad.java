public class Singleton_eagerLoad{
    private static volatile Singleton_eagerLoad instance;
    private Singleton_eagerLoad(){

    }
    public static Singleton_eagerLoad getInstance(){
        if(instance==null){
            synchronized (Singleton_eagerLoad.class){
                if(instance==null){
                    instance=new Singleton_eagerLoad();
                }
            }
        }
        return instance;
    }
}