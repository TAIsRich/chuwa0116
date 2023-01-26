package Singleton.LazyLoad;

public class Singleton {
    private Singleton(){}
    // volatile用于禁止指令重排序：可以解决单例双重检查对象初始化代码执行乱序问题。
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null ) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
