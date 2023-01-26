package PublisherSubscriber;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WechatUser("A"));
        subject.attach(new WechatUser("B"));
        subject.attach(new WechatUser("C"));

        subject.notify("New update!");
    }
}
