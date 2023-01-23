package polymorphism;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/20/23
 */
public class Rabbit {
    private String name;
    private int age;

    public Rabbit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Ahhh!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
