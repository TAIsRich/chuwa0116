package SingletonPattern.demo2;

import SingletonPattern.demo1.Singleton;

public class Client {
   public static void main(String[] args) {
       SingletonPattern.demo1.Singleton instance = SingletonPattern.demo1.Singleton.getInstance();
       SingletonPattern.demo1.Singleton instance1 = Singleton.getInstance();
       System.out.println(instance == instance1);
    }
}
