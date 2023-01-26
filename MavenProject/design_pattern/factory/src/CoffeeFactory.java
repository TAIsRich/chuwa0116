public class CoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee cf = null;
        if(type.equals("american")){
            cf = new AmericanCoffee();
        }else if(type.equals("latte")){
            cf = new LatteeCoffee();
        }else{
            throw  new RuntimeException("No such coffee type");
        }
        return  cf;
    }
}
