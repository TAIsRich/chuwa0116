package org.example.observer;

public class SubscriptionSubject implements subject{
    List<Observer> userList=new ArrayList<Observer>();
    public void attach(Observer observer){
        if (!userList.contains(observer)){
            userList.add(observer);
        }
        
    }
    public void detach(Observer observer){
        if (userList.contains(observer)){
            userList.remove(observer);
        }
        
    }
    public void notify(String message){
        for(Observer observer: userList){
            observer.update(message);
        }
    }
}
