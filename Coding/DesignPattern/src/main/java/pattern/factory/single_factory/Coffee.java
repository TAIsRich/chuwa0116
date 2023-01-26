package pattern.factory.single_factory;

public abstract class Coffee {
    public abstract String getName();

    public void addSugar(){
        System.out.println("Sugar Added");
    }

    public void addMilk(){
        System.out.println("Milk Added");
    }
}
