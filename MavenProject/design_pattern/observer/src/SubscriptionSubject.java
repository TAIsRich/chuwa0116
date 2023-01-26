import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    private List<Observer> wx_list = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        wx_list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        wx_list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer ob:wx_list){
            ob.update(message);
        }
    }
}
