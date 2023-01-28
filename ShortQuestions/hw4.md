### 1.  Practice  collection
### 2.  What is the checked exception and unchecked exception in Java, could you give one example?
Checked exceptions are the exceptions that are checked at compile time. Checked exceptions must use catch or throws. One example is IOException (e.g. FileNotFound).
Unchecked exceptions are runtime exceptions that are not required to be caught or declared in a throws clause. One example is NullPointerException (NPE).
### 3.  Can there be multiple finally blocks? 
No.
### 4.  When both catch and finally return values, what will be the final result?
If both catch and finally return, the receiving method will get the returned value from the finally block.
### 5.  What is Runtime/unchecked exception? what is Compile/Checked Exception?
An unchecked exception is the one which occurs at the time of execution. A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions.
### 6.  What is the difference between throw and throws?
Both throw and throws are concepts of exception handling in Java. The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

### 7.  Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime  exception before Exception ?
Because we want to chatch the most specific exception first. So we have to put the Null/Runtime  exception before Exception.
### 8.  What is optional? why do you use it? write an optional example.
Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present. In other words, an Optional object can either contain a non-null value (in which case it is considered present) or it can contain no value at all (in which case it is considered empty).
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
### 9.  Why finally always be executed ?
The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs.
### 10.  What is Java 8 new features ?

- forEach() method in Iterable interface
- default and static methods in Interfaces
- Functional Interfaces and Lambda Expressions
- Java Stream API for Bulk Data Operations on Collections
- Java Time API
- Collection API improvements
- Concurrency API improvements
- Java IO improvements

### 11.  What are the types of design patterns in Java ?
Java design patterns are divided into three categories - creational, structural, and behavioral design patterns.
### 12.  What are the SOLID Principles ?
- Single Responsibility Principle
- Open-Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle

### 13.  How can you achieve thread-safe singleton patterns in Java ?
In general, we follow the below steps to create a singleton class:
- Create the private constructor to avoid any new object creation with new operator.
- Declare a private static instance of the same class.
- Provide a public static method that will return the singleton class instance variable. If the variable is not initialized then initialize it or else simply return the instance variable.

### 14.  What do you understand by the Open-Closed Principle (OCP) ?
In object-oriented programming, the open–closed principle (OCP) states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.
### 15.  Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be  substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing.

### 16.  Watch the design pattern video, and type the code, submit it to MavenProject folder