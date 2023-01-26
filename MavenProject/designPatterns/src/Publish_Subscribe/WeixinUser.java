package Publish_Subscribe;

public class WeixinUser implements Observer{
    private String name;
    public WeixinUser(String name){
        this.name = name;
    }
    public void update(String message){
        System.out.println(name + "-" + message);
    }
}
