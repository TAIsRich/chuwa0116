package inheritance;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/20/23
 */
public class DogTest {
    public static void main(String[] args) {
        GoldenRetriever dog1 = new GoldenRetriever("aa", 1);
        System.out.println(dog1.getAge());
        dog1.bark();
    }
}
