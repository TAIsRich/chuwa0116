package DesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {

    //定义一个集合，用来存储多个观察者对象
    private List<Observer> weiXinUserList = new ArrayList<Observer>();

    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    public void notify(String message) {
        //遍历集合
        for (Observer observer : weiXinUserList) {
            //调用观察者对象中的update方法
            observer.update(message);
        }
    }
}
