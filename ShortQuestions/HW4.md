# HW4

### 1 Practice collection

It is shown in Coding/coding2.

### 2 What is the checked exception and unchecked exception in Java, could you give one example?

+ Checked exception: checked at compile time, e.g. `IOException`
+ Unchecked exception: runtime exception, e.g. `NullPointerException` 

### 3 Can there be multiple finally blocks?

No, we can only have 1 `finally` block.

### 4 When both catch and finally return values, what will be the final result?

Return both of the values.

### 5 What is Runtime/unchecked exception? what is Compile/Checked Exception?

+ Checked exception: checked at compile time, e.g. `IOException`
+ Unchecked exception: runtime exception, e.g. `NullPointerException`

### 6 What is the difference between throw and throws?

+ The `throw` keyword in Java is used to explicitly throw an exception from a method or any block of code. 

+ `Throws` is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions. The caller to these methods has to handle the exception using a try-catch block. 

### 7 Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
Because the Exception has the biggest scope, we should try to find the exception with the smallest scope. 

### 8 What is optional? why do you use it? write an optional example.

Optional is a container object which may or may not contain a non-null value. 

To avoid Null checks and run time NullPointerExceptions.

```java
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args)
    {
        String[] words = new String[10];
        Optional<String> checkNull
            = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}
```

### 9 Why finally always be executed ?

The `finally` block *always* executes when the `try` block exits. This ensures that the `finally` block is executed even if an unexpected exception occurs. 

### 10 What is Java 8 new features ?

+ Default method and static method in interface
+ Lambda and Functional interface
+ Optional
+ Method reference
+ Stream API

### 11 What are the types of design patterns in Java ?

+ Creational Design Pattern
  + Factory Pattern
  + Abstract Factory Pattern
  + Singleton Pattern
  + Prototype Pattern
  + Builder Pattern

+ Structural Design Pattern
  + Adapter Pattern
  + Bridge Pattern
  + Composite Pattern
  + Decorator Pattern
  + Facade Pattern
  + Flyweight Pattern
  + Proxy Pattern
+ Behavioral Design Pattern
  + Chain Of Responsibility Pattern
  + Command Pattern
  + Interpreter Pattern
  + Iterator Pattern
  + Mediator Pattern
  + Memento Pattern
  + Observer Pattern
  + State Pattern
  + Strategy Pattern
  + Template Pattern
  + Visitor Pattern

### 12 What are the SOLID Principles ?

+ Single Responsibility Principle
+ Open-Closed Principle
+ Liskov Substitution Principle
+ Interface Segregation Principle
+ Dependency Inversion Principle.

### 13 How can you achieve thread-safe singleton patterns in Java?

+ Create the instance variable at the time of class loading.
+ Synchronize the getInstance() method.
+ Use synchronized block inside the if loop and volatile variable.

### 14 What do you understand by the Open-Closed Principle (OCP) ?

As the name suggests, this principle states that software entities should be open for extension, but closed for modification. As a result, when the business requirements change then the entity can be extended, but not modified.

### 15 Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
It mean that if the object of type A can do something, the object of type B could also be able tp 
perform the same thing

### 16 Watch the design pattern video, and type the code, submit it to MavenProject folder

Shown in MavenProject folder.