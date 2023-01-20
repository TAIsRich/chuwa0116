## Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example) 
1.  Encapsulation;
```
public class Encapsulation {
    public static void main(String[] args) {
        User user = new User("Elon","12345"); //Creates a new user and stores the password and username

        user.login("Elon","12345"); //Grants access because credentials are valid

        user.login("Elon", "3456"); //Does not grant access because the credentials are invalid

        //educative.password = "3456"; //Uncommenting this line will give an error
        //Fields of User class cannot be accessed now
    }
}

class User {

    // Private fields
    private String userName;
    private String password;

    //Parameterzied constructor to create a new users
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password) {
        //Check if the username and password match
        if (this.userName.toLowerCase().equals(userName.toLowerCase()) && this.password.equals(password)) {
            // .toLowrcase converts all the characters to lowercase & .equals checks if two strings match

            System.out.println("Access Granted against the username: "+this.userName +" and password: "+this.password);
        } else {
            System.out.println("Invalid Credentials!"); //Else invalid credentials
        }
    }
}

```

2.  Polymorphism & Inheritance

```
public class Shape {

    public double getArea() {
        return 0;
    }

}

    ```
    Example of Rectagle Inheritance Shape
    ```
// A Rectangle is a Shape with a specific width and height
class Rectangle extends Shape {   // extended form the Shape class

    private double width;
    private double height;

    public Rectangle(double width, double heigh) {
        this.width = width;
        this.height = heigh;
    }
    
    ```
    Example of Override
    ```
    @Override
    public double getArea() {
        return width * height;
    }
    
    ```
    Example of Overload
    ```
    public double getArea(){
        return width * height * length;
    }
}

// A Circle is a Shape with a specific radius

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
    

}

public class Client {
    public static void main(String args[]) {
        Shape[] shape = new Shape[2]; // Creating shape array of size 2

        shape[0] = new Circle(2); // creating circle object at index 0
        shape[1] = new Rectangle(2, 2); // creating rectangle object at index 1

        System.out.println("Area of the Circle: " + shape[0].getArea());
        System.out.println("Area of the Rectangle: " + shape[1].getArea());
    }

//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public String add(int a, int b) {
//        return "a + b";
//    }
}
```

## What is wrapper class in Java and Why we need wrapper class? 

Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects. 

Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects)

```
ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
```


## What is the difference between HashMap and HashTable?

| HashMap  | HashTable |
| ------------- | ------------- |
| No method is synchronized.  | Every method is synchronized.  |
| Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe.  | At a time only one thread is allowed to operate the Hashtable’s object. Hence it is thread-safe.  |
| Threads are not required to wait and hence relatively performance is high. | It increases the waiting time of the thread and hence performance is low. |
| Null is allowed for both key and value. | Null is not allowed for both key and value. Otherwise, we will get a null pointer exception. |


## What is String pool in Java and why we need String pool? 

When declare a string without using the constructor, the value of string variable goes into string constant pool, when other string variable using the same value in the pool, the reference of the string value is passed to it. It allow us to save space.

## What is Java garbage collection?

Garbage collection is a key feature for developers who build and compile Java programs on a Java Virtual Machine, or JVM. Java objects are created on the heap, which is a section of memory dedicated to a program. When objects are no longer needed, the garbage collector finds and tracks these unused objects and deletes them to free up space. Without garbage collection, the heap would eventually run out of memory, leading to a runtime OutOfMemoryError.

## What are access modifiers and their scopes in Java?

Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.
Four Types of Access Modifiers
* Private: We can access the private modifier only within the same class and not from outside the class.
* Default: We can access the default modifier only within the same package and not from outside the package. And also, if we do not specify any access modifier it will automatically consider it as default.
* Protected: We can access the protected modifier within the same package and also from outside the package with the help of the child class. If we do not make the child class, we cannot access it from outside the package. So inheritance is a must for accessing it from outside the package.
* Public: We can access the public modifier from anywhere. We can access public modifiers from within the class as well as from outside the class and also within the package and outside the package.

