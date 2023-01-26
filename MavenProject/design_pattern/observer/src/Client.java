public class Client {

    public static void main(String[]args){
        SubscriptionSubject sb = new SubscriptionSubject();

        sb.attach(new WXUser("abc"));
        sb.attach(new WXUser("bcd"));

        sb.notify("update");
    }
}
