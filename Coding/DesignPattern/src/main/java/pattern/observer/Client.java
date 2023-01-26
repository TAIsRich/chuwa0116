package pattern.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WeChatUser("张三"));
        subject.attach(new WeChatUser("李四"));
        subject.attach(new WeChatUser("王五"));

        subject.notify("法外狂徒");
    }
}
