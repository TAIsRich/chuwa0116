package org.example.observer;

public class WeixinUser implements Observer{
    String name;
    public WeixinUser(String name){
        this.name=name;
    }
    public void update(String message){
        System.out.println(name+ "-"+message);
    }
}