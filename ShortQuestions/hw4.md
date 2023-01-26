# Homework 4

### 1. Practice collection

### 2. What is the checked exception and unchecked exception in Java, could you give one example?

```
Checked Exceptions are the exceptions that are checked at compile time. 
Unchecked exceptions are not checked by the compiler. These are called runtime exceptions. 
Example: 
ClassNotFoundException(checked)
NullPointerException(unchecked)
```

### 3. Can there be multiple finally blocks?
```
There can only be one finally block, and it must follow the catch blocks. 
```

### 4. When both catch and finally return values, what will be the final result?
```
If both catch and finally return, the receiving method will get the returned value from the finally block.
```

### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
```
In broad terms, a checked exception (also called a logical exception) in Java is something that has gone wrong in your code and is potentially recoverable.

An unchecked exception (also known as an runtime exception) in Java is something that has gone wrong with the program and is unrecoverable. 
```

### 6. What is the difference between throw and throws?
```
The throw keyword helps in throwing an exception in the program, explicitly inside some block of code or inside any function.

We use the throws keyword in the method signature. We use it to declare some exceptions thrown by a function when the code is getting executed.
```

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?

```

```

### 7. What is optional? why do you use it? write an optional example
```
Optional is a container object which may or may not contain a non-null value.

It can help in writing a neat code without using too many null checks. By using Optional, we can specify alternate values to return or alternate code to run. This makes the code more readable because the facts which were hidden are now visible to the developer.

Example: 
```
```java
import java.util.Optional;
 
public class OptionalDemo {
    public static void main(String[] args){
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}
```

### 8. Why finally always be executed?
```
A finally block is always get executed whether the exception has occurred or not.
If an exception occurs like closing a file or DB connection, then the finally block is used to clean up the code.
```

### 9. What is Java 8 new features ?
```
forEach() method in Iterable interface.
default and static methods in Interfaces.
Functional Interfaces and Lambda Expressions.
Java Stream API for Bulk Data Operations on Collections.
Java Time API.
Collection API improvements.
Concurrency API improvements.
Java IO improvements.
```

### 10. What are the types of design patterns in Java ?
```
Singleton pattern
Factory pattern
Observer pattern
Decorator pattern
```

### 11. What are the SOLID Principles ?
```
Single Responsibility Principle (SRP)
Open-Closed Principle (OCP)
Liskov Substitution Principle (LSP)
Interface Segregation Principle (ISP)
Dependency Inversion Principle (DIP)
```

### 12. How can you achieve thread-safe singleton patterns in Java ?
### 13. What do you understand by the Open-Closed Principle (OCP) ?