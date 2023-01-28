package com.chuwa.test.designpattern;

import java.io.Serializable;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/1/22
 * @description 静态内部类单例模式
 */
public class SingletonEager implements Serializable {

    // make constructor be private
    private SingletonEager() {
    }

    // define a inner static class
    private static class SingletonHolder {
        private static final SingletonEager INSTANCE = new SingletonEager();
    }

    // provide public access method
    public static SingletonEager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
