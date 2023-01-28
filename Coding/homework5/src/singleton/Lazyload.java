package singleton;

public class Lazyload {
    private static Lazyload instance;
    private Lazyload() {
    }

    public static Lazyload getInstance() {
        if (instance == null) {
            instance = new Lazyload();
        }
        return instance;
    }
}
