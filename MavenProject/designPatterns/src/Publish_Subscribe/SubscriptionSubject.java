package Publish_Subscribe;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    List<Observer> weixinUserList = new ArrayList<Observer>();
    public void attach(Observer observer){
        weixinUserList.add(observer);
    }
    public void detach(Observer observer){
        weixinUserList.remove(observer);
    }
    public void notify(String message){
        for(Observer observer:weixinUserList){
            observer.update(message);
        }
    }
}