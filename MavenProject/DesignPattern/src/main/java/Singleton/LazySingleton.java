package Singleton;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/24/23
 */
class LazySingleton {

    private LazySingleton() {}

    private static volatile LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

class LazySingleton2 {

    private LazySingleton2() {}

    private static class LazySingleton2Holder {
        private static final LazySingleton2 INSTANCE = new LazySingleton2();
    }

    public static LazySingleton2 getInstance() {
        return LazySingleton2Holder.INSTANCE;
    }
}
