package PublishSubscribePattern;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WeiXinUser("user1"));
        subject.attach(new WeiXinUser("user2"));
        subject.attach(new WeiXinUser("user3"));

        //公众号更新
        subject.notify("the version has been updated!");
    }
}
