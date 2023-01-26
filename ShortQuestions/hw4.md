### What is the checked exception and unchecked exception in Java, could you give one example?

In Java, there are two main types of exceptions: checked exceptions and unchecked exceptions.

Checked exceptions are exceptions that are checked at compile time. This means that if a method throws a checked exception, the compiler will require the calling code to either handle the exception or to declare that it throws the exception. Examples of checked exceptions in Java include IOException and SQLException.

Unchecked exceptions are exceptions that are not checked at compile time. This means that the compiler does not require the calling code to either handle the exception or to declare that it throws the exception. Examples of unchecked exceptions in Java include NullPointerException and IllegalArgumentException.

In general, it is good practice to handle both checked and unchecked exceptions in your code, to ensure that your program can gracefully handle any errors that may occur. However, because unchecked exceptions are not checked at compile time, it is not always possible to handle them, and they can sometimes lead to unexpected behavior or errors in your program.

### Can there be multiple finally blocks?

Only one finally block can be associated with a try block. A finally block can be used alone or in conjunction with catch blocks. The code in a finally block is executed after the try block and any associated catch blocks have been executed, regardless of whether an exception was thrown or caught.

### When both catch and finally return values, what will be the final result?

If a try block contains both catch and finally blocks, and both of them return a value, the final result will be the value returned by the finally block. The value returned by the catch block will be ignored.

This is because the finally block is guaranteed to be executed after the try and catch blocks, regardless of whether an exception was thrown or caught. Therefore, the return statement in the finally block will overwrite any previous return value from the catch block.

It's worth noting that if the try block completes normally and doesn't throw an exception, then any return statement in a catch block will not be executed.

PS: If a try block contains a return statement and is followed by a finally block that also contains a return statement, the return value from the finally block will overwrite the return value from the try block. The final result will be the value returned by the finally block.

### What is the difference between throw and throws?

n Java, "throw" and "throws" are used to handle exceptions, but they are used in different ways.

"throw" is used to throw an exception explicitly, within a method or a constructor. It is followed by an instance of an exception class, which you are creating and throwing.

"throws" is used to indicate that a method or a constructor can throw one or more exceptions. It is used in the method signature, to declare that the method can throw an exception, without handling it.

### Why do we put the Null/Runtime exception before Exception?

The exception types in the catch blocks must be listed in descending order of inheritance. This means that the most specific exception type must be listed first, followed by the more general exception types. In this example, the ArithmeticException is a more specific exception type than the Exception, so it is listed first.

### What is the Optional class in Java and why do we need it? Write an optional example.

In Java, the Optional class is a container object that is used to represent the presence or absence of a value. It is a generic class that has a single type parameter, which specifies the type of the value that it contains. An Optional object can be empty, in which case it does not contain a value, or it can contain a non-null value.

The Optional class was introduced in Java 8 to provide a better way to handle null values, which can cause NullPointerExceptions when not handled properly. The Optional class allows you to avoid null checks by using its methods to determine whether a value is present and to access the value if it is. This can help to make your code more concise and readable. It handle null values in a more elegant way. It's a container object which may or may not contain a non-null value. If a value is present, `isPresent()` returns true and `get()` returns the value. If no value is present, `isPresent()` returns false.

Here's an example:

```java
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = getName();
        if (optional.isPresent()) {
            System.out.println("Name is: " + optional.get());
        } else {
            System.out.println("Name is not present");
        }
    }
    public static Optional<String> getName() {
        return Optional.ofNullable("John Wick");
    }
}

```

### Why is finally always executed?

The finally block is always executed because it is used to ensure that certain actions are taken, regardless of whether an exception was thrown or caught. This can be useful for performing cleanup tasks such as closing resources.

### What are Java 8 new features?

- Lambda Expressions: Java 8 introduced lambda expressions, which are a concise way to represent a functional interface (an interface with a single abstract method) as a function. This allows for more elegant and readable code, especially when working with collections or handling events.
- Stream API: The Stream API was introduced in Java 8 to allow for more functional-style operations on collections of data. It allows for operations such as filtering, mapping, and reducing to be performed in a more readable and efficient way.
- Functional Interfaces: Java 8 introduced a new package, `java.util.function`, that contains several functional interfaces such as `Predicate`, `Consumer`, and `Function` that are useful in functional programming.
- Optional: Java 8 introduced the `java.util.Optional` class as a way to handle null values in a more elegant way. It's a container object which may or may not contain a non-null value.
- Method References: Java 8 introduced method references, which allow a method to be used as if it were a lambda expression. This can make code more readable and concise, especially when working with the Stream API.
- Default and static methods in interfaces: Java 8 allows interfaces to define default and static methods, enabling to add new functionality to the interfaces without affecting their existing implementations.

