## What is generic in Java?  and type the generic code by yourself.
- Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

## Write the Singleton design pattern include eager load and lazy load.
```
public class EagerSingleton {
    private EagerSingleton(){}

    private  static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance(){
        return  instance;
    }
}
```

```
public class LazySingleton {
    private LazySingleton(){}

    private static volatile LazySingleton instance = new LazySingleton();

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null) instance = new LazySingleton();
            }
        }
        return  instance;
    }
}
```

## What is Runtime Exception? could you give me some examples?
The Runtime Exception is the parent class in all exceptions of the Java programming language that are expected to crash or break down the program or application when they occur. Unlike exceptions that are not considered as Runtime Exceptions, Runtime Exceptions are never checked.
- ArithmeticException.
- NullPointerException.
- ClassCastException.
- DateTimeException.
- ArrayIndexOutOfBoundsException.
- NegativeArraySizeException.
- ArrayStoreException.
- UnsupportedOperationException.

## Could you give me one example of NullPointerException?
Check whether two strings are equal or not while one string is null.

## What is the Optional class?
Optional is a container object used to contain not-null objects. Optional object is used to represent null with absent value. This class has various utility methods to facilitate code to handle values as ‘available’ or ‘not available’ instead of checking null values. It is introduced in Java 8. 

## What is the @FunctionalInterface?
A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. Runnable, ActionListener, Comparable are some of the examples of functional interfaces.

## What is lamda?
A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

## What is Method Reference?
Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.

## What is Java 8 new features?
1.  Default and static method
2.  Lambda and functional interface
3.  Optional
4.  Stream api
5.  Method reference
6.  for each method

## Lambda can use unchanged variable outside of lambda? what is the details?
- Yes
  - Final variable
  - Non-final variable however never changed
  - Object variable (if we use new to reassign a new memory, then this variable is changed, can not be used in lambda)