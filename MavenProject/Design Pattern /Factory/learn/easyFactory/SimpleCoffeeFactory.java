public class SimpleCoffeeFactory{
    public Coffee CreateCoffee(String type){
        Coffee coffee=null;
        if("american".equals(type)){
            coffee=new AmericanCoffee();
        }
        else if("lattee".equals(type)){
            coffee=new LatteCoffee();
        }
        else{
            throw new RuntimeException("sorry, we do not have the coffee you order");
        }
        return coffee;
    }
}