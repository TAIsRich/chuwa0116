## Homework

Name: Zijun Zhou

##### 1. What is generic in Java?  and type the generic code by yourself.
Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types.

Code is included in the MavenProject Directory.

##### 2. Read those codes and type it one by one by yourself. then push the code to your branch.
Code is included in the MavenProject Directory.

##### 3. Skipped
##### 4. Write the Singleton design pattern include eager load and lazy load.
Eager load: 
```
class Singleton{
private Singleton(){}
private static Singleton singleton = new Singleton();
public static Singleton getInstance(){
    return singleton;
}   
}
```
Lazy Load:
```
class Singleton{
private Singleton(){}
private static Singleton singleton;
public static Singleton getInstance(){
    if(null == singleton){
    synchronized(Singleton.class){
    if(null == singleton)
    singleton = new Singleton();
    }
    }
    return singleton;
}    
}
```

##### 5. What is Runtime Exception? could you give me some examples?
Runtime Exception is an exception that is being thrown during the normal execution of java program, however, unlike the checked exceptions, it's never checked. 
Examples:
NullPointerException, ArrayIndexOutOfBoundsException and the InvalidArgumentException

##### 6. Could you give me one example of NullPointerException?
One example of NullPointerException:
```
public static void main(String[] args){
ListNode node=null;
System.out.println(node.val);
}
```
In the above example, the node is not initialized, instead it's a null variable. In addition, we can see there aren't any try-catch or throw code to catch this type of example. However, during the normal execution of this program, because we are trying to access the field of a null variable, a NullPointerException would be thrown in this case.

##### 7. What is the Optional class?
Optional class is actually a container that could be used to hold non-null values, and it could obviate the need of dealing with the NullPointerException.

##### 8. What is the @FunctionalInterface?
Actually, a functional interface is typicall an interface which only contains one abstract method, however, it could have multiple default methods

##### 9. What is lamda?
A lambda expression is a short block of code which takes in parameters and returns a value. It's typicall used to represent the anonymous class which implements the functional interface which has only one abstract method

##### 10. What is Method Reference?
Method references are a special type of lambda expressions. They're often used to create simple lambda expressions by referencing existing methods.
There are four kinds of method references:
- Static methods
- Instance methods of particular objects
- Instance methods of an arbitrary object of a particular type Constructor

##### 11. What is Java 8 new features?
- Introduced Optional Class
- Functional Interface and Lambda Expressions
- Default and static methods for interfaces
- Stream API
- forEach() method in Iterable interface

##### 12. Lambda can use unchanged variable outside of lambda? what is the details?
Yes, Lambda could use unchanged variable outside of lambda, for any variable that the Lambda is going to use, it should be declared as final, and for final integers, Lambda could not change its value inside Lambda, however, for final objects, Lambda could change the fields of this final objects.