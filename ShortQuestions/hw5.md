1. What is generic in Java?  and type the generic code by yourself.
    a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core
    /src/main/java/com/chuwa/tutorial/t01_basic/generic
```
in coding file
```
2. Read those codes and type it one by one by yourself. the push the code to your
    branch.
    https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/mai
    n/java/com/chuwa/tutorial/t06_java8
```
in coding file
```
3. practice stream API at least 3 times
    a. https://blog.devgenius.io/15-practical-exercises-help-you-master-java-
    stream-api-3f9c86b1cf82


4. Write the Singleton design pattern include eager load and lazy load.
```
in coding file
```
5. What is Runtime Exception? could you give me some examples?  
```java
//RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine. 
public class test{
    public static void main(String[] args) {
        String[] array = {"a", "b"};
        Object[] o = array;
        System.out.println(o.getClass());
        o[0] = new Object();
    }
}
//Exception in thread "main" java.lang.ArrayStoreException
```
6. Could you give me one example of NullPointerException?
```java
public class test{
    public String getName(Cat c) {
        return c.name;
    }
}
//there will be NullPointerException if c == null
```
7. What is the Optional class?  
   The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values. The class was introduced in the java. util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.
8. What is the @FunctionalInterface?  
   An Interface that contains exactly one abstract method
9. what is lambda?  
   Lambda is a compute service that lets you build applications without provisioning or managing servers.
10. What is Method Reference?  
    Method references are a special type of lambda expressions.
    They're often used to create simple lambda expressions by referencing existing methods. There are four kinds of method references: Static methods. Instance methods of particular objects. Instance methods of an arbitrary object of a particular type.
11. What is Java 8 new features? 
* Functional Interfaces And Lambda Expressions 
* forEach() Method In Iterable Interface 
* Optional Class 
* Default And Static Methods In Interfaces 
* Java Stream API For Bulk Data Operations On Collections 
* Java Date Time API 
* Collection API Improvements 
* Java IO Improvements 
* Miscellaneous Core API Improvements 
* Base64 Encode Decode
12. Lambda can use unchanged variable outside of lambda? what is the details?  
No, 
