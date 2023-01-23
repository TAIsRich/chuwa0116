## 1.  Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo 
repo as example)
### 1.  Encapsulation;
```java:
class Encapsulation {
    private string home_address;
    private string phone_number;

    public string getAdress() {
        return home_address;
    }

    public void setAdress(string home_address) {
        this.home_address = home_address;
    }

    public string getPhoneNumber() {
        return phone_number;
    }

    public void setAdress(string phone_number) {
        this.phone_number = phone_number;
    }
}
```

### 2.  Polymorphism;
```java:
public class Car {

    public double getPrice() {
        return 0;
    }

}

class Toyota extends Car {   

    private double price;
    private final double TAX = 1.4;

    public Toyota(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price * TAX;
    }

}

class BMW extends Car {
    private double price;
    private final double TAX = 1.7;

    public BWM(double radius) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price * TAX;
    }

}
```

### 3.  Inheritance; 
```java:
class Parent {
    public void printName() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    public void printName() {
        System.out.println("Child class");
    }
}
```

## 2.  What is wrapper class in Java and Why we need wrapper class? 
A wrapper class is a class that wraps a primitive data type and provides a single object representation of that data type. For instance, Integer to int, Double to double. We need wrapper class to perform useful methods on primative data types. 

## 3.  What is the difference between HashMap and HashTable?
They both implement Map interface. However, HashMap is not thread-safe, which means HashTable will cause errors when multiple threads implement it, whereas HashMap won't cause errors.

## 4.  What is String pool in Java and why we need String pool? 
String pool is basically the memory where the string objects store. "String a = "hello"" stores in the string pool, whereas new Keyword "new String("hello")" won't store objects in the string pool. In many cases, we need string pool to get better performance and save more memory. 

## 5.  What is Java garbage collection?
Java garbage collection is a feature of Java that automatically frees up the memory for user when objects are no longer referenced by the program.

## 6.  What are access modifiers and their scopes in Java? 
* public: The class, method, or variable can be accessed from anywhere.
* private: The class, method, or variable can only be accessed from within the same class.
* protected: The class, method, or variable can be accessed from within the
same package or by a subclass in a different package.
* default: The class, method, or variable can be accessed from within the same package.

## 7.  What is final keyword? (Filed, Method, Class)
final keyword is a keyword where a variable can't be changed once it has been initialized. Same concept applies to method or class, whereas method can't be overrided or overloaded and class can't be inheritated.

## 8.  What is static keyword? (Filed, Method, Class). When do we usually use it?
static keyword is for a variable that can be accessed by any instances. A static method can be called directly on the class without creating an object, and it can only access static variables of the class. A static class is a nested class that is declared as static. We usually use the static keyword when we have a variable or method that is common to all instances of a class.

## 9.  What is the differences between overriding and overloading?
Both ways will have same method names. However, overriding must keep all the parameters unchange, but overload's parameters can be changed as needed. 

## 10.  What is the differences between super and this?
In Java, the super keyword is used to refer to the superclass of a given class and allows calling methods or accessing variables of the superclass which have been overridden by the subclass. On the other hand, the this keyword is used to refer to the current object of a class and allows calling methods or accessing variables of the current object. The key difference between the two is that super refers to the parent class while this refers to the current class.

## 11.  What is the Java load sequence?
The Java load sequence is the order in which the JVM loads and initializes the parts of a Java program, starting with class files, linking, initializing variables and static blocks, and ending with the main method starting execution.

## 12.  What is Polymorphism? And how Java implements it?
Polymorphism in Java allows objects of different classes to be treated as objects of a common superclass by using interfaces and abstract classes, where interfaces define a set of methods for a class to implement and abstract classes provide a partial implementation of those methods.

## 13.  What is Encapsulation ? How Java implements it? And why we need encapsulation? 
Encapsulation is a concept in OOP that involves hiding the implementation details of a class and exposing only a public interface. Java implements encapsulation by using access modifiers like private and protected, to restrict access to variables and methods. This helps protect the internal state of an object from external modification and ensures expected behavior.

## 14.  What is Interface and what is abstract class? What are the differences between them?
Interfaces in Java are collections of abstract methods that a class can implement, while abstract classes can have both abstract and concrete methods. A class can implement multiple interfaces, but can only inherit from one abstract class. Interfaces define common behaviors for multiple classes, while abstract classes provide partial implementation of those behaviors.

## 15.  (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )
### 1.  If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)

## 16.  What are Queue interface implementations and what are the differences and when to use what? 
Java's Queue interface is a collection based on the FIFO principle. It is implemented by various classes, including ArrayDeque, LinkedList, PriorityQueue, ArrayBlockingQueue, LinkedBlockingQueue, and PriorityBlockingQueue. Factors to consider when choosing a Queue implementation include thread-safety, performance, and whether null elements are allowed. For example, use a blocking queue implementation for thread-safety and a PriorityQueue or PriorityBlockingQueue for priority-based queue and use LinkedList or ArrayDeque if the queue allows null elements.