### 1. 
### 2.  What is the checked exception and unchecked exception in Java, could you give one example?
Checked exceptions are checked at compile time. Ex. FileNotFoundException
Unchecked exceptions are are runtime exceptions that are not required to be caught or declared in a throws clause.
Ex. ArithmeticException

### 3.Can there be multiple finally blocks?
No. In Java we can have only 0 or 1 finally blocks.

### 4.When both catch and finally return values, what will be the final result?
Return value from the finally block.

### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
An unchecked exception (also known as runtime exception) in Java is something that has gone wrong with the program and is unrecoverable
Checked exceptions are also known as compile-time exceptions as these exceptions are checked by the compiler during the compilation process to confirm whether the exception is handled by the programmer or not

### 6. What is the difference between throw and throws?
Both throw and throws are concepts of exception handling in Java. The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

### 7.Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
Because we want to always catch the most specific first and then the most generic. Null/Runtime exception is more specific than Exception. So they should come before Exception.

### 8. What is optional? why do you use it? write an optional example. 
Optional is generally used as a return type for methods that might not always have a result to return.
The main design goal of Optional is to provide a means for a function returning a value to indicate the absence of a return value. This allows the caller to continue a chain of fluent method calls.
Example: Check if value is not Present
```
import java.util.Optional;  
public class OptionalExample {  
    public static void main(String[] args) {  
        String[] str = new String[10];  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){  // check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("string value is not present");  
    }  
}  
```

### 9. Why finally always be executed ?
Finally blocks ensures that the codes in the block is always executed even if an unexpected exception occurs.


### 10. What is Java 8 new features ?
+ forEach() method in Iterable interface
+ default and static methods in Interfaces
+ Functional Interfaces and Lambda Expressions
+ Java Stream API for Bulk Data Operations on Collections
+ Java Time API
+ Collection API improvements
+ Concurrency API improvements
+ Java IO improvements
### 11. What are the types of design patterns in Java ?
Behavioral, Creational, Structural

### 12. What are the SOLID Principles ?
+ Single Responsibility Principle
+ Open-Closed Principle
+ Liskov Substitution Principle
+ Interface Segregation Principle
+ Dependency Inversion Principle

### 13. How can you achieve thread-safe singleton patterns in Java ?
Create a singleton class first:
+ Create the private constructor to avoid any new object creation with new operator
+ Declare a private static instance of the same class
+ Provide a public static method that will return the singleton class instance variable. If the variable is not initialized then initialize it or else simply return the instance variable

Make it thread-safe:
+ Create the instance variable at the time of class loading.
+ Synchronize the getInstance() method.
+ Use synchronized block inside the if loop and volatile variable

### 14. What do you understand by the Open-Closed Principle (OCP) ?
The Open-Closed Principle (OCP) states that software entities (classes, modules, methods, etc.) should be open for extension, but closed for modification.
It means that you should put new code in new classes/modules. Existing code should be modified only for bug fixing. New classes can reuse existing code via inheritance.

### 15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
substituted with any object of type B. What does this actually mean? (from OA ) choose your answer


Answer: It mean that if the object of type A can do something, the object of type B could also be able tp
perform the same thing

### 16.  Watch the design pattern video, and type the code, submit it See MavenProject folder

