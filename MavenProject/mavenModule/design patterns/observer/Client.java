package org.example.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();
        WeixinUser user1=new WeixinUser("A");
        WeixinUser user2=new WeixinUser("B");
        WeixinUser user3=new WeixinUser("C");
        mSubscriptionSubject.subscribe(user1);
        mSubscriptionSubject.subscribe(user2);
        mSubscriptionSubject.subscribe(user3);
       
        mSubscriptionSubject.notifyAllObservers("new update");
    }
}
