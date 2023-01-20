package polymorphism;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/20/23
 */
public class RabbitTest {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("tutu", 3);
        rabbit1.makeSound();

        Lionhead rabbit2 = new Lionhead("tutu2", 4);
        rabbit2.makeSound();
        rabbit2.greeting();
        rabbit2.greeting("Tom");
    }
}
