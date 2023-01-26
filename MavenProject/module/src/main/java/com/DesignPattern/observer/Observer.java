public interface Observer {
    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String message);
}