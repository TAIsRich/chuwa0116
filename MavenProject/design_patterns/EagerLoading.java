package oop.singleton;

public class EagerLoading {
    private EagerLoading(){};

    private static EagerLoading instance = new EagerLoading();

    public static EagerLoading getInstance() {
        return instance;
    }
}
