## hw5

### 1. What is generic in Java? and type the generic code by yourself.
Java Generics provides a way to reuse the same code with different inputs.
```
public class Box<T> {
   
  private T t;
 
  public void add(T t) {
    this.t = t;
  }
 
  public T get() {
    return t;
  }
 
  public static void main(String[] args) {
    Box<Integer> integerBox = new Box<Integer>();
    Box<String> stringBox = new Box<String>();
 
    integerBox.add(new Integer(10));
    stringBox.add(new String("test"));
 
    System.out.printf("整型值为 :%d\n\n", integerBox.get());
    System.out.printf("字符串为 :%s\n", stringBox.get());
  }
}
```


### 4. Write the Singleton design pattern include eager load and lazy load.

```
public class eagerLoadSingleton {

    private static eagerLoadSingleton instance = new eagerLoadSingleton();

    private eagerLoadSingleton() {}
    
    public static eagerLoadSingleton getInstance() {
        return instance;
    }
}
```

```
public class LazyLoadSingleton {

    private static volatile LazyLoadSingleton instance = new LazyLoadSingleton();

    private LazyLoadSingleton(){}
    
    
    public static LazyLoadSingleton getInstance(){
        if(instance == null){
            synchronized (LazyLoadSingleton.class){
                if(instance == null) instance = new LazyLoadSingleton();
            }
        }
        return  instance;
    }
}
```

### 5. What is Runtime Exception? could you give me some examples?
The Runtime Exception is the parent class in all exceptions of the Java programming language that are expected to crash or break down the program or application when they occur. Unlike exceptions that are not considered as Runtime Exceptions, Runtime Exceptions are never checked.

The Runtime Exception usually shows the programmer's error, rather than the condition a program is expected to deal with. Runtime Exceptions are also used when a condition that can't happen. It should be noted that when a program is running out of memory, a program error is thrown instead of showing it as a Runtime Exception.

The most common Runtime Exceptions are NullPointerException, ArrayIndexOutOfBoundsException and the InvalidArgumentException. The Java Virtual Machine throws the first two Runtime Exceptions.

### 6. Could you give me one example of NullPointerException?
```
public class Main {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.toLowerCase());
    }
}
```
### 7. What is the Optional class?
The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values. The class was introduced in the java.util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.
### 8. What is the @FunctionalInterface?
* Has one single Abstract method
* @FunctionalInterface - for sanity check
* Can have a lot of default methods
* Lambda is the implementation of the abstract method

### 9. what is lamda?
A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
### 10. What is Method Reference?
A method reference is used to directly access an existing method or constructor of a class or instance. Method references provide a way of referencing without executing a method, which requires a target type context composed of compatible functional interfaces. When calculating, the square
A method reference creates an instance of the functional interface. Function references just simplify Lambda
A means of expression.
### 11. What is Java 8 new features?
* Default method and static method in interface
* Lambda & Functional Interface
* Optional
* Method Reference
* Stream API

### 12. Lambda can use unchanged variable outside of lambda? what is the details?
As long as the memory address of the variable remains unchanged, the variable can be used by lambda.
* Final variable
* Non-final variable however never changed
* Object variable (if we use new to reassign a new memory, then this variable is
changed, can not be used in lambda)