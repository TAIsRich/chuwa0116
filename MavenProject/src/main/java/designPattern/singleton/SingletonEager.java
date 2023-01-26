package designPattern.singleton;

public class SingletonEager {
// 1, private static variable
        private static SingletonEager instance = new SingletonEager();
        // 2, make constructor be private
        // 保证不能new， ⼀旦可以new, 就可以建造很多instance， 则就不再是singleton。
        private SingletonEager() {
        }
        // 3. static getInstance method
        // static保证在没有instance的情况下，可以调该⽅法。
        public static SingletonEager getInstance() {

        return instance;

    }
}
//        Singleton is NOT null
//        Singleton.getInstance(); //faster