package DesignPattern.Singleton;

public class Singleton_LazyLoad {
    private static volatile Singleton_LazyLoad instance;
    private Singleton_LazyLoad(){};
    public static Singleton_LazyLoad getInstance() {
        if (instance == null) {
            synchronized (Singleton_LazyLoad.class) {
                if (instance == null) {
                    instance = new Singleton_LazyLoad();
                }
            }
        }
        return instance;
    }
}
