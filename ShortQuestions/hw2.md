# hw2

## 1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)

### Encapsulation

```Java
class Person{
    private String name;
    private String gender;
    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}
```

### Polymorphism

Overload

```Java
class Multiply{
    public Multiply(){}

    public int calculate(int a, int b){
        return a * b;
    }

    public int calculate(int a, int b, int c){
        return a * b * c;
    }
}
```

Override

```Java
class Car{
    public String getBrand(){
        return "";
    }
}

class BrandA extends Car{
    @Override
    public String getBrand(){
        return "A";
    }
}
```

### Inheritance

```Java
class Person{
    private String name;
    private String gender;
    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
}

class MoreInfo extends Person{
    private int id;

    public int getId(){
        return id;
    }

    public void setId(id){
        this.id = id;
    }
}
```

## 2. What is wrapper class in Java and Why we need wrapper class?

Wrapper class provides a way to use primitive data type as an object. The wrapper class contains value of those primitive type variables and also some other methods.

## 3. What is the difference between HashMap and HashTable?

HashMap is not thread safe. HashTable is thread safe.

Null is allowed for both key and value in HashMap. Null is not allowed for both key and value in HashTable.

HashMap is not legacy. HashTable is legacy.

## 4. What is String pool in Java and why we need String pool?

String pool is a storage area in Java heap where string literals stores. It is also known as String Intern Pool or String Constant Pool.

It is created to decrease the number of string objects created in the memory. Whenever a new string is created, JVM first checks the string pool. If it encounters the same string, then instead of creating a new string, it returns a reference existing string to the variable.

## 5. What is Java garbage collection?

Java garbage collection is an automatic process. Automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects. If some parts of memory is not reachable by a program, it will free these parts of memory.


## 6. What are access modifiers and their scopes in Java?

Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.

scope:

private: class

default: package

protected: package

public: anywhere

## 7 What is final key word? (Filed, Method, Class)

Final variables cannot be changed.

Final methods cannot be override.

Final class cannot be inherited.

## 8. What is static keyword? (Filed, Method, Class). When do we usually use it?

Static variables: only one instance will be created and shared between objects.

Static methods: can be directly called using class name

Static class: only one instance will be created and shared between objects.

If something is the same among all objects, we can make it static to save memory and avoid conflict.


## 9. What is the differences between overriding and overloading?

Overloading is creating multiple the same name methods with different parameters in a class.

Overriding is to recreate parent class method in child class. Method name should be the same.

## 10. What is the differences between super and this?

super refers to parent class

this refers to current class.

## 11. What is the Java load sequence?

static variable/block -> constructor

## 12. What is Polymorphism ? And how Java implements it ?

Polymorphism refers to the same object exhibiting different forms and behaviors.

In Java, it contains overload and override. Overload happens at compile time and override happens at runtime.

## 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?

Encapsulation refers to binding data and methods manipulate that data in one class.

In Java, we can set private variables and use getter and setter to change them.

Encapsulation helps to make our data safe.

## 14. What is Interface and what is abstract class? What are the differences between them?

Interface is an abstract type that contains a collection of methods and constant variables.

An abstract class is a class that is declared abstract, it may or may not include abstract methods.

Difference:

A class can implement several interfaces but only inherit one abstract class.

## 15. (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder)

## 16. What are Queue interface implementations and what are the differences and when to use what?

Deque and PriorityQueue

In priority queue, elements are sorted. In deque, it supports add and poll from head and tail.
