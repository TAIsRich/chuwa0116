package designPattern.observer;



public interface Subject {

    void attach(Observer obs);

    void detach(Observer obs);

    void notify(String msg);

}

