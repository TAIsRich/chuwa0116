package designPattern.singleton;

public class SingletonLazy {
    private static volatile SingletonLazy instance;
        // 2, make constructor be private
        // 保证不能new， ⼀旦可以new, 就可以建造很多instance， 则就不再是singleton。
        private SingletonLazy() {
        }
        // 3. static synchronized getInstance method
        // static保证在没有instance的情况下，可以调该⽅法。
        public static SingletonLazy getInstance() {// 4, make sure thread safe, improve performance
        if (instance == null) { // 可能是多个线程if (instance == null) { // 可能是多个线程
            // T1(first --> unlock), T2(wait)
            synchronized (SingletonLazy.class) { // 保证正能进⼊⼀个线程
                //T1 is here first, and then comes T2
                if (instance == null) {
                    //T1 is here, T2...Tn will never be here.
                    instance = new SingletonLazy();
                }
            }
        }

        return instance;

    }
}
