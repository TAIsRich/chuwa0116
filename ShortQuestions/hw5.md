# HW5 - Hao Jia

### 1. What is generic in Java?
In Java, generics are a feature that allows for the use of types (such as classes and interfaces) as parameters when defining classes, interfaces, and methods. This allows for the creation of more flexible and reusable code. For example, a class can be defined as a container for a specific type of object, such as a List of Strings, and this class can be used to hold any type of object, such as a List of Integers. This is done by specifying a type parameter, such as T, which is replaced by a specific type when an instance of the class is created.
### 2.

### 3. 

### 4. Write the Singleton design pattern include eager load and lazy load.
Eager Load:
```java
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {
    }
    public static Singleton getInstance() {
        return instance;
    }
}

```

Lazy Load:
```java
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

### 5. What is Runtime Exception? could you give me some examples?
A runtime exception is an exception that is thrown during the execution of a program, rather than during the compilation process. These exceptions are typically caused by programming errors, such as attempting to access an array element with an index that is out of bounds, dividing a number by zero, or trying to access a null object.

Some examples of runtime exceptions in Java include:

+ ArrayIndexOutOfBoundsException: thrown when attempting to access an array element with an index that is out of bounds
+ NullPointerException: thrown when attempting to access a method or property of a null object
+ ArithmeticException: thrown when performing an illegal arithmetic operation, such as dividing by zero
+ NumberFormatException: thrown when attempting to convert a string to a number and the string does not contain a valid number
+ ClassCastException: thrown when trying to cast an object to a subclass of which it is

### 6. Could you give me one example of NullPointerException?
```java
String str = null;
int length = str.length();
```
In this example, the variable str is assigned a value of null, and then the length() method is called on it. Since the str variable is null, it does not have any methods and this will throw a NullPointerException.

### 7. What is the Optional class?
In Java, the Optional class is a container object which may or may not contain a non-null value. It is introduced in Java 8 as a way to represent the absence of a value in a safe and readable way.

The Optional class provides a way to handle null values in a more elegant and less error-prone way than using null checks. Instead of returning null when a value is not present, the Optional class returns an instance of the Optional class that contains no value. This allows you to chain method calls without having to check for null values at each step.

You can create an Optional instance by using the of() or ofNullable() factory methods, or by using the empty() method to create an Optional instance that represents the absence of a value.

For example, you can use the ofNullable() method to create an Optional instance that may or may not contain a value:
```java
Optional<String> optionalString = Optional.ofNullable(str);
```
The Optional class also provides several methods for working with optional values, such as isPresent(), get(), and orElse(). The isPresent() method returns true if the optional contains a value, get() method returns the value if the optional contains a value, otherwise, it throws NoSuchElementException, and the orElse() method returns the value if the optional contains a value, otherwise, it returns the specified default value.

Using the Optional class can help to make your code more readable and less prone to null pointer exceptions.

Keep in mind that using Optional class is not always the best option, and it's important to understand when it's appropriate to use it and when it's not.

### 8. What is the @FunctionalInterface?
In Java, the @FunctionalInterface annotation is used to indicate that an interface is a functional interface. A functional interface is an interface that has exactly one abstract method.

Functional interfaces are used as the basis for functional programming in Java, and they allow you to use lambda expressions to create instances of the interface. Lambda expressions are a shorthand for providing the implementation of the functional interface's single abstract method.

The @FunctionalInterface annotation is optional, but it is considered good practice to use it because it makes your code more readable and helps to prevent accidental changes to the interface that would break existing code.

### 9.Wwhat is lamda?
In Java, a lambda expression is a shorthand way of defining an anonymous function. It is a concise way of defining a function that can be passed as an argument to a method or stored as a variable.

### 10. What is Method Reference?
In Java, a method reference is a shorthand way of defining a lambda expression that calls an existing method. It is a way to refer to a method by its name instead of providing a lambda expression that calls the method.

### 11. What is Java 8 new features?
+ Default method and static method in interface
+ Lambda & functional interface
+ Optional
+ Stream API
+ Method reference

### 12. Lambda can use unchanged variable outside of lambda? what is the details?
In Java, a lambda expression can access variables that are defined in the scope in which the lambda expression is defined. These variables are known as "captured variables."

A lambda expression can access final variables, effectively final variables, and variables declared in the same scope as the lambda expression.

A final variable is a variable that is declared with the final keyword and it can't be reassigned after it's been initialized.

An effectively final variable is a variable that is not explicitly declared as final, but it's not reassigned after it's been initialized.

Here's an example of using a final variable in a lambda expression:
```java
final int x = 10;
MyFunctionalInterface myFunctionalInterface = () -> System.out.println(x);
```