# HW5
### 1. What is generic in Java?  and type the generic code by yourself.
```
Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types.
```

### 2. Read those codes and type it one by one by yourself. the push the code to your branch.
Please check Coding/java8_feature folder

### 3. practice stream API at least 3 times

### 4. Write the Singleton design pattern include eager load and lazy load. 
Please check MavenProject/design_patterns folder

### 5. What is Runtime Exception? could you give me some examples?
```
UncheckedException: the exception will be check during processing. 
Example: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, NegativeArraySizeException
```

### 6. Could you give me one example of NullPointerException?
```java
public class Tester {
   public static void main(String[] args) {
      Object ref = null;
      ref.toString(); // this will throw a NullPointerException
   }
}
```

### 7. What is the Optional class?
```
The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values. The class was introduced in the java. util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.
```

### 8. What is the @FunctionalInterface?
```
@FunctionalInterface is an annotation to ensure our interface is functional only. The function takes two generic types. The first one T is the type it takes a parameter and R is the return type of the abstract method. apply() is the abstract method of the Function.
```

### 9. what is lamda?
```
A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
```

### 10. What is Method Reference?
```
Method references are a special type of lambda expressions.
They're often used to create simple lambda expressions by referencing existing methods.
```

### 11. What is Java 8 new features?
```
Default method and static method in interface
Lambda & Functional Interface
Method reference
Stream API
Optional
```

### 12. Lambda can use unchanged variable outside of lambda? what is the details?
```
Yes, Lambda can use unchanged variable outside of lambda

Inside lambda expression, we can't assign any value to some local variable declared outside the lambda expression. Because the local variables declared outside the lambda expression can be final or effectively final.
```


