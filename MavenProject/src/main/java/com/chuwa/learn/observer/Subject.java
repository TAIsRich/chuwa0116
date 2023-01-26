package com.chuwa.learn.observer;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:43
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notify(String message);
}
