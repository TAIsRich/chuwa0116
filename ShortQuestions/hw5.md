# HW5

## 1. What is generic in Java? and type the generic code by yourself.
Generic means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

Refer coding folder, hw5Generics package
## 2. Read those codes and type it one by one by yourself. the push the code to your branch.
Refer coding folder, hw5Java8Features package
## 3. PASS

## 4. Write the Singleton design pattern include eager load and lazy load.
Refer coding folder, hw5Singleton package

## 5. What is Runtime Exception? could you give me some examples?
A runtime error refers to the error that we encounter during the code execution during runtime. 
e.g NullPointer Exception; zero division exception.
## 6. Could you give me one example of NullPointerException?
```
String ptr = null;
System.out.println(ptr.equals("hello world"));
```
Here `ptr` is null, `null` has no method called equals.

## 7. What is the Optional class?
Optional is a container type which may or may not contain value i.e. zero(null) or
one(not-null) value. It is part of java.util package. There are pre-defined methods like
isPresent(), which returns true if the value is present or else false and the method
get(), which will return the value if it is present.

## 8. What is the @FunctionalInterface?
Interface with only one unimplemented function. The main reason why we need functional interfaces is that we can use them in lambda expressions.

## 9. what is lambda?
Anonymous function / function without name / arrow function

## 10. What is Method Reference?
Method reference refers to the method via the use of an :: operator; it is a simple way of lambda expression.

## 11. What is Java 8 new features?
Lambda expression, functional interfaces, method references, default method, stream api, date time api,
optional calss, etc.

## 12. Lambda can use unchanged variable outside of lambda? what is the details?
Variable used in lambda expression should be final or effectively final.
`final` means this variable's value is never changed.
An effectively final variable is a variable whose value is never changed, but it isn't declared with the final keyword.

