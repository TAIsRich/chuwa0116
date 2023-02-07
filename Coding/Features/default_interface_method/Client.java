public class Client{
    public static void main(String[]args){
        DIMImpl dim=new DIMImpl();
        System.out.println("Override method "+dim.add(1,2));
        System.out.println("Default method: "+dim.substract(1,2));
        System.out.println("static method: "+DIMI.blogName);
    }
}