# HW5

### 1 What is generic in Java?  and type the generic code by yourself.

Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

### 2 Read those codes and type it one by one by yourself. the push the code to your branch.

See in Coding folder.

### 4 Write the Singleton design pattern include eager load and lazy load.

```java
public class EagerLoad {
  private static EagerLoad instance = new EagerLoad();

  private EagerLoad() {}

  public static EagerLoad getInstance() {
    return instance;
  }
}
```

```java
public class LazyLoad {
  private static volatile LazyLoad instance;

  private LazyLoad() {}

  public static LazyLoad getInstance() {
    if (instance == null) {
      synchronized (LazyLoad.class) {
        if (instance == null) {
          instance = new LazyLoad();
        }
      }
    }
    return instance;
  }
}
```

### 5 What is Runtime Exception? could you give me some examples?

Unchecked exception - runtime exception, e.g. `NullPointerException`.

### 6 Could you give me one example of NullPointerException?

```java
String s = null;

s.equals("Null");
```

### 7 What is the Optional class?

Optional is a container object which may or may not contain a non-null value. 

To avoid Null checks and run time NullPointerExceptions.

### 8 What is the @FunctionalInterface?

`@FunctionalInterface` clearly communicates the purpose of the interface, and also allows a compiler to generate an error if the annotated interface does not satisfy the conditions.

Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may be treated as lambda expressions.

### 9 What is lamda?

A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

### 10 What is Method Reference?

Method references are a special type of lambda expressions. They're often used to create simple lambda expressions by referencing existing methods.

There are four kinds of method references:

- Static methods
- Instance methods of particular objects
- Instance methods of an arbitrary object of a particular type
- Constructor

### 11 What is Java 8 new features?

+ Default method and static method in interface
+ Lambda and Functional interface
+ Optional
+ Method reference
+ Stream API

### 12 Lambda can use unchanged variable outside of lambda? what is the details?

Yes.

Lambda expressions can use variables defined in an outer scope. We refer to these lambdas as *capturing lambdas*. They can capture static variables, instance variables, and local variables, but only local variables must be final or effectively final.