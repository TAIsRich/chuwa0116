package oop.singleton;

// thread-safe
public class LazyLoading {
    private LazyLoading() {};

    private static volatile LazyLoading instance;

    public static LazyLoading getInstance() {
        if (instance == null) {
            synchronized (LazyLoading.class) {
                if (instance == null) {
                    instance = new LazyLoading();
                }
            }
        }
        return instance;
    }
}
