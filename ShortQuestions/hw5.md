### What is generic in Java?

In Java, generics are a feature that allows for the creation of classes and methods that take types as parameters. This allows for the creation of more flexible and reusable code. Generics were introduced in Java 5 and are often used in conjunction with collections classes, such as the ArrayList class, to specify the type of objects that the collection can hold. For example, an ArrayList of Strings would be declared as `ArrayList<String>`, and an ArrayList of integers would be declared as `ArrayList<Integer>`.

### Write the Singleton design pattern include eager load and lazy load.

Eager load:

```java
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();
    
    private EagerSingleton() {}
    
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
```



Lazy load:

```java
public class LazySingleton {
    private static volatile LazySingleton INSTANCE;
    
    private LazySingleton() {}
    
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
```

### What is Runtime Exception? Could you give me some examples?

A runtime exception is a type of exception that occurs at runtime, typically as a result of a programming error. These types of exceptions are generally considered to be unexpected and are not required to be caught or declared. Some common examples of runtime exceptions include:

- `NullPointerException`: This exception is thrown when an application attempts to use a null object reference.
- `IndexOutOfBoundsException`: This exception is thrown when an application attempts to access an index that is out of range of an array or a list.
- `ArithmeticException`: This exception is thrown when an application attempts to divide by zero.
- `ClassCastException`: This exception is thrown when an application attempts to cast an object to a type to which it is not compatible.
- `IllegalStateException`: This exception is thrown when an application attempts to call a method on an object whose state does not allow the method to be called.

It's important to note that these types of exceptions are not considered to be a normal part of the program's control flow, they are caused by programming errors, such as using an uninitialized variable, passing an invalid argument to a method, or dividing by zero.

These types of exceptions are not required to be caught or declared, but it's a good practice to catch them and handle them gracefully when it makes sense for the specific use case.

### Could you give me one example of NullPointerException?

```java
public class Example {
    public static void main(String[] args) {
        String str = null;
        int len = str.length(); // throws NullPointerException
    }
}
```

### What is Optional class?

In Java, the Optional class is a container object that is used to represent the presence or absence of a value. It is a generic class that has a single type parameter, which specifies the type of the value that it contains. An Optional object can be empty, in which case it does not contain a value, or it can contain a non-null value.

The Optional class was introduced in Java 8 to provide a better way to handle null values, which can cause NullPointerExceptions when not handled properly. The Optional class allows you to avoid null checks by using its methods to determine whether a value is present and to access the value if it is. This can help to make your code more concise and readable.

### What is @FunctionalInterface?

`@FunctionalInterface` is an annotation introduced in Java 8 which indicates that an interface is a functional interface. A functional interface is an interface that has exactly one abstract method. It can have any number of default and static methods but only one abstract method.

Functional interfaces are used as the basis for functional programming in Java 8 and later, such as with lambda expressions, method references, and the Stream API.

The `@FunctionalInterface` annotation is optional, but it is useful to use it because it makes your code more readable and it allows the compiler to give you an error if you accidentally add more than one abstract method to the interface.

In summary, `@FunctionalInterface` is a marker annotation that indicates that an interface is a functional interface, which means it has exactly one abstract method. It is used as the basis for functional programming in Java 8 and later.

### What is lamda?

Lambda expressions are a new feature introduced in Java 8 as part of the functional programming support in the language. They are a concise way of defining a single method interface (also called functional interface) using an expression, rather than an explicit class.

A lambda expression is a short block of code that can be passed around as a method argument or assigned to a variable. They are often used to implement functional interfaces, which are interfaces that have only one abstract method.

### What is Method Reference?

Method references are a feature introduced in Java 8 that allow you to reference a method without invoking it. They are a concise way of specifying a method to be called, and can be used as an alternative to lambda expressions when the method being called is already defined.

There are four types of method references:

- Reference to a static method
- Reference to an instance method of a particular object
- Reference to an instance method of an arbitrary object of a particular type
- Reference to a constructor

### Can Lambda use unchanged variable outside of lambda? What are the details?

Yes, lambda expressions can access variables that are defined outside of the lambda expression, but with some restrictions. The variables that are accessed by a lambda expression are known as its "captured variables."

Here are the details:

- A lambda expression can access variables that are defined in the same scope as the lambda expression.
- A lambda expression can also access final or effectively final variables that are defined in the enclosing scope.
- A variable that is accessed by a lambda expression is known as a captured variable.
- If a captured variable is modified inside a lambda expression, the modification will not be reflected in the original variable. This is because captured variables are passed by value, not by reference.
- If a lambda expression modifies a captured variable, the modification is visible within the lambda expression but not outside of it.