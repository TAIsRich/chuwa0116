## What is generic in Java?  and type the generic code by yourself.

Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types)to be a parameter to methods, 
classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, 
or method that operates on a parameterized type is a generic entity

`Generic Class`
```java
public class GenericClass<T>{
    // T -> Integer, User, Product
    T obj;
    
    public GenericClass(T obj){
        this.obj = obj;
    }
    
    public T getObj(){
        return this.obj;
    }
}
```
`Generic Method`
```java
public class GenericMethod {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
                MaximumGenericTest.maximum(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
                MaximumGenericTest.maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
                MaximumGenericTest.maximum("pear", "apple", "orange"));
    }
}

class MaximumGenericTest {
    /**
     * determines the largest of three Comparable objects
     */
    public static < T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
```
## Write the Singleton design pattern include eager load and lazy load.
`Eager Load Singleton`
```java
public class Singleton{
    private Singleton();
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
```
`Lazy Load Singleton`
```java
public class Singleton{
    private static volatile Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

## What is Runtime Exception? could you give me some examples?

The Runtime Exception is the parent class in all exceptions of the Java programming language 
that are expected to crash or break down the program or application when they occur. 
Unlike exceptions that are not considered as Runtime Exceptions, Runtime Exceptions are never checked.

The most common Runtime Exceptions are **NullPointerException**, **ArrayIndexOutOfBoundsException** and the **InvalidArgumentException**.

## Could you give me one example of NullPointerException?
Without these if-else statements, it might throws a NullPointerException
```java
public class Clinet{
    public int getMobileScreenWidth (mobile7 mobile7){
        if (mobile7 != null){
            DisplayFeatures7 df = mobile7.getDisplayFeatures();
            if (df != null){
                ScreenResolution sr = df.getResolution();
                if (sr != null){
                    return sr.getWidth();
                }
            }
        }
        return 0;
    }
}
```
## What is the Optional class?

It is a class that helps to avoid Null checks and run time NullPointerExceptions

## What is the @FunctionalInterface?

Functional Interface
- Has one **single Abstract method**
- @FunctionalInterface - for **sanity check**
- Can have a lot of default methods
- **Lambda is the implementation of the abstract method**

## what is lamda?

Lambda Expressions were added in Java 8.

A lambda expression is a short block of code which takes in parameters and returns a value. 
Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

## What is Method Reference?

Method reference is a new feature of Java 8, a short and easily readable writing syntax for a lambda expression. 
To refer to a functional interface method, use a method reference. 
You can replace a method reference for your lambda expression whenever you are just referring to a method with a lambda expression.

## What is Java 8 new features?

1. Default method and static method in interface
2. Lambda & Functional Interface
3. Optional
4. Method Reference
5. Stream API

## Lambda can use unchanged variable outside of lambda? what is the details?
Yes, as soon as the reference of this variable stays the same.

- Final variable
- None-final variable however never changed
- Object Variable (if we use new to reassign a new memory, then this variable is
  changed, can not be used in lambda)
