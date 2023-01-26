package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{

    private List<Observer> userLst = new ArrayList<Observer>();


    public void attach(Observer obs) {
        userLst.add(obs);
    }

    public void detach(Observer obs) {
        userLst.remove(obs);
    }

    public void notify(String msg) {
        for (Observer obs : userLst){
            obs.update(msg);
        }
    }
}
