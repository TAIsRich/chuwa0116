package org.example.singleton;

/**
 * why static inner class singleton is thread safe?
 * The class loader guarantees to complete all static initializations before it grants access to the class
 * */
public class StaticNestedClassSingleton {

    private StaticNestedClassSingleton() {}

    private static class SingletonHolder {
        private static final StaticNestedClassSingleton INSTANCE = new StaticNestedClassSingleton();
    }


    public static StaticNestedClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
