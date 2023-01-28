# Homework 5

### 1. What is generic in Java? and type the generic code by yourself
```
Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
```
```java
class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}
  
// Driver class to test above
class Main {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        Test<String> sObj
            = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
```

### 2.  Read those codes and type it one by one by yourself. the push the code to your branch.

### 4. Write the Singleton design pattern include eager load and lazy load.
```java
// Eager load
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

```java
// lazy load
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

### 5. What is Runtime Exception? could you give me some examples?

```
Runtime exceptions are not checked by the compiler. Generally Runtime Exceptions are exceptions that can be prevented programmatically. E.g NullPointerException, ArrayIndexOutOfBoundException. If you check for null before calling any method, NullPointerException would never occur. Similarly ArrayIndexOutOfBoundException would never occur if you check the index first. RuntimeException are not checked by the compiler, so it is clean code.
```

### 6. Could you give me one example of NullPointerException?

```
Accessing an index element (like in an array) of a null object.
```

### 7. What is the Optional class?
```
The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values. The class was introduced in the java. util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.
```

### 8. What is the @FunctionalInterface?
```
The @FunctionalInterface annotation is an informative annotation that indicates whether or not an interface type declaration is meant to be a functional interface. It will do the sanity check for the functional interface has one and only one abstract class. 
```

### 9. what is lamda?
```
A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
```

### 10. What is Method Reference?
```
The method references can only be used to replace a single method of the lambda expression. A code is more clear and short if one uses a lambda expression rather than using an anonymous class and one can use method reference rather than using a single function lambda expression to achieve the same.
```

### 11. What is Java 8 new features?
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

### 12. Lambda can use unchanged variable outside of lambda? what is the details?
```
Yes, it can. 
They can capture static variables, instance variables, and local variables, but only local variables must be final or effectively final. 
```