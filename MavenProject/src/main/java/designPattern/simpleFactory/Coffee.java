package designPattern.simpleFactory;

public abstract class Coffee {
    String type;

}


class AmericanCoffee extends Coffee{
    String type;

    AmericanCoffee (){
        super();
        type = new String("American");
    };

    public String getType(){
        return this.type;
    }

}

class Latte extends Coffee{
    String type;

    Latte (){
        super();
        type = new String("Latte");
    };

    public String getType(){
        return this.type;
    }

}