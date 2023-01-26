package Observer;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/25/23
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject
            = new SubscriptionSubject();

        WechatUser user1 = new WechatUser("孙悟空");
        WechatUser user2 = new WechatUser("猪悟能");
        WechatUser user3 = new WechatUser("沙悟净");

        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        subscriptionSubject.attach(user3);

        subscriptionSubject.notify("师父被妖怪抓走了！");
    }
}
