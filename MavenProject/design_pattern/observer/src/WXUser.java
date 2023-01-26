public class WXUser implements Observer{
    private String name;
    @Override
    public void update(String message) {
        System.out.println(name+"-"+message);
    }

    public WXUser(String name){
        this.name = name;
    }
}
