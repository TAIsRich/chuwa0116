## Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)

```java
public class Shape {// Encapsulation
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
```

```java
public class Circle extends Shape{//Inheritance
        private int area;
        
        public Circle(String name, int area){
            this.name = name;
            this.area = area;
        }
        public void setArea(int area){
            this.area = area;
        }
        public int getArea(){
            return area;
        }
    }
```

```java
public static void main(String[] args){//Polymorphism
        Shape rec = new Shape("Rectangle");
        Circle cir = new Circle("Circle", 3.14);
    }
```



##  What is wrapper class in Java and Why we need wrapper class? 

Wrapper class is a class that wraps (or encapsulates) a primitive data type and converts it to an object

## What is the difference between HashMap and HashTable?

HashMap is not synchronized, while Hashtable is.

HashMap allows null keys and values, while Hashtable does not.

The methods of HashMap are not deprecated, while the methods of Hashtable are deprecated.

## What is String pool in Java and why we need String pool? 

String pool is a special area of memory where all of the String literals are stored.

The reason for the existence of the String pool is to improve the performance of the program and to save memory.

## What is Java garbage collection?

Java Garbage Collection is the process of automatically freeing up memory that is no longer being used by a Java application. The Java Virtual Machine (JVM) performs garbage collection.

## What are access modifiers and their scopes in Java?

public: A public member can be accessed from anywhere, by any class or object.

protected: A protected member can be accessed within the package in which it is declared and by subclasses in other packages.

default (or package-private): A default member can be accessed within the package in which it is declared, but cannot be accessed by classes or objects in other packages.

private: A private member can only be accessed within the class in which it is declared.

## What is final key word? (Filed, Method, Class)

final field: A field that is declared as final cannot be reassigned. Once a final field is assigned a value, it cannot be changed. It must be initialized at the time of declaration or in constructor.

final method: A method that is declared as final cannot be overridden by any subclasses. This is useful when you want to prevent subclasses from changing the behavior of a method.

final class: A class that is declared as final cannot be subclassed. This is useful when you want to prevent other classes from extending or inheriting from a particular class.

## What is static keyword? (Filed, Method, Class). When do we usually use it?

static field (or class variable): A field that is declared as static belongs to the class, rather than a specific object.

static method: A method that is declared as static belongs to the class, rather than a specific object.

static class: Java does not have the concept of static classes, but a nested class can be static.

the static keyword is mainly used to define class-level methods and variables, utility classes, singletons, and constants.

## What is the differences between overriding and overloading?

Overriding: Overriding is the ability of a subclass to provide a specific implementation of a method that is already provided by its superclass.

Overloading: Overloading is the ability of a class to have multiple methods with the same name but with different parameters.

## What is the differences between super and this?

Super: The super keyword is used to access members of the superclass. It is used to refer to the immediate parent class, and can be used to call the superclass's constructor or to access the superclass's fields and methods.

This : The this keyword is used to refer to the current object. It can be used to access the fields and methods of the current class, and to call the current class's constructor.

## What is the Java load sequence?

Loading: The Java Virtual Machine (JVM) loads the class files that are required to run the program.

Linking: The JVM resolves all of the symbolic references in the class files.

Initialization: The JVM initializes the class variables and static initializers.

Execution: The JVM calls the main method of the program, which is the entry point of the program, and the program starts executing.

## What is Polymorphism ? And how Java implements it ?

Polymorphism is a concept in object-oriented programming that allows objects of different types to be treated as objects of a common supertype.

We can implements polymorphism through the use of interfaces and inheritance.

## What is Encapsulation ? How Java implements it? And why we need encapsulation?

Encapsulation is a concept in object-oriented programming that refers to the practice of hiding the internal state and implementation details of an object from the outside world.

Java implements encapsulation through the use of access modifiers (public, private, protected, and default) and getter and setter methods.

Encapsulation is used to hide the internal state and implementation details of an object from the outside world, this allows for a more secure and maintainable code.

## What is Interface and what is abstract class? What are the differences between them?

Interface: An interface defines a set of abstract methods that a class must implement. An interface is a pure abstraction and contains only method signatures, and no implementation.

Abstract class: An abstract class is a class that cannot be instantiated, but can be subclassed. An abstract class can define both abstract and concrete methods, and it may provide a default implementation for some or all of its methods.

The main difference between them is that, interface only contains method signatures and no implementation, while abstract class can contain both method signatures and implementation.

## What are Queue interface implementations and what are the differences and when to use what?

In Java, the Queue interface is a part of the Java Collections Framework and is a collection designed to hold elements prior to processing.

The differences between the implementations of the Queue interface in the Java Collections Framework are their thread-safety, performance and the way they are implemented. ArrayDeque and LinkedList are not thread-safe, ArrayDeque is faster but LinkedList is more flexible when adding and removing elements frequently at the beginning or end of the queue. PriorityQueue is not thread-safe and it maintains the elements in a sorted order, it is best used when you need a queue that keeps the elements in a specific order. 