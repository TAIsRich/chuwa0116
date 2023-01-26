package pattern.singleton.demo3;

import pattern.singleton.demo1.Singleton;

public class Client {
    public static void main(String[] args){
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance1 == instance);
    }
}
