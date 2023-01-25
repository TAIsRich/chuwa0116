package PublisherSubscriber;

import java.util.ArrayList;
import java.util.List;

public class SubsriptionSubject implements Subject {
  private List<Observer> userList = new ArrayList<>();

  @Override
  public void attach(Observer ob) {
    userList.add(ob);
  }

  @Override
  public void detach(Observer ob) {
    userList.remove(ob);
  }

  @Override
  public void notify(String message) {
    for (Observer ob : userList) {
      ob.update(message);
    }
  }
}
