package org.example.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();
        //创建微信用户
        WeixinUser user1=new WeixinUser("user1");
        WeixinUser user2=new WeixinUser("user2");
        WeixinUser user3=new WeixinUser("user3");
        //订阅公众号
        mSubscriptionSubject.subscribe(user1);
        mSubscriptionSubject.subscribe(user2);
        mSubscriptionSubject.subscribe(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notifyAllObservers("new update");
    }
}
