package com.chuwa.learn.observer;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:44
 */
public class WeixinUser implements Observer{
    String name;
    public WeixinUser(String name){
        this.name=name;
    }
    public void update(String message){
        System.out.println(name+ "-"+message);
    }
}
