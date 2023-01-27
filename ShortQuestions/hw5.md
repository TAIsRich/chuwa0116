## 1.  What is generic in Java?  and type the generic code by yours
- Generics means **parameterized types**. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types.




## 2. Read those codes and type it one by one by yourself. the push the code to your branch
See Coding/java8_features

## 3. Write the Singleton design pattern include eager load and lazy load. 

```java
public class EagerLoad {
    private static EagerLoad instance = new EagerLoad();

    private EagerLoad(){};

    public static EagerLoad getInstance(){
        return instance;
    }
}

```

```java
public class LazyLoad {

    private static volatile LazyLoad instance;

    private LazyLoad(){};

    public static LazyLoad getInstance(){
        if (instance == null){

            synchronized(LazyLoad.class){

                if (instance == null){
                    instance = new LazyLoad();
                }
            }
        }
        return instance;
    }
}

```

## 4. What is Runtime Exception? could you give me some examples?
> The Runtime Exception is the parent class in all exceptions of the Java programming language that are expected to crash or break down the program or application when they occur.
- NullPointerException
- ArrayIndexOutOfBoundsException
- ArithmeticException
- NegativeArraySizeException
- ...

## 5. Could you give me one example of NullPointerException?
> For example, if a linked list node A is actually null, the NullPointerException will be thrown when we want to get A's value by returning   A.value .

## 6. What is the Optional class?
> The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values. The class was introduced in the java. util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.


## 7. What is the @FunctionalInterface?
> A functional interface is an interface that contains only a single abstract method (a method that doesn't have a body).


## 8. What is lamda?
> A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

```
(parameter1, parameter2) -> { code block }
```

## 9. What is Method Reference?
> Method references are a special type of lambda expressions. They're often used to create simple lambda expressions by referencing existing methods.  

There are four kinds of method references:
- Static methods  

- Instance methods of particular objects
- Instance methods of an arbitary object of a particular type
- Constructor

## 10. What is Java 8 new features?
- Permanent Generation

- Parallel Array Sorting
- Base64 encoding and decoding
- Date & Time API
- Functional Interfaces
- Lambda expressions


## 11. Lambda can use unchanged variable outside of lambda? what is the details?
- Lambda can truly use unchanged variable outside of lambda

- Inside lambda expression, we can't assign any value to some local variable declared outside the lambda expression. Because the local variables declared outside the lambda expression can be **final** or **effectively final**.
