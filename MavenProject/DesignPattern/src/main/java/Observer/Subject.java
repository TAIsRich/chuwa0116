package Observer;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/25/23
 */
public interface Subject {

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notify(String message);
}
