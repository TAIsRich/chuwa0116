### 1. What is Generics in Java?
Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types

### 2. Read those codes and type it one by one by yourself. the push the code to your branch

### 3. practice stream API at least 3 times

### 4. Write the Singleton design pattern include eager load and lazy load
Eager Load:
```
public class Singleton_eagerLoad{
    private static volatile Singleton_eagerLoad instance;
    private Singleton_eagerLoad(){

    }
    public static Singleton_eagerLoad getInstance(){
        if(instance==null){
            synchronized (Singleton_eagerLoad.class){
                if(instance==null){
                    instance=new Singleton_eagerLoad();
                }
            }
        }
        return instance;
    }
}

```
Lazy Load:
```

public class Singleton_lazyLoad{
    private static Singleton_lazyLoad instance=new Singleton_lazyLoad();
    private Singleton_lazyLoad(){

    }
    public static Singleton_lazyLoad getInstance(){
        return instance;
    }
}
```

### 5. What is Runtime Exception? could you give me some examples?
RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.
Example:
Examples for RuntimeException are illegal cast operation, inappropriate use of a null pointer, referencing an out of bounds array element.

### 6. Could you give me one example of NullPointerException
```
public class Tester {
   public static void main(String[] args) {
      Object ref = null;
      ref.toString(); // this will throw a NullPointerException
   }
}
```

#### 7. What is the Optional class
The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values. 

### 8. What is the @FunctionalInterface
An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface as defined by the Java Language Specification. Conceptually, a functional interface has exactly one abstract method.
The Annotation is used to do sanity check.

### 9. what is lamda
One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains only one method, then the syntax of anonymous classes may seem unwieldy and unclear. In these cases, you're usually trying to pass functionality as an argument to another method, such as what action should be taken when someone clicks a button. Lambda expressions enable you to do this, to treat functionality as method argument, or code as data.

### 10. What is Method Reference
Method references are a special type of lambda expressions.

### 11. What is Java 8 new features
+ forEach() method in Iterable interface
+ default and static methods in Interfaces
+ Functional Interfaces and Lambda Expressions
+ Java Stream API for Bulk Data Operations on Collections
+ Java Time API
+ Collection API improvements
+ Concurrency API improvements
+ Java IO improvements

### 12.Lambda can use unchanged variable outside of lambda? what is the details
Lambda can use final variables declared outside of lambda. Lambda can 
also use effective final variables. Lambda cannot use variables  declared outside of lambda if the variable change before or after lambda.