These new features have allowed for more elegant, readable, and efficient code, and have enabled new programming paradigms such as functional programming to be used in Java.

### What are the types of design patterns in Java?

In Java, design patterns are reusable solutions to common software development problems. Here is a brief explanation of three popular design patterns:

- Singleton: The Singleton pattern is a design pattern that ensures a class has only one instance and provides a global point of access to that instance. The Singleton pattern is often used for logging, driver objects, caching, thread pool, and other resources that are shared by the entire application.
- Builder: The Builder pattern is a design pattern that separates the construction of an object from its representation. It allows for the construction of complex objects to be done in a step-by-step fashion, using a builder object. This can make the construction process more flexible and readable.
- Factory: The Factory pattern is a design pattern that provides a way to create objects without specifying the exact class of object that will be created. It defines an interface for creating an object, but allows subclasses to alter the type of objects that will be created. This can be useful when an application needs to be extended to create new types of objects, without modifying existing code.

### What are the SOLID Principles?

SOLID is an acronym that stands for five design principles that were first introduced by Robert C. Martin in the book "Agile Software Development, Principles, Patterns, and Practices." These principles are intended to make software designs more maintainable, flexible, and scalable. The SOLID principles are:

1. Single Responsibility Principle (SRP): A class should have only one reason to change, meaning that it should have only one responsibility. This makes it easier to understand and maintain the code, as changes to the class are more likely to affect only a single part of the codebase.
2. Open-Closed Principle (OCP): A class should be open for extension but closed for modification. This means that a class should be designed in such a way that new functionality can be added to it without modifying the existing code.
3. Liskov Substitution Principle (LSP): Subtypes should be substitutable for their base types. This means that objects of a superclass should be able to be replaced with objects of a subclass without affecting the correctness of the program.
4. Interface Segregation Principle (ISP): A class should not be forced to implement interfaces it does not use. This means that a class should have only the methods that it needs to have, and not be forced to implement unnecessary methods.
5. Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules, but both should depend on abstractions. This means that a class should depend on abstractions rather than concrete implementations, which makes the code more flexible and easier to change.

### How can you achieve thread-safe singleton patterns in Java?

There are several ways to achieve thread-safe singleton patterns in Java. Here are a few common approaches:

Eager initialization: In this approach, the singleton instance is created when the class is loaded. This guarantees that only one instance will be created, and it is thread-safe. However, this approach can lead to resource wastage if the singleton is not used.

```java
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
```



Lazy initialization with double-checked locking: In this approach, the singleton instance is created only when it is first accessed. To make this approach thread-safe, a double-checked locking mechanism is used. This approach can improve performance by avoiding unnecessary synchronization.

```java
public class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
```



Enum Singleton: This approach uses the fact that enum values are instantiated only once in a Java program, by the JVM at the time of class loading.

```java
public enum EnumSingleton {
    INSTANCE;
    public void doSomething(){
        // implementation
    }
}
```

Each of these approaches has its own pros and cons, and the choice of which one to use depends on the specific requirements of the application. The approach using Enum Singleton is considered as the best practice as it is easy to implement and thread-safe.

### How do you understand the Open-Closed Principle (OCP)?

The Open-Closed Principle (OCP) is a principle of object-oriented programming that states that a class should be open for extension but closed for modification. This means that a class should be designed in such a way that new functionality can be added to it without modifying the existing code.

The key idea behind the OCP is that a class should be designed in such a way that it can be extended to meet new requirements, without changing its existing code. This allows for more flexibility and maintainability of the codebase, as changes to the class are more likely to affect only a single part of the codebase.

Achieving the OCP can be done by following these guidelines:

- Identify the parts of the code that are likely to change, and encapsulate them in separate classes or methods.
- Use inheritance or interfaces to allow these parts to be extended or replaced without changing the existing code.
- Avoid using global variables or hard-coded values, as they can make it difficult to change the code without affecting other parts of the system.

### 14

Ans: 1.

Reason why not choose 3: Private methods cannot and package-private methods may not be present in the subclass.