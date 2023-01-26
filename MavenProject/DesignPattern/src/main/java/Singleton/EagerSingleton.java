package Singleton;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/24/23
 */

/**
 * 饿汉式
 *      静态变量创建类的对象
 */
class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}

/**
 * 饿汉式
 *      在静态代码块中创建该类对象
 */
class EagerSingleton2 {

    private EagerSingleton2() {}

    private static final EagerSingleton2 instance;

    static {
        instance = new EagerSingleton2();
    }

    public static EagerSingleton2 getInstance() {
        return instance;
    }
}
