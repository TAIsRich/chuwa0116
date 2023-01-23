# HW2

#### 1 Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)

+ Encapsulation

  ```java
  public class User{
    private String userName;
    private String passWord;
    
    public String getUserName(){
      return userName;
    }
    public String getPassWord(){
      return passWord;
    }
    
    public void setUserName(String i){
      userName = i;
    }
    public void setPassWord(String n){
      passWord = n;
    }
  }
  ```

+ Polymorphism

  ```java
  abstract class Shape {
    public Shape() {
        System.out.println("Constructor of abstract class Shape");
    }
    abstract void draw();

    int getArea() {
        return 123;
    }
  }

  class Circle extends Shape {
  public Circle() {
  System.out.println("Constructor of class Circle");
  }

  @Override
  void draw() {
      System.out.println("Draw a circle");
  }

  ```

+ Inheritance

  ```java
  public class Vehicle{
    private String licence;
    
    public String getLicence(){
      return licence;
    }
  
    public void setLicence(String n){
      licence = n;
    }
  }
  
  public class Bus extends Vehicle{
    private String size;
    
    public String getSize(int size){
      return size;
    }
    
    public void setSize(int i){
      size = i;
    }
  	
  }
  ```

#### 2 What is wrapper class in Java and Why we need wrapper class?

+ Wrapper class is a class whose object wraps or contains a primitive data type.
  It can store primitive data types in collections and pass them as method arguments.

#### 3 What is the difference between HashMap and HashTable?

+ HashMap and Hashtable are both classes that provide a key-value based data structure, but Hashtable does not allow null keys or values
while HashMap is not synchronized and allows null keys and values. HashMap is generally faster and has some different methods than Hashtable.

#### 4 What is String pool in Java and why we need String pool?

+ String pool is a heap memory to store java string. It helps to improve memory efficiency, performance, security and consistency.

#### 5 What is Java garbage collection?

+ Java garbage collection is the process by which the JVM automatically manages the memory used by a Java application by periodically scanning the heap for eligible objects and freeing up the memory occupied by those objects. 
  It is done automatically and helps to prevent memory leaks and improve performance.

#### 6 What are access modifiers and their scopes in Java?

Access modifiers in Java help to restrict the scope of a class, constructor, variable, method, or data member. There are four types of Access modifiers:

+ Public – accessible from everywhere in the application
+ Protected – accessible within the package and the subclasses in any package
+ Default – accessible strictly within the package
+ Private – accessible only within the same class where it is declared

#### 7  What is final key word? (Filed, Method, Class)

+ Final filed cannot be changed, final method cannot be overrider, final class cannot extend.

#### 8 What is static keyword? (Filed, Method, Class). When do we usually use it?

+ Static class: compile time or early binding. Static method and field belong to class.

#### 9 What is the differences between overriding and overloading?
+ overloading: diff num of arguments, diff type aruments, same method name 
+ overriding: Arguments must be the same in the case of overriding.

#### 10 What is the differences between super and this?

+ super is calling the parent class and this is calling current class.

#### 11 What is the Java load sequence?

+ static variable/block -> constructor

#### 12 What is Polymorphism ? And how Java implements it ?

+ Polymorphism is the ability of programming languages to present the same interface for differing underlying data types.
+ Compile-time polymorphism (Static binding) – Method overloading
+ Runtime polymorphism (Dynamic binding) – Method overriding

#### 13 What is Encapsulation ? How Java implements it? And why we need encapsulation?

+ Encapsulation provides objects with the ability to hide their internal characteristics and behavior.
+ Because we need to protect data from external environment.

#### 14 What is Interface and what is abstract class? What are the differences between them?

+ Interface implement other class and abstract class extends other class.

**Difference**
+ The interface does not have access modifiers but abstract have.
+ Interface only static and final variable, abstract class can have final, non-final, static and non-static
  variables
+ In an abstract interface keyword, is optional for declaring a method as an abstract.In an abstract class, the abstract
  keyword is compulsory for declaring a method as an abstract.
+ An interface cannot declare constructors or destructors. An abstract class can declare constructors and destructors.
#### 15 (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder)

+ The codes are in the codingQuestions/coding1 folder.

#### 16 What are Queue interface implementations and what are the differences and when to use what?

+ Queue implement LinkedList and PriorityQueue.

+ LinkedList preserves the insertion order, PriorityQueue does not.

+ LinkedList have no order, but PQ will pop the smallest value first