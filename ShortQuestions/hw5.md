### 1.  What is generic in Java?  and type the generic code by yourself.
Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
### 2.  Read those codes and type it one by one by yourself. 

### 3.  practice stream API at least 3 times

### 4.  Write the Singleton design pattern include eager load and lazy load.
```
// Eager load
public class Singleton {
    private Singleton(){}
    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;    
    }
}
```
```
//Lazy load
public class Singleton{
    private static volatile Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }    
    }
}
```

### 5.  What is Runtime Exception? could you give me some examples?
RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine. Examples of runtime exceptions: ArithmeticException, NullPointerException and ClassCastException.
### 6.  Could you give me one example of NullPointerException?

```
public class Main {
	public static void show(String s){
    	System.out.println(s.toLowerCase());
    }


  public static void main(String[] args) {
    String greeting = null;
    show(greeting);
  }
}
```
### 7. What is the Optional class?
The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.
### 8.  What is the @FunctionalInterface?
Explaination: @FunctionalInterface is an annotation to ensure the interface is functional only.
### 9.  what is lambda?
Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
### 10. What is Method Reference?
Method references are a special type of lambda expressions. They're often used to create simple lambda expressions by referencing existing methods. There are four kinds of method references: Static methods. Instance methods of particular objects. Instance methods of an arbitrary object of a particular type.
### 11. What is Java 8 new features?
- forEach() method in Iterable interface
- default and static methods in Interfaces
- Functional Interfaces and Lambda Expressions
- Java Stream API for Bulk Data Operations on Collections
- Java Time API
- Collection API improvements
- Concurrency API improvements
- Java IO improvements
### 12. Lambda can use unchanged variable outside of lambda? what is the details?
If we want to use variables outside of lambda, these vairable should be final or effectively final. The variable shuld be decleared as FInal or assigned only once. 