package PublisherSubscriber;

public class Client {
  public static void main(String[] args) {
    SubsriptionSubject subject = new SubsriptionSubject();

    subject.attach(new WeiXinUser("A"));
    subject.attach(new WeiXinUser("B"));
    subject.attach(new WeiXinUser("C"));

    subject.notify("New update!");
  }
}
