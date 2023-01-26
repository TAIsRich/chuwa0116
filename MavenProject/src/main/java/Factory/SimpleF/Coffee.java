package Factory.SimpleF;

public abstract class Coffee {
    public abstract String getName();

    public void addsugar(){
        System.out.println("add sugar");
    }

    public void addmilk(){
        System.out.println("add milk");
    }

}