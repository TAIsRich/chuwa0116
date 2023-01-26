package Factory.AbstractF;

public abstract class Coffee {
    public abstract String getName();

    public void addsugar(){
        System.out.println("add suger");
    }

    public void addmilk(){
        System.out.println("add milk");
    }
}