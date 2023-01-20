# Homework 2

### 1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)

```
```

### 2. What is wrapper class in Java and Why we need wrapper class?

```
This class helps in conversion from primitive to object as well as from object to primitive data type. Creating a wrapper class automatically creates a new field where the primitive data types are stored. The object of the wrapper class then holds the primitive data type.
```

### 3. What is the difference between HashMap and HashTable?

```
HashMap is non-syncronized and is not thread safe while HashTable is thread safe and is synchronized. HashMap allows one null key and values can be null whereas HashTable doesn't allow null key or value. HashMap is faster than HashTable. HashMap iterator is fail-safe where HashTable iterator is not fail-safe.
```


### 4. What is String pool in Java and why we need String pool?

```
String Pool in Java is a special storage space in Java Heap memory where string literals are stored. It is also known by the names - String Constant Pool or String Intern Pool. Whenever a string literal is created, the JVM first checks the String Constant Pool before creating a new String object corresponding to it.
```


### 5. What is Java garbage collection?

```
Garbage collection in Java is the automated process of deleting code that's no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers. Java applications are compiled into bytecode that may be executed by a JVM.
```


### 6. What are access modifiers and their scopes in Java?

```
Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.
Private: We can access the private modifier only within the same class and not from outside the class.
Default: We can access the default modifier only within the same package and not from outside the package. And also, if we do not specify any access modifier it will automatically consider it as default.
Protected: We can access the protected modifier within the same package and also from outside the package with the help of the child class. If we do not make the child class, we cannot access it from outside the package. So inheritance is a must for accessing it from outside the package.
Public: We can access the public modifier from anywhere. We can access public modifiers from within the class as well as from outside the class and also within the package and outside the package.
```

### 7. What is final key word? (Filed, Method, Class)

```
(1)	Final keyword in java is used to restrict usage of variable, class and method.
(2)	Variable: Value of Final variable is constant, you can not change it.
(3)	Method: you can’t override a Final method(overloading is ok).
(4)	Class: you can’t inherit from Final class(which also means we cannot have a final interface or a final abstract class).

```

### 8. What is static keyword? (Filed, Method, Class). When do we usually use it?

```
In Java, static keyword is mainly used for memory management. It can be used with variables, methods, blocks and nested classes. It is a keyword which is used to share the same variable or method of a given class. Basically, static is used for a constant variable or a method that is same for every instance of a class. The main method of a class is generally labeled static.

When you declare a variable as static, then a single copy of the variable is created and divided among all objects at the class level. Static variables are, essentially, global variables. Basically, all the instances of the class share the same static variable. Static variables can be created at class-level only.

When a method is declared with the static keyword, it is known as a static method. The most common example of a static method is the main( ) method.  Methods declared as static can have the two restrictions:They can directly call other static methods only; They can access static data directly.

A class can be made static only if it is a nested class. Nested static class doesn’t need a reference of Outer class. In this case, a static class cannot access non-static members of the Outer class.
```

### 9. What is the differences between overriding and overloading?

```
Overriding occurs when the method signature is the same in the superclass and the child class. Overloading occurs when two or more methods in the same class have the same name but different parameters.
```


### 10. What is the differences between super and this?
```
“super” and “this” in Java are two predefined keywords, that cannot be used as an identifier. “super” in Java is used to refer to methods, static and instance variables, constructors of an immediate parent class. “this” in Java is used to refer to methods, static and instance variables, constructors of a current class.
```

### 11. What is the Java load sequence?

### 12. What is Polymorphism ? And how Java implements it ?

```
In Java, polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method. To put it simply, polymorphism in Java allows us to perform the same action in many different ways. Java implements it in two ways: Compile-Time Polymorphism and Run-Time Polymorphism. 
```

### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?

```
Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to the bundling of fields and methods inside a single class.
Java uses setters and getter to implement it. 
It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.
```

### 14. What is Interface and what is abstract class? What are the differences between them?
```
Interfaces are a kind of code contract, which must be implemented by a concrete class.
Abstract classes are similar to normal classes, with the difference that they can include abstract methods, which are methods without a body. Abstract classes cannot be instantiated.
As for difference, please check the pciture I shared on general channel. 
```