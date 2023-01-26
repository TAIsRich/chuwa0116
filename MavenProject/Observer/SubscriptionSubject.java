package com.itheima.pattern.Observer;

import java.util.ArrayList;
import java.util.List;


public class SubscriptionSubject implements Subject{
    private List<Observer> weiXinUserList = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer o : weiXinUserList){
            o.update(message);
        }
    }
}
