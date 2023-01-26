package PublisherSubscriber;

public interface Subject {
    void attach(Observer ob);

    void detach(Observer ob);

    void notify(String message);
}