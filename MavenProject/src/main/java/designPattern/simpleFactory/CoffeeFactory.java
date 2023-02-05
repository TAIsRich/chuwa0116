package designPattern.simpleFactory;

public class CoffeeFactory {
    public Coffee createCoffee(String type){
        if (type.equalsIgnoreCase("american")){
            return new AmericanCoffee();
        } else if (type.equalsIgnoreCase("latte")){
            return new Latte();
        } else{
            return null;
        }
    }
}
