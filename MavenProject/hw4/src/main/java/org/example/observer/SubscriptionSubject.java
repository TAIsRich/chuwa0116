package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    private List<Observer> observerList;

    SubscriptionSubject(){
        observerList = new ArrayList<Observer>();
    }
    @Override
    public void subscribe(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers(final String message) {
        observerList.forEach(o -> o.update(message));
    }


}
