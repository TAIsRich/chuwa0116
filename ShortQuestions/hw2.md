							 								
#### 1. Write up Example code to demonstrate the three foundmental concepts of OOP.(referenceCodeDemo repo as example)
   - Encapsulation
```
class User {
    // Private fields
    private String userName;
    private String password;

    //Parameterzied constructor to create a new users
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
 ```
   - Polymorphism
```
public class Shape {

    public double getArea() {
        return 0;
    }

}

// A Rectangle is a Shape with a specific width and height
class Rectangle extends Shape {   // extended form the Shape class

    private double width;
    private double height;

    public Rectangle(double width, double heigh) {
        this.width = width;
        this.height = heigh;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
```
   - Inheritance
```
// Base or Super Class
class Employee {
    int salary = 60000;
}
 
// Inherited or Sub Class
class Engineer extends Employee {
    int benefits = 10000;
}
```
 												 						
#### 2. What is wrapper class in Java and Why we need wrapper class?
+ The wrapper classes in java are used for the methods that support objects like a conversion from other types.
+ they help a Java program be completely object-oriented.
#### 3 What is the difference between HashMap and HashTable?
+ HashMap and Hashtable are both classes that provide a key-value based data structure.
+ HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value. 
+ HashMap is non-syncronized and is not thread safe while HashTable is thread safe and is synchronized.
+ HashMap is generally faster and has some different methods than Hashtable.
#### 4 What is String pool in Java and why we need String pool?
+ String pool is a pool of Strings stored in Java Heap Memory. It helps to improve memory efficiency, performance, security and consistency.
+ It is created to decrease the number of string objects created in the memory. Whenever a new string is created, JVM first checks the string pool. If it encounters the same string, then instead of creating a new string, it returns a reference existing string to the variable.
#### 5 What is Java garbage collection?
+ Java garbage collection is the process by which the JVM automatically manages the memory used by a Java application by periodically scanning the heap for eligible objects and freeing up the memory occupied by those objects. 
+ It is done automatically and helps to prevent memory leaks and improve performance.
#### 6 What are access modifiers and their scopes in Java?
Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are:
+ Public – accessible from everywhere in the application
+ Protected – accessible within the package and the subclasses in any package
+ Default – accessible strictly within the package
+ Private – accessible only within the same class where it is declared
#### 7  What is final keyword? (Field, Method, Class)
+ The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override). 
#### 8 What is static keyword? (Field, Method, Class). When do we usually use it?
+ static keyword is mainly used for memory management. It can be used with variables, methods, blocks and nested classes. It is a keyword which is used to share the same variable or method of a given class. 
+ Basically, static is used for a constant variable or a method that is same for every instance of a class.
#### 9 What is the differences between overriding and overloading?
+ When the method signature (name and parameters) are the same in the superclass and the child class, it's called overriding. When two or more methods in the same class have the same name but different parameters, it's called overloading
#### 10 What is the differences between super and this?
+ `super` keyword is used to access methods of the parent class while `this` is used to access methods of the current class.
+ `super()` is used to call Base class’s constructor(i.e, Parent’s class) while `this()` is used to call the current class’s constructor.
#### 11 What is the Java load sequence?
+ static variable/block -> constructor
#### 12 What is Polymorphism ? And how Java implements it ?
+ polymorphism is the provision of a single interface to entities of different types or the use of a single symbol to represent multiple different types.
+ Compile-time polymorphism (Static binding) – Method overloading
+ Runtime polymorphism (Dynamic binding) – Method overriding
#### 13 What is Encapsulation ? How Java implements it? And why we need encapsulation?
+ Encapsulation is a way to restrict the direct access to some components of an object, so users cannot access state values for all of the variables of a particular object.
+ Because we need to protect data from external environment.
#### 14 What is Interface and what is abstract class? What are the differences between them?
+ Interface implement other class and abstract class extends other class.
+ Interfaces are a kind of code contract, which must be implemented by a concrete class. Abstract classes are similar to normal classes, with the difference that they can include abstract methods, which are methods without a body. Abstract classes cannot be instantiated.
**Difference**
+ The interface does not have access modifiers but abstract have.
+ Interface only static and final variable, abstract class can have final, non-final, static and non-static
  variables
+ In an abstract interface keyword, is optional for declaring a method as an abstract.In an abstract class, the abstract
  keyword is compulsory for declaring a method as an abstract.
+ An interface cannot declare constructors or destructors. An abstract class can declare constructors and destructors.
#### 15 (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder)
+ The codes are in the codingQuestions/coding1 folder.
#### 16 What are Queue interface implementations and what are the differences and when to use what?
+ Queue implement LinkedList and PriorityQueue.
+ LinkedList preserves the insertion order, PriorityQueue does not.
+ LinkedList have no order, but PQ will pop the smallest value first
