public class Client{
    public static void main(String[] args){
        CoffeStore store=new CoffeeStore();
        Coffee coffee=store.OrderCoffee("american");
        System.out.println(coffee.getName());
    }
}