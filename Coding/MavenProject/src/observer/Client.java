package observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WeiXinUser("孙悟空"));
        subject.attach(new WeiXinUser("user2"));
        subject.attach(new WeiXinUser("user3"));

        subject.notify("更新信息");
    }
}
