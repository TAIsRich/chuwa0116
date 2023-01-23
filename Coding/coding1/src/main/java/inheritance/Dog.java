package inheritance;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/20/23
 */
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("woof!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
