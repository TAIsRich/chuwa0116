package designPattern.observer;

public class User implements Observer{
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String msg) {
        System.out.println(name + " " + msg);
    }
}
