package com.chuwa.learn.pattern.Observer;

public class Client {
    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();

        //订阅公众号
        subject.attach(new WeiXinUser("1"));
        subject.attach(new WeiXinUser("2"));
        subject.attach(new WeiXinUser("3"));

        //公众号更新 发消息给订阅者
        subject.notify("更新了");
    }
}
