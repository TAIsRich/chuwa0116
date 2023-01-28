## 1.  What is generic in Java?  and type the generic code by yourself.
a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core
/src/main/java/com/chuwa/tutorial/t01_basic/generic


## 2.  Read those codes and type it one by one by yourself. the push the code to your branch.
https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/mai
n/java/com/chuwa/tutorial/t06_java8
## 3.  practice stream API at least 3 times
a. https://blog.devgenius.io/15-practical-exercises-help-you-master-java-
stream-api-3f9c86b1cf82

## 4.  Write the Singleton design pattern include eager load and lazy load.  
### Eager Load
```java:
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
``` 

### Lazy Load
```java:
public class Singleton {
    private static final Singleton instance = new Singleton();

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
## 5.  What is Runtime Exception? could you give me some examples?

    A runtime exception is an exception that occurs during the execution of a program, rather than during compilation. Examples include NullPointerException, ArrayIndexOutOfBoundsException, and IllegalArgumentException.
## 6.  Could you give me one example of NullPointerException?
    String str = null;
    System.out.println(str.length()); 

## 7. What is the Optional class?
    The Optional class is a container for non-null objects, it allows for the representation of "absent" values, it helps to avoid NullPointerExceptions in the code by providing better ways to handle null values.
## 8.  What is the @FunctionalInterface?
    It provides sanity checks that ensures it has only one abstract method.
    
## 9.  what is lamda?
    A lambda is a small, anonymous function that can be passed around and used like an object. It's a way to create unnamed methods.

## 10. What is Method Reference?

    Method reference is the shorthand syntax for a lambda expression that just invokes an existing method.

    ```java:
    // Method reference
    stringList.forEach(System.out::println);

    // Equivalent lambda expression
    stringList.forEach(s -> System.out.println(s));
    ```
## 11. What is Java 8 new features?
    Lambda expressions
    Method references
    Functional interfaces
    Stream API
    Date and Time API
    Optional class
## 12. Lambda can use unchanged variable outside of lambda? what is the details?
    In Java 8, lambda expressions can only access variables that are defined as final or effectively final. This means that the value of the variable cannot be changed after it is defined. However, if the variable is not changed after it is defined and is captured by the lambda, it can still be used inside the lambda expression.