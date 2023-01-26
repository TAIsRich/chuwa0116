package com.chuwa.learn.observer;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:40
 */
public class Client {
    public static void main(String[]args){
        SubscriptionSubject subject=new SubscriptionSubject();
        subject.attach(new WeixinUser("孙悟空"));
        subject.attach(new WeixinUser("猪悟能"));
        subject.attach(new WeixinUser("沙悟净"));

        subject.notify("传智黑马的专栏更新了!");
    }
}
