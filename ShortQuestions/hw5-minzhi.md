1. What is generic in Java?

Generics means parameterized types. Java has generic methods, generic classes.

- problem 2-3 are in `Coding` folder.

4. Write the Singleton design pattern include eager load and lazy load.

```java
public class EagerInitialization {
private static final EagerInitialization instance = new EagerInitialization();
private EagerInitialization(){}

public EagerInitialization getInstance(){
    return instance;
}
```

```java
public class LazyInitialization {
    private static LazyInitialization instance;
    private LazyInitialization(){}

    public LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
}
```

5. What is Runtime Exception? could you give me some examples?

The Runtime Exception is the parent class in all exceptions of the Java programming language that are expected to crash or break down the program or application when they occur.

Example: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException.

6. Could you give me one example of NullPointerException?

When reference a null object.

```java
public class Student{
    public Student getStudent(){
        return null;
    }
}

public class Example{
    public static void Main(){
        Student s = new Student();
        Student student = s.getStudent("111");
        System.out.printf(student.getName());
    }
}
```

7. What is the Optional class?

Optional is a container object used to contain not-null objects. Optional object is used to represent null with absent value.

8. What is the @FunctionalInterface?

An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface. It helps compiler to do sanity check.

9. What is lambda?

A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

10. What is Method Reference?

Method references are a special type of lambda expressions.

11. What is Java 8 new features?

- stream API
- lambda function
- functional interface
- default and static method of interface
- optional
- method reference

12. Lambda can use unchanged variable outside of lambda? what is the details?

Inside lambda expression, we can't assign any value to some local variable declared outside the lambda expression. Because the local variables declared outside the lambda expression can be final or effectively final.
