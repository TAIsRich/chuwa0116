package hw2.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println("Dog speak :");
        dog.speak();
        System.out.println("Cat speak :");
        cat.speak();
    }
}
