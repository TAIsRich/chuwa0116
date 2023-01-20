package inheritance;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/20/23
 */
public class Samoyed extends Dog {
    public Samoyed(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        super.bark();
        System.out.println("I am a Samoyed!");
    }
}