![image](https://user-images.githubusercontent.com/93806902/213807248-88d29a83-0f4c-4f88-9821-c647ef98bc1e.png)


## What is final key word? (Filed, Method, Class)

Final 
* variabl - make it constant
* method - prevent override
* class - prevent inheritance, make class immutable


## What is static keyword? (Filed, Method, Class). When do we usually use it?

Static 
* variable - only one instance
* methods: can directly call static method using class name
* class: can directly construct class using class name. 

When to use a static keyword?
* 工具类的方法一般设置成static，integer, string, math, system, etc.

## What is the differences between overriding and overloading?
![image](https://user-images.githubusercontent.com/93806902/213807626-8f10f27a-8468-4d2b-b434-2e57f1ed77e9.png)


## What is the differences between super and this?

| this keyword in Java | super keyword in Java |
| -------------------- | --------------------- |
| this is an implicit reference variable keyword used to represent the current class. | super is an implicit reference variable keyword used to represent the immediate parent class. |
| this is to invoke methods of the current class. | super is used to invoke methods of the immediate parent class. |
| this is used to invoke a constructor of the current class. | super is used to invoke a constructor of the immediate parent class. |
| this refers to the instance and static variables of the current class. | super refers to the instance and static variables of the immediate parent class. |
| this can be used to return and pass as an argument in the context of a current class object. | super can be used to return and pass as an argument in the context of an immediate parent class object. |
	
## What is the Java load sequence?

static variable/block  -> constructor

## What is Polymorphism ? And how Java implements it ?

In programming, polymorphism refers to the same object exhibiting different forms and behaviors.

Compile-time polymorphism can be achieved by method overloading, and Runtime polymorphism can be achieved by method overriding.

## What is Encapsulation ? How Java implements it? And why we need encapsulation?

Encapsulation in OOP refers to binding the data and the methods to manipulate that data together in a single unit (class).

It is safer to use encapsulation, since it give us full control to decide who can accees/edit resources.

## What is Interface and what is abstract class? What are the differences between them?

* Interfaces are a kind of code contract, which must be implemented by a concrete class.
* Abstract classes are similar to normal classes, with the difference that they can include abstract methods, which are methods without a body. Abstract classes cannot be instantiated.

| Interfaces | Abstract classes |
| ---------- | ---------------- |
| Can only have final static variables. An interface can never change its own state. | Can have any kind of instance or static variables, mutable or immutable. |
| A class can implement multiple interfaces. | A class can extend only one abstract class. |
| Can be implemented with the implements keyword. An interface can also extend interfaces. | Can only be extended. |
| Can only use static final fields, parameters, or local variables for methods. | Can have instance mutable fields, parameters, or local variables. |
| Only functional interfaces can use the lambda feature in Java. | Abstract classes with only one abstract method cannot use lambdas. | 
| Can't have constructor. | Can have constructor. |
| Can have abstract methods. | Can have default and static methods|
| Can have private methods with the implementation | Can have any kind of methods. |

## What are Queue interface implementations and what are the differences and when to use what?

Java's Queue interface is a collection based on the FIFO principle. 

It is implemented by various classes, including ArrayDeque, LinkedList, PriorityQueue, ArrayBlockingQueue, LinkedBlockingQueue, and PriorityBlockingQueue. 

Factors to consider when choosing a Queue implementation include thread-safety, performance, and whether null elements are allowed. 


Blocking queue
 - thread-safety

PriorityBlockingQueue
 - priority-based thread-safety queue
 
PriorityQueue
- A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.

ArrayDeque
- The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface. This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. 

* Few important features of ArrayDeque are as follows:  

* Array deques have no capacity restrictions and they grow as necessary to support usage.
* They are not thread-safe which means that in the absence of external synchronization, ArrayDeque does not support concurrent access by multiple threads.
* Null elements are prohibited in the ArrayDeque.
* ArrayDeque class is likely to be faster than Stack when used as a stack.
* ArrayDeque class is likely to be faster than LinkedList when used as a queue

LinkedList
- The advantage of using linked lists over arrays is that it is possible to implement a queue that can grow or shrink as much as needed. Since each new node will be dynamically allocated, overflow is not possible unless heap memory is exhausted.

