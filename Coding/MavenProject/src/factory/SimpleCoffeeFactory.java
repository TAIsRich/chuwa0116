package factory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if("america".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，你所点的咖啡没有");
        }
        return coffee;
    }
}
