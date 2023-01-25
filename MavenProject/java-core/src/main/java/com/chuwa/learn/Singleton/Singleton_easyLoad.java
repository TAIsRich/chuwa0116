public class Singleton_easyLoad{
    private static Singleton_easyLoad instance=new Singleton_easyLoad();
    private Singleton_easyLoad(){

    }
    public static Singleton_easyLoad getInstance(){
        return instance;
    }
}