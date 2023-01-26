package Observer;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/25/23
 */
public class WechatUser implements Observer {

    private String name;

    public WechatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
