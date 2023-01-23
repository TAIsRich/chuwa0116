# hw2
## 1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)
Encapsulation
```
public class Employee {
  private int employeeId;
  private String name;
  
  public int getEmployeeId() {
    return employeeId;
  }
  
  public String getName() {
    return name;
  }
  
  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void printinfo() {
    System.out.println("This is employee class");
  }
}

```
Polymorphism & Inheritance
```
public class engineer extends employee {
  private string buildingLocation;
  private float yoe;
  
  @override
  public void printinfo() {
    System.out.println("This is employee class");
  }
  
  //overloading
  public void setInfo(String buildingLocation) {
    this.buildingLocation = buildingLocation;
  }
  
  //overloading
  public void setInfo(String buildingLocation, float yoe) {
    this.buildingLocation = buildingLocation;
    this.yoe = yoe;
  }
}
```

## 2. What is wrapper class in Java and Why we need wrapper class?
In Java, a wrapper class is a class that encapsulates a primitive data type and converts it to an object. The wrapper classes in Java are: Boolean, Character, Byte, Short, Integer, Long, Float, and Double.

We need wrapper classes in Java because they provide useful methods for working with primitive data types, such as the ability to convert a string representation of a number to its numeric value, and vice versa.
## 3. What is the difference between HashMap and HashTable?
```
    1. HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
    2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
```
## 4. What is String pool in Java and why we need String pool?

In Java, the String pool is a special area in the heap memory where Strings are stored. When a new String is created, the JVM first checks if an identical String already exists in the pool. If it does, the reference to the existing String is returned, rather than creating a new one. The main reason for using String pool is to save memory and improve performance. Since strings are immutable, if multiple references point to the same String, it is more memory efficient to have a single copy of the String and multiple references to it, rather than having multiple copies of the same String. 

## 5. What is Java garbage collection?
Java Garbage Collection (GC) is the process of automatically freeing up memory that is no longer being used by an application. This is done by the Java Virtual Machine (JVM)

When an object is no longer being used by an application, it becomes eligible for garbage collection. The JVM periodically runs the GC process, which identifies and frees up memory occupied by these unreferenced objects. The JVM uses various algorithms to determine which objects are eligible for garbage collection, such as the mark-and-sweep algorithm.

The goal of the GC is to free up memory that is no longer being used, while ensuring that the application continues to run smoothly. The GC process can be triggered by the JVM automatically or explicitly by calling System.gc() method.


## 6. What are access modifiers and their scopes in Java?
- public: can be accessed by any other class or package, regardless of where they are located.

- protected: can be accessed by any other class or package that is located in the same package, or by any subclass of the class in which the protected element is declared, regardless of where the subclass is located.

- default (package-private): Classes, methods, and variables that do not have an explicit access modifier are considered default (package-private). They can be accessed by any other class or package that is located in the same package, but cannot be accessed by any class or package that is located in a different package.

- private: can only be accessed by the class in which they are declared.
## 7. What is final key word? (Filed, Method, Class)
Final Fields: A final field is a variable that cannot be reassigned once it has been initialized. This means that the value of a final field cannot be changed after it has been set.

Final Methods: A final method is a method that cannot be overridden by a subclass. This means that if a class has a final method, any subclasses of that class will not be able to change the implementation of that method.

Final Classes: A final class is a class that cannot be extended. This means that if a class is declared as final, no other class can inherit from it.
## 8. What is static keyword? (Filed, Method, Class). When do we usually use it?
Static Fields: A static field is a variable that belongs to a class rather than an instance of the class. This means that all instances of the class share the same copy of the static field.

Static Methods: A static method is a method that belongs to a class rather than an instance of the class. This means that the method can be invoked on the class itself, rather than on an instance of the class.

Static Classes: While Java doesn't have a static class, it is possible to create a static nested class, which is a class that is defined inside of another class and marked as static. A static nested class can only access static members of the enclosing class and doesn't have access to non-static members.
## 9. What is the differences between overriding and overloading?
- Overriding: Overriding is when a subclass provides a specific implementation for a method that is already defined in its superclass. This allows a subclass to change the behavior of a method inherited from its superclass. In order to override a method, the new method must have the same name, the same number and type of parameters, and the same return type as the method in the superclass. Additionally, the new method must be marked with the keyword "override" and it has to be at least as accessible or more accessible as the method in the superclass.


- Overloading: Overloading is when multiple methods in the same class have the same name but different parameter lists. This allows a class to have multiple methods with the same name but with different behaviors based on the parameters passed in. The methods can have different return types, but it is not required. The Java compiler can determine which method to call at runtime based on the number and type of parameters passed in.
## 10. What is the differences between super and this?
"super" refers to the parent class of the current class and is used to access members of the parent class that have been overridden by the current class or to invoke the parent class constructor. 

"this" refers to the current object and can be used to refer to the current class's members or to invoke the current class's constructor.
## 11. What is the Java load sequence?
static variables and blocks in super class -> static variables and blocks in subclass -> common code blocks and variables in superclass -> superclass's constructor -> common code blocks and variables in subclass -> subclass's constructor

## 12. What is Polymorphism ? And how Java implements it ?
Polymorphism allows a single object or method to be used in multiple ways, depending on the context in which it is used.
Polymorphism contains overloading and Overriding. Overload happens at compile time and override happens at runtime.
## 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
Encapsulation is a mechanism in object-oriented programming that is used to hide the implementation details of an object and expose only the necessary information to the outside world. Java implements encapsulation through the use of access modifiers, such as private, protected, and public. These modifiers can be applied to fields and methods to control their visibility and accessibility to other classes and packages.
## 14. What is Interface and what is abstract class? What are the differences between them?
Interface: An interface is a collection of abstract methods that must be implemented by any class that implements the interface. An interface defines a contract for a set of methods, but does not provide any implementation for those methods. It can only contain abstract methods, constants, and default methods. Interfaces are used to define a common set of methods that will be implemented by multiple classes.

Abstract class: An abstract class is a class that cannot be instantiated, it is used as a base class for other classes. An abstract class can contain both abstract and non-abstract methods, it can also have instance variables and constructor. An abstract class can provide a common implementation for some of the methods that will be used by its subclasses.

The main difference between an interface and an abstract class is that an interface can only contain abstract methods, while an abstract class can contain both abstract and non-abstract methods.
## 15. (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )

## 16. What are Queue interface implementations and what are the differences and when to use what?
In Java, the Queue interface is a data structure that follows the First-In-First-Out (FIFO) ordering. 

LinkedList: The LinkedList class is a general-purpose linked list implementation of the List and Deque interfaces. It implements all optional list operations, and permits all elements, including null. It is not thread-safe and does not provide any built-in synchronization.

ArrayDeque: The ArrayDeque class is a resizable array implementation of the Deque interface. It can be used as a stack (using the push and pop methods) or as a queue (using the add and poll methods). It is not thread-safe, but it is faster than the LinkedList.

PriorityQueue: The PriorityQueue class is an unbounded priority queue based on a priority heap. It is not thread-safe but it can be used to sort elements according to their natural ordering or by a provided comparator.