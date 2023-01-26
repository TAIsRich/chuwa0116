package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/25/23
 */
public class SubscriptionSubject implements Subject {

    private List<Observer> wechatUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        wechatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        wechatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : wechatUserList) {
            observer.update(message);
        }
    }
}
