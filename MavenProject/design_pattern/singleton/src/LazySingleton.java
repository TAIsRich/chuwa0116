public class LazySingleton {
    private LazySingleton(){}

    private static volatile LazySingleton instance = new LazySingleton();

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null) instance = new LazySingleton();
            }
        }
        return  instance;
    }
}
