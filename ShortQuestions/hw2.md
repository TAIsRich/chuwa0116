### What is wrapper class in Java and why do we need wrapper class?

In Java, a wrapper class is a class that wraps or "encapsulates" a primitive data type, such as int or char, and converts it into an object. The wrapper classes in Java are: Boolean, Byte, Character, Double, Float, Integer, Long and Short.

We need wrapper classes in Java because they provide a way to treat primitive data types as objects. This can be useful in certain situations, such as when working with collections, which can only hold objects, not primitives. Additionally, wrapper classes provide useful methods for converting between primitive types and strings, as well as for performing other operations on primitive values.

### What is the difference between HashMap and HashTable?

In Java, HashMap and Hashtable are both classes that implement the Map interface, but there are some key differences between them.

1. Synchronization: HashMap is not synchronized, which means it is not thread-safe. Hashtable is synchronized, which means it is thread-safe.
2. Null keys and values: HashMap allows null keys and values, while Hashtable does not.
3. Performance: Because HashMap is not synchronized, it is generally faster than Hashtable. However, if multiple threads will be accessing a HashMap concurrently, it must be synchronized externally.
4. Iterator: HashMap's iterator is fail-fast while Hashtable's iterator is fail-safe.

### What is String pool in Java and why do we need String pool?

In Java, the String pool is a special area of memory where Strings are stored. Strings are immutable in Java, which means that once they are created, they cannot be modified. Because of this, it is efficient to store and reuse Strings that have already been created, rather than creating a new String object each time the same String is used. This is where the String pool comes in.

When a String is created in Java, the JVM first checks the String pool to see if an identical String already exists. If it does, the JVM will return a reference to the existing String rather than creating a new String object. This means that multiple references to the same String will all point to the same object in memory, which can save a lot of memory and improve the performance of your application.

Using the String pool can improve the performance of your application by reducing the number of objects that need to be created and garbage collected. It can also save memory by ensuring that multiple references to the same String point to the same object in memory.

### What is Java garbage collection?

Java garbage collection is the process by which the Java Virtual Machine (JVM) automatically frees up memory that is no longer being used by a Java application. The JVM periodically checks for objects in memory that are no longer being referenced by the application and removes them from memory. This helps to prevent the application from running out of memory and crashing.

Java garbage collection works by using a mark-and-sweep algorithm. The JVM starts by marking all objects in memory that are still being used by the application. Then, it "sweeps" through memory and frees up any objects that were not marked. This process is known as a garbage collection cycle.

The JVM uses a number of different garbage collection algorithms, such as the parallel scavenge and parallel old algorithms, to optimize the performance of garbage collection. The JVM also provides a number of options that can be used to control the behavior of the garbage collector, such as setting the amount of memory that should be allocated for the heap.

It's important to note that garbage collection is not instantaneous, and it can cause a temporary pause in the execution of an application while it is running. However, this pause is generally very short, and it is not usually noticeable to the user.

### What are access modifiers and their scopes in Java?

In Java, access modifiers are keywords that are used to specify the accessibility of a class, method, or variable. There are four access modifiers in Java: public, private, protected, and default (also known as package-private). Each access modifier has a different scope, which determines where the class, method, or variable can be accessed.

| Access Modifer | Scope                                                        |
| -------------- | ------------------------------------------------------------ |
| public         | Can be accessed from anywhere in the Java program.           |
| protected      | Wthin the package in which it is declared and by subclasses of the class in which it is declared, even if the subclass is in a different package. |
| default        | Within the package in which it is declared, but not outside of the package. (package access/ package private) |
| private        | Within the class in which it is declared.                    |

### What are final field, method and class in Java?

In Java, a final field, method, or class is a field, method, or class that cannot be modified once it is created. This means that the value of a final field cannot be changed, a final method cannot be overridden, and a final class cannot be subclassed.

### What are static field, static method, and static class?

In Java, a static field, method, or class is a field, method, or class that belongs to a class rather than an instance of the class. This means that static fields, methods, and classes are shared by all instances of the class and can be accessed without creating an instance of the class.

You cannot make an outer class static in Java. Only inner classes (classes that are defined within another class) can be marked as static. A static class is a class that can only contain static members (fields and methods). It cannot contain non-static members or instance variables, and it cannot be instantiated. Static classes are often used to group related static methods together, or to define utility classes that provide useful static methods.

### What are the differences between overriding and overloading?

Override: runtime polymorphism.

Overload: complie time polymorphism.

Overriding and overloading are two related but distinct concepts in object-oriented programming. Overriding refers to the ability of a subclass to provide its own implementation for a method that is defined in the superclass, while overloading refers to the ability to define multiple methods with the same name but different parameters.

Here are the main differences between overriding and overloading in Java:

1. Signature: In overriding, the signature of the method (name and parameters) must be the same in both the superclass and the subclass. In overloading, the name of the methods must be the same, but the number and types of the parameters can be different.
2. Return type: In overriding, the return type of the method must be the same or a subclass of the return type in the superclass. In overloading, the return type of the methods can be different.
3. Access modifiers: In overriding, the access modifier of the method in the subclass must be the same or more restrictive than the access modifier in the superclass. In overloading, the access modifiers of the methods can be different.
4. Overriding vs. hiding: In overriding, the method in the subclass completely replaces the method in the superclass. In overloading, the methods are considered different methods and are not related to each other.

Some other rules of overriding are:

- Static and final methods can’t be overridden.
- Private methods can’t be overridden.
- The exception thrown by the overridden method should be smaller than or equals to the super class method.
- Constructors cannot be overridden. Because the constructors need to keep the same name as the class, and the requirement for overriding is that the subclass method must keep the same name as the parent class method. If the constructor is allowed to be overridden, then there will be a constructor with a different class name in the subclass, which is contradictory to the requirements of the constructor.

