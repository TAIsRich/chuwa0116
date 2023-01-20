1a. Encapsulation;
// Java program to demonstrate encapsulation
class Encapsulate {
private String geekName;
public String getName() { return geekName; }
public void setName(String newName)
{
geekName = newName;
}
}

public class TestEncapsulation {
public static void main(String[] args)
{
Encapsulate obj = new Encapsulate();
obj.setName("Harsh");
System.out.println("Geek's name: " + obj.getName());
}
}

1b.Polymorphism;
class Animal {
public void animalSound() {
System.out.println("The animal makes a sound");
}
}

class Pig extends Animal {
public void animalSound() {
System.out.println("The pig says: wee wee");
}
}
