package polymorphism;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/20/23
 */
public class Lionhead extends Rabbit {

    public Lionhead(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("I am a Lionhead!");
    }

    public void greeting() {
        System.out.println("Hi! I am a Lionhead!");
    }

    public void greeting(String name) {
        System.out.print("Hi, " + name + "! I am a Lionhead!");
    }
}
