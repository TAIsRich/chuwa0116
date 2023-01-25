package PublishSubscribePattern;

public interface subject {
    void attach(Observer observer);

    void detach(Observer observer);

    //notify
    void notify(String message);
}
