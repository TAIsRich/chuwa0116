public class Client {
    public static void main(String[]args){
        CoffeStore store = new CoffeStore();
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
