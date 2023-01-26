package com.chuwa.learn.factory.singleFactory;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:57
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        SimpleCofeeFactory factory = new SimpleCofeeFactory();

        Coffee coffee = factory.createCoffee(type);

        coffee.addmilk();
        coffee.addsugar();

        return coffee;
    }

}
