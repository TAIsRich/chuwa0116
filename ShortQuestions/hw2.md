1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo
    repo as example)
Encapsulation
```aidl
public class EncapsulationExample {
    private int id;
    private String name;
    private double salary;

    //getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

```
In this example, the fields id, name, and salary are private and cannot be accessed directly from outside the class.
Polymorphism;
```aidl
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class PolymorphismExample {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw(); //output: Drawing a circle

        Shape s2 = new Square();
        s2.draw(); //output: Drawing a square
    }
}

```
Inheritance;
```aidl
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

```
2. What is wrapper class in Java and Why we need wrapper class?

A wrapper class in Java is a class that wraps (or encases) a primitive data type and gives it an object-oriented interface. For example, the wrapper class for the int data type is Integer, the wrapper class for the boolean data type is Boolean, and so on.

We need wrapper classes in Java because they allow us to perform operations on primitive data types that can only be performed on objects, such as being added to collections and being passed as method arguments. Additionally, wrapper classes provide additional functionality such as parsing strings to primitive types and converting primitive types to strings.

3. What is the difference between HashMap and HashTable?
   HashMap and Hashtable are both classes in Java that implement the Map interface and provide a key-value mapping. However, there are a few differences between the two:

HashMap is not synchronized, while Hashtable is. This means that multiple threads can access a HashMap at the same time without any external synchronization, while a Hashtable requires synchronization to prevent data corruption when multiple threads access it at the same time.

HashMap allows null keys and null values, while Hashtable doesn't.

HashMap is faster than Hashtable because it is not synchronized.

HashMap was introduced in Java 1.2, while Hashtable was part of the original Java 1.0 release.

HashMap is a generic class and its declaration is like HashMap<Key, Value> while Hashtable is non-generic and its declaration is like Hashtable h = new Hashtable();

In general, if you are using a single thread to update and read the map and you don't mind the possibility of null keys or values, HashMap is a better choice. If, however, you need to use multiple threads and don't want to use additional synchronization, Hashtable would be a safer choice.


4. What is String pool in Java and why we need String pool?
   In Java, the "string pool" is a special area in the heap memory where strings are stored. When a string is created using a string literal, such as "hello", it is first checked to see if an identical string already exists in the pool. If it does, a reference to the existing string is returned, rather than creating a new one. This technique is called string interning.

The main reason for having a string pool is to improve performance and save memory. When multiple variables or objects refer to the same string, the memory used by the duplicates can be saved. Additionally, because the string pool contains a unique instance of each string, it can be used to compare strings using the == operator, which compares object references, rather than the equals() method, which compares the contents of the strings.

It is also important to note that when a string is created using the new keyword, it is not interned and will not be in the string pool, it will create a new instance of that string in heap memory.
5. What is Java garbage collection?
   Java garbage collection is the process by which the Java Virtual Machine (JVM) automatically frees up memory that is no longer being used by an application. This is done by identifying and removing objects that are no longer being referenced by the application.

The JVM uses a garbage collector (GC) to periodically scan the heap memory and identify objects that are no longer reachable by the application. These objects are then eligible for garbage collection and their memory is freed. The JVM uses various GC algorithms, such as the mark-and-sweep algorithm and the generational garbage collection algorithm, to determine which objects are eligible for collection.
6. What are access modifiers and their scopes in Java?
   Access modifiers in Java are keywords that are used to specify the accessibility or visibility of a class, method, or variable.
   
    **public** : accessible from anywhere

   **protected** : accessible within the same package and by subclasses in different package
   
    **default** (package-private): accessible within the same package

   **private**: accessible within the same class.
7. What is final key word? (Filed, Method, Class)
   final field : A final field is a variable that cannot be reassigned after it has been initialized. It means the value of final variable cannot be changed once it is assigned.

final method : A final method is a method that cannot be overridden by a subclass. This means that the implementation of a final method in a superclass cannot be changed in any of its subclasses.

final class : A final class is a class that cannot be subclassed. This means that a final class cannot have any subclasses.
8. What is static keyword? (Filed, Method, Class). When do we usually use it?
    static field : A static field is a variable that belongs to the class rather than to an instance of the class. This means that there is only one copy of the field that is shared by all instances of the class.

static method : A static method is a method that belongs to the class rather than to an instance of the class. This means that the method can be called on the class rather than on an instance of the class, and it does not have access to the non-static fields and methods of the class.

static class : A static class is a class that can only contain static members.

We usually use the static keyword in the following situations:

When a field or method is independent of any instance and it is associated with the class itself.

To create a singleton pattern. 
9. What is the differences between overriding and overloading?
Overriding: Overriding is the ability of a subclass to provide a different implementation of a method that is already provided by its superclass. When a method in a subclass has the same name, return type, and parameter types as a method in its superclass, it is said to override the method. The main purpose of overriding is to provide a specific implementation of a method that is more suitable for the subclass.

Overloading: Overloading is the ability of a class to have multiple methods with the same name but different parameter types or different number of parameters. When a class has multiple methods with the same name, it is said to overload the method. The main purpose of overloading is to provide several methods with the same name but different functionality.
10. What is the differences between super and this?
    super : super is used to refer to the superclass of the current class.

    this : this is used to refer to the current instance of the class.
11. What is the Java load sequence?
    The Java load sequence refers to the order in which the Java Virtual Machine (JVM) loads and initializes the various components of a Java program. The load sequence includes the following steps:

Loading: The JVM loads the bytecode of the class files into memory.

Linking: The JVM performs verification, preparation, and resolution of symbolic references in the bytecode.

Initialization: The JVM initializes the class variables and static initializer blocks in the order they appear in the class file.

During the loading and linking phases, the JVM also performs security checks to ensure that the code is safe to execute.
12. What is Polymorphism ? And how Java implements it ?
    Polymorphism is a fundamental concept in object-oriented programming that refers to the ability of a single object or function to take on multiple forms. In Java, polymorphism is implemented through the use of interfaces, abstract classes, and method overriding.
13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
    Encapsulation is a fundamental concept in object-oriented programming that refers to the practice of hiding the internal implementation details of a class and making the class's properties and methods private, while providing a public interface for interacting with the class. In Java, encapsulation is implemented through the use of access modifiers such as private, public, protected and package-private (default).

Encapsulation is important because it:

Hides the implementation details of a class, making the class more robust and less prone to errors.
Enforces data validation and business logic.
Allows the class to evolve over time without affecting the code that uses the class.
Increases security by preventing unauthorized access to the internal state of the class.
14. What is Interface and what is abstract class? What are the differences between them?
    In Java, both interfaces and abstract classes are used to define a contract for a class to implement or extend.
    
The main differences between interfaces and abstract classes are:

Interfaces cannot have any implementation code, while abstract classes can have both abstract and concrete methods.
A class can implement multiple interfaces, but it can only extend one abstract class.
15. (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )
     If you have no ability to design it, please find the solution in internet, then understand it, and re-type
     it.(Do NOT just copy and paste)
16. What are Queue interface implementations and what are the differences and when to use what?
    PriorityQueue: Ordering based on priority on a heap
    LinkedList: implements a doubly linked list
    ArrayDeque: implements queue based on arra