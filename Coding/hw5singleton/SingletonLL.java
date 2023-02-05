package Coding.hw5singleton;

public class SingletonLL {
    private static volatile SingletonLL instance = new SingletonLL();

    private SingletonLL(){

    }
    public static SingletonLL getInstance(){
        if (instance==null){
            synchronized (SingletonLL.class){
                if (instance==null){
                    instance = new SingletonLL();
                }
            }
        }
        return instance;
    }



}
