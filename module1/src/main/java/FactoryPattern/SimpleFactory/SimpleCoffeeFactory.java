package FactoryPattern.SimpleFactory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if("americano".equals(type)){
            coffee = new Americano();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("The coffee requested has sold out!");
        }
        return coffee;

    }
}
