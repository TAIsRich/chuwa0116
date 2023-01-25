public class SimpleCoffeeFactory{
    public Coffee createCoffee(String type){
        Coffee coffee=null;
        if("american".equals(type))
            coffee=new AmericanCoffee();
        else if("latte".equal(type))
            coffee=new LatteCoffee();
        else
            throw new RuntimeException();
    }
}