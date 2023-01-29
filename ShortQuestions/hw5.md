### What is generic in Java? Type the generic code by yourself
* In a nutshell, generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods

### Write the Singleton design pattern including eager load and lazy load.
* Eager Load
```
public class Singleton{
    private static Singleton instance=new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}
```

* Lazy Load
```
public class Singleton{
    private static volatile Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
```

### What is Runtime Exception? Give some examples.
* RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine
* Examples for RuntimeException are illegal cast operation, inappropriate use of a null pointer, referencing an out of bounds array element

### Give one example of NullPointerException
* Calling method on a *null* object

### What is the Optional class?
* **Optional** is used to represent a value that may or may not be present.  

### What is the @FunctionalInterface?
* Annotation for Funcional Interface
* An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, static methods but can contain only one abstract method. 

### What is Lambda?
* A lambda expression is a short block of code which takes in parameters and returns a value
### What is Method Reference?
* Method references are a special type of lambda expressions.
They're often used to create simple lambda expressions by referencing existing methods. 
### What is Java 8 new features?
* Reference, Lambda, Optional, Stream API
### Lambda can use unchanged variable outside of Lambda? What is the details
* Yes, Lambda can use unchanged variables outside of Lambda
* Final variable or non-Final varibale that has been assigned and never changed can be used.