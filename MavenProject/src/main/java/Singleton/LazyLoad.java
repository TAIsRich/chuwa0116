package Singleton;

public class LazyLoad {
    private static volatile LazyLoad instance;

    private LazyLoad() {}

    public static LazyLoad getInstance() {
        if (instance == null) {
            synchronized (LazyLoad.class) {
                if (instance == null) {
                    instance = new LazyLoad();
                }
            }
        }
        return instance;
    }
}
