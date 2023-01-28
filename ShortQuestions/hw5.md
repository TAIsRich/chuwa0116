# hw5

## 1. What is generic in Java? and type the generic code by yourself.

Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types.

### 4 Write the Singleton design pattern include eager load and lazy load.

```Java
// Eager load

public class EagerLoad{
    private static EagerLoad instance = new EagerLoad();

    private EagerLoad(){}

    public EagerLoad getInstance(){
        return indstance;
    }
}

// Lazy load

public class LazyLoad{
    private static volatile LazyLoad instance;

    private LazyLoad(){}

    public static LazyLoad getInstance(){
        if(instance == null){
            Synchronized(LazyLoad.class){
                if(instance == null){
                    instance = new LazyLoad();
                }
            }
        }
        return instance;
    }
}
```

## 5. What is Runtime Exception? could you give me some examples?

RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine. Example: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException.

## 6. Could you give me one example of NullPointerException?

```Java
Map<Integer, Integer> map = new HashMap<>();
int num = map.get(3);
```

## 7. What is the Optional class?

Optional is generally used as a return type for methods that might not always have a result to return to avoid null check and NullPointerException.

## 8. What is the @FunctionalInterface?

A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. 

## 9. what is lamda?

A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

## 10. What is Method Reference?

A method reference is the shorthand syntax for a lambda expression that contains just one method call. 

## 11. What is Java 8 new features ?

Lambda, Functional Interface, Optional, Method Reference, Stream API, default and static method in interface

## 12 Lambda can use unchanged variable outside of lambda? what is the details?

Yes, but the variable should be final or effectively final.
