package DesignPattern.Singleton;

public class Singleton_EagerLoad {
    private static Singleton_EagerLoad instance = new Singleton_EagerLoad();
    private Singleton_EagerLoad() {

    }
    public static Singleton_EagerLoad getInstance() {
        return instance;
    }
}
