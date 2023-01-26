package oop.observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");
        ConcreteObserver observer3 = new ConcreteObserver("Observer 3");

        concreteSubject.attach(observer1);
        concreteSubject.attach(observer2);
        concreteSubject.attach(observer3);

        concreteSubject.notify("News Updated!");

    }
}