### What are the differences between super and this?

In Java, "super" and "this" are two keywords that are used to refer to different things:

1. "super" is used to refer to the immediate parent class of an object. It is used to access methods and variables of the parent class that have been overridden by a subclass.
2. "this" is used to refer to the current object of a class. It is used to access methods and variables of the same class. It can also be used to pass the current object as an argument to a method or a constructor of the same class.

### What is the Java load sequence?

Static variable/block -> constructor.

### What is Polymorphism? And how Java implements it?

In Java, polymorphism refers to the ability of an object to take on multiple forms. Polymorphism is a fundamental concept in object-oriented programming, which allows you to write code that is flexible, reusable, and extensible.

Polymorphism is achieved in Java through the use of inheritance, interfaces, overloading and overriding methods. These features allow you to create classes that share a common interface and can be used interchangeably, even if they have different implementations.

### What is Encapsulation? How Java implements it?

Encapsulation is one of the four fundamental OOP (Object-Oriented Programming) concepts. It is the mechanism that binds together code and data, and keeps both safe from outside interference and misuse. In encapsulation, the data and behavior of an object are defined as a single unit, and the external access to this unit is controlled by a well-defined interface. This allows an object to maintain a consistent internal state and prevents it from being affected by changes in the external environment.

In Java, encapsulation is implemented using the private keyword, which restricts access to a class's fields and methods. This means that these fields and methods can only be accessed by other members of the same class, providing a level of security and data hiding. Encapsulation is an important concept in Java because it allows developers to create complex, flexible, and maintainable programs.

### Why do we need encapsulation?

Encapsulation is important for a number of reasons. One of the main reasons for using encapsulation is to control access to the data and behavior of an object. By hiding the internal details of an object and only exposing a public interface, you can prevent other parts of your code from modifying the object in a way that could cause errors or unexpected behavior. This allows you to create a stable and reliable system, where changes to one part of the code don't affect other parts of the code.

Another reason for using encapsulation is to promote code reuse. By defining an object's behavior and data as a single unit, you can easily use that object in different parts of your code, without having to worry about how the object is implemented. This can save you a lot of time and effort, and make your code more modular and flexible.

Finally, encapsulation can help you to write more maintainable code. By hiding the internal details of an object and only exposing a simple interface, you can make it easier to update and modify the object without breaking other parts of your code. This can save you a lot of time and effort in the long run, and make your code more efficient and scalable.

### What is Interface and what is abstract class? What are the differences between them?

In Java, an interface is a type that defines a set of abstract methods and constants that a class must implement. An interface specifies the behavior that a class must implement, but it does not provide any implementation for those methods.

An abstract class, on the other hand, is a class that cannot be instantiated and is typically used as a base class for other classes that implement its abstract methods. An abstract class can contain both abstract and concrete methods, and it can provide an implementation for some or all of its methods.

| Interface                                                    | Abstract Class                                               |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Can only have static final variables. An interface  can never change its own state. | Can  have any kind of instance or static variables, mutable or immutable. |
| A class can implement multiple interfaces.                   | A  class can extend only one abstract class.                 |
| Can be implemented with the implements keyword. An  interface can also extend interfaces. | Can only be extended.                                        |
| Can't have constructor.                                      | Can have constructor.                                        |
| All method declarations in an interface, including default methods, are implicitly public, so you can omit the public modifier. By default, all methods are public and abstract. | Can have any kind of methods.                                |
| Starting Java 8, interfaces can have default method which provides a default implementation and can be overrideen by classes that implement the interface. | Can have partial implementation.                             |

You do not have to override a default method in an interface if you do not want to provide a custom implementation for the method. You have to override all abstract methods in an interface or an abstract class.

Starting Java 9, private interface methods are supported. This support allows nonabstract methods of an interface to share code between them.

A understanding of interface and abstract class:

An interface is a specification. For the implementer of the interface, the interface specifies which services the implementer must provide; for the caller of the interface, the interface specifies which services the caller can call and how to call these services. When an interface is used in a program, the interface is a coupling standard between multiple modules; when an interface is used between multiple application programs, the interface is a communication standard between multiple programs.

Abstract class is a template design. As the abstract super class of multiple subclasses, an abstract class can be regarded as an intermediate product in the process of system implementation. This intermediate product has already implemented some methods of the system, but this product still cannot be regarded as the final product and must be further improved.

### What are Queue interface implementations and what are the differences?

The most commonly used `Queue` implementations in the `Java Collections Framework` are the `ArrayDeque` ,  `LinkedList`, and `PriorityQueue` classes.

An `ArrayDeque` is a resizable array that provides fast insertion and removal of elements at both the front and the back of the queue. It is more memory-efficient than a `LinkedList` when used as a queue, since it does not maintain references to previous and next elements.

A `LinkedList` is a doubly-linked list that provides fast insertion and removal of elements at both the front and the back of the queue. It is less memory-efficient than an `ArrayDeque` when used as a queue, since it maintains references to previous and next elements.

A `PriorityQueue` orders its elements according to their natural ordering or according to a `Comparator` provided at the time of construction. This means that the `PriorityQueue` always returns its elements in a sorted order, with the smallest or highest-priority element at the front of the queue.

When choosing between an `ArrayDeque` and a `LinkedList` as a `Queue` implementation, you should consider the specific requirements of your application. If you need fast insertion and removal of elements at both the front and the back of the queue, and if memory efficiency is a concern, then an `ArrayDeque` is a good choice. If you need a queue that maintains references to previous and next elements, then a `LinkedList` is a better choice.