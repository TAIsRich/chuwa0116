# HW4 - Hao Jia

### 1.

### 2. What is the checked exception and unchecked exception in Java, could you give one example?

+ Check Exception are those that are checked at compile-time. These are exceptions that are typically related to problems that can be anticipated and recovered from.\
IOException\
SQLException

+ Unchecked Exception are not checked at compile-time, These are exceptions that are typically related to programming errors.\
NullPointerException\
ArrayIndexOutOfBoundsException



### 3. Can there be multiple finally blocks?
No. Because finally block will execute no matter there is a error. But there could be many catch block with scope from small to large.

### 4. When both catch and finally return values, what will be the final result?
In Java, when a try block completes and an exception is caught by a catch block, the catch block will execute and return its value. However, before the program leaves the try-catch statement, the finally block will always execute, regardless of whether an exception was caught or not.

If the finally block also returns a value, that value will be the final result of the try-catch statement, and any value returned by the catch block will be ignored.

### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
+ Check Exception are those that are checked at compile-time. These are exceptions that are typically related to problems that can be anticipated and recovered from.\
  IOException\
  SQLException

+ Unchecked Exception are not checked at compile-time, These are exceptions that are typically related to programming errors.\
  NullPointerException\
  ArrayIndexOutOfBoundsException

### 6. What is the difference between throw and throws?
+ throw is used to explicitly throw an exception.\
+ throws is used in the method declaration to indicate that a method may throw one or more exceptions.

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
We need to make the sequence from small scope to large scope.\
A NullPointerException is a more specific type of exception. If the catch block for the NullPointerException comes after the catch block for Exception, the program would catch the Exception instead of the NullPointerException, even if the NullPointerException occurred.

### 7. What is optional? why do you use it? write an optional example.
In Java, the Optional class is a container object which may or may not contain a non-null value. It is used to represent a value that may not be present or that may be null. It was introduced in Java 8 as a replacement for null checks and to prevent the occurrence of NullPointerException.

The Optional class provides methods to check if a value is present, to retrieve the value, or to provide a default value if the value is not present. It also provides methods to perform operations on the value, such as filtering or mapping.

Here is an example of how to use the Optional class to safely retrieve a value from a list:

```java
Optional<Employee> optional =
        Optional.of(employee);

employee = null;
Optional<Employee> optional2 =
        Optional.ofNullable(employee);

Employee optional3 =
        Optional.ofNullable(employee).orElse(new
        Employee(1, "JCole", 30, 6666));

Employee optional3 =
        Optional.ofNullable(employee).orElseThrow(()
        -> new RuntimeException("Wow Exception"));

```

### 8. Why finally always be executed ?
because it is used for cleanup activities that must be performed regardless of whether an exception is thrown or caught.

### 9. What is Java 8 new features ?
+ Default method and static method in interface
+ Lambda & functional interface
+ Optional
+ Stream API
+ Method reference
### 10. What are the types of design patterns in Java ?
+ Creational patterns: These patterns focus on the creation of objects and classes. Examples include the Singleton pattern, the Factory pattern, and the Builder pattern.

+ Structural patterns: These patterns focus on the relationships between objects and classes. Examples include the Adapter pattern, the Bridge pattern, and the Composite pattern.

+ Behavioral patterns: These patterns focus on the communication and behavior of objects and classes. Examples include the Observer pattern, the State pattern, and the Command pattern.

+ Concurrency patterns: These patterns focus on the management of multiple threads and the synchronization of shared resources. Examples include the Producer-Consumer pattern, the Read-Write Lock pattern, and the Monitor Object pattern.

+ J2EE patterns: These patterns are specifically designed for the Java 2 Platform, Enterprise Edition (J2EE) and deals with the presentation, Business and integration layers. Examples include MVC pattern, Business delegate pattern, and DAO pattern.

### 11. What are the SOLID Principles ?
+ Single Responsibility Principle (SRP)

+ Open-Closed Principle (OCP)

+ Liskov Substitution Principle (LSP)

+ Interface Segregation Principle (ISP)

+ Dependency Inversion Principle (DIP)

### 12. How can you achieve thread-safe singleton patterns in Java ?
A singleton pattern is a design pattern that ensures that a class has only one instance and provides a global access point to that instance. In Java, there are several ways to achieve thread-safety in a singleton pattern. Here are a few common approaches:

+ Eager Initialization: The instance of the singleton class is created at the time of class loading, before any thread gets a chance to access it. This approach is simple and easy to implement, but it can lead to resource wastage if the singleton is not used.

+ Lazy Initialization: The instance of the singleton class is created only when a thread needs it. This approach is more efficient than eager initialization, but it is not thread-safe, and multiple threads could end up creating multiple instances of the singleton class.

+ Double Checked Locking: In this approach, a synchronized block is used to check for the existence of an instance, and if it does not exist, the singleton is created inside the synchronized block. This approach reduces the overhead of acquiring the lock every time an instance is needed and improves performance.

+ Bill Pugh Singleton: This approach uses an inner static class to create the singleton instance. The inner class is not loaded until the getInstance() method is called, which ensures that the singleton is not created until it is needed and makes it thread-safe.

+ Enum Singleton: The enum type has built-in support for singleton semantics, and it is guaranteed to be thread-safe.

Using volatile variable: By making the variable volatile and checking it twice in the getInstance() method, you can make sure that the singleton is instantiated only once and it is thread-safe.


### 13. What do you understand by the Open-Closed Principle (OCP)?
Objects or entities should be open for extension but closed for modification, meaning that new functionality should be added through inheritance or composition rather than modifying existing code.

### 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
It means that if the object of type A can do something, the object of type B could also be able to perform the same thing.


### 15. 


















