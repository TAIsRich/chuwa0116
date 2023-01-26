## Write the Singleton design pattern include eager load and lazy load. 

Eager load:

```java
public class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
```

Lazy load:

```java
public class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }
}
```

## What is Runtime Exception? could you give me some examples?

A runtime exception is an exception that occurs during the execution of a program, as opposed to a compile-time exception, which occurs when a program is being compiled.

Examples: 

NullPointerException: This occurs when a program attempts to use a null object reference.

ArrayIndexOutOfBoundsException: This occurs when a program attempts to access an array index that is out of bounds.

## Could you give me one example of NullPointerException?

```java
class Example {
    public static void main(String[] args) {
        String str = null;
        int length = str.length();
        System.out.println(length);
    }
}
```

## What is the Optional class?

The Optional class is a container object which is used to contain not-null objects. It was introduced in Java 8 as a way to improve the handling of null values and to prevent NullPointerExceptions.

## What is the @FunctionalInterface?

`@FunctionalInterface` is a functional interface annotation in Java. It is used to indicate that an interface is intended to be a functional interface, which means that it should have exactly one abstract method (SAM - Single Abstract Method) that can be implemented. This makes it suitable for use as a lambda expression or method reference.

## what is lamda?

Lambda expressions are a new feature introduced in Java 8 as a part of the Java language's support for functional programming. They allow you to treat functionality as a method argument, or code as data. A lambda expression is a function without a name, it is a way to create an instance of a functional interface. Lambda expressions are also known as closures or anonymous functions.

## What is Method Reference?

Method references in Java are a way to refer to a method without invoking it. They are used in conjunction with lambda expressions to create more concise and readable code.

## What is Java 8 new features?

Lambda Expressions, Stream API.

## Lambda can use unchanged variable outside of lambda? what is the details?

Yes, lambda expressions can access variables that are defined outside of the lambda expression, but with some restrictions. Variables that are accessed from within a lambda expression are known as "captured variables".

