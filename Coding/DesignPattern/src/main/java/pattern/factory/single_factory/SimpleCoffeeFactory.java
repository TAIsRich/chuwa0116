package pattern.factory.single_factory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("americano".equalsIgnoreCase(type)) {
            coffee = new Americano();
        } else if ("latte".equalsIgnoreCase(type)) {
            coffee = new Latte();
        } else {
            throw new RuntimeException("No such coffee");
        }

        return coffee;

    }
}
