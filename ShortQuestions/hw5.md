### 1. What is generic in Java?  and type the generic code by yourself.
https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic/generic
Generics are a feature that allows for the creation of classes, interfaces, and methods that can work with a variety of different types, rather than being specific to one particular type. This allows for increased code reuse and type safety.
```java
class MyClass<T> {
    T value;
}
```
### 2.  Read those codes and type it one by one  yourself. the push the code to your branch.
https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8
In Coding/java8

### 3.  practice stream API at least 3 times
https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82

### 4.  Write the Singleton design pattern include eager load and lazy load.
eager load
```java
class Singleton{
    private static final Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance() {
        return instance;
    }
}
```
lazy load
```java
class Singleton{
    //to prevent instruction reorder
    private static volatile Singleton instance;

    private Singleton(){

    }
    public static  Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){  //double check locking
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```
### 5.  What is Runtime Exception? could you give me some examples?
Rumtime Exception equals to unchecked exception,unchecked exception are not checked during the compile time by the compiler
`example ArrayIndexOutOfBounds`
### 6.  Could you give me one example of NullPointerException?
```
String str = null;
String str1 = "hello";
str.equals(str1); //NullPointerException ,cuz str is null
```
### 7. What is the Optional class?
Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present.

### 8.  What is the @FunctionalInterface?
@FunctionalInterface annotation is used to indicate that an interface is intended to be a functional interface and can be used by the Java compiler to enforce this constraint.
<p>The constraint contains only one abstract method

### 9.  what is lamda?
A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

### 10. What is Method Reference?
Method references in Java are a shorthand way of creating a lambda expression that calls an existing method.
1. Reference to a static method: ClassName::staticMethodName
2. Reference to an instance method of a particular object: objectReference::instanceMethodName
3. Reference to an instance method of an arbitrary object of a particular type: ClassName::instanceMethodName
4. Reference to a constructor: ClassName::new
### 11. What is Java 8 new features?
1. Lambda expressions
2. Stream API
3. Functional interfaces
4. Optional
5. Method reference
6. Date and Time API
7. Default and static methods in interfaces

### 12. Lambda can use unchanged variable outside of lambda? what is the details?
 Lambda expression can access and use variables that are defined outside of the lambda expression, as long as those variables are effectively final. This means that the variable's value cannot be changed after it is first initialized, even within the lambda expression.
```
int x = 10;
Runnable runnable = () -> System.out.println(x);
```