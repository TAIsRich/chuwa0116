package com.chuwa.learn.coffee;

import com.chuwa.learn.coffee.AmericanCoffee;
import com.chuwa.learn.coffee.Coffee;
import com.chuwa.learn.coffee.LatteCoffee;

public class simpleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }
        else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }
        else{
            throw  new RuntimeException("Sorry, No coffee!");
        }

        return coffee;
    }
}
