# HW2
### 1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)
#### 1. Encapsulation


```
class Student{
    
    private String stuName;
    private int stuId;
    
    public Student(String name, int id){
        this.stuName = name;
        this.stuId = id;
    }
    
    public String getName(){
        return stuName;
    }
    public void setName(String name){
        this.stuName = name;
    }
    
    public int getId(){
        return stuId;
    }
}

```

#### 2. Polymorphism

```
abstract class Animal {
    public abstract void talk();
}

class Dog extends Animal {
    public void talk() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public void talk() {
        System.out.println("Meow!");
    }
}

```
#### 3. Inheritance

```
public class Animal { 

    private String name;  
    private int id; 
    
    public Animal(String myName, int myid) { 
        this.name = myName; 
        this.id = myid;
    } 
    
    public void eat(){ 
        System.out.println("animal : eat"); 
    }
}

class Dog extends Animal {

  void eat() {
    System.out.println("dog : eat");
  }
  
  void eatTest() {
    this.eat();   
    super.eat();  
  }
}

public class Test {

  public static void main(String[] args) {
  
    Animal a = new Animal();
    a.eat();
    Dog d = new Dog();
    d.eatTest();
  }
}
``` 


### 2. What is wrapper class in Java and Why we need wrapper class?
* Wrapper class helps in conversion from primitive to object as well as from object to primitive data type. 

* Wrapper classes in Java are beneficial for situations where the program demands working with an object instead of a primitive data type. In that sense, wrapper classes help the Java program be 100% object-oriented. Apart from that, wrapper classes in Java are needed for the following reasons: 

    * To bind the values of different primitive data types into objects. This helps in performing complex operations and working with collections like HashMap, ArrayList, etc. 
    * To provide different utility functions that can be used with primitive data types. 
    * Since primitive data types can’t be given a null value, but wrapper classes can, they also act as a workaround for assigning a null value to any primitive data type. 
    
    
    
### 3. What is the difference between HashMap and HashTable?
* HashMap is non-syncronized and is not thread safe while HashTable is thread safe and is synchronized.

* HashMap allows one null key and values can be null whereas HashTable doesn't allow null key or value.

* HashMap is faster than HashTable.

* HashMap iterator is fail-safe where HashTable iterator is not fail-safe.

* HashMap extends AbstractMap class where HashTable extends Dictionary class.

### 4. What is String pool in Java and why we need String pool?
* String Pool in Java is a storage space in Java Heap memory where unique string literals are stored.
It is privately maintained by the Java String class. The String Pool is empty by default, and it is maintained privately by the String class. When we create a string literal, the JVM first checks that literal in the String Constant Pool. If the literal is already present in the pool, its reference is stored in the variable. However, if the string literal is not found, the JVM creates a new string object in the String Constant Pool and returns its reference.

* A pool of strings decreases the number of String objects created in the JVM, thereby reducing memory load and improving performance.

### 5. What is Java garbage collection?
Garbage collection in Java is the automated process of deleting code that's no longer needed or used.

### 6. What are access modifiers and their scopes in Java?
Access modifiers are object-oriented programming that is used to set the accessibility of classes, constructors, methods, and other members of Java.
Using the access modifiers we can set the scope or accessibility of these classes, methods, constructors, and other members. The four access modifiers in Java are **public, protected, default, and private**.
* Private: We can access the private modifier only within the same class and not from outside the class.
* Default: We can access the default modifier only within the same package and not from outside the package. And also, if we do not specify any access modifier it will automatically consider it as default.
* Protected: We can access the protected modifier within the same package and also from outside the package with the help of the child class. If we do not make the child class, we cannot access it from outside the package. So inheritance is a must for accessing it from outside the package.
* Public: We can access the public modifier from anywhere. We can access public modifiers from within the class as well as from outside the class and also within the package and outside the package.

### 7. What is final key word? (Filed, Method, Class)
The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).
* The class declared with the final keyword is a final class. The final class means that the class cannot be extended. We can only create a final class if it is complete in nature, which means it cannot be an abstract class. All wrapper classes in Java are final classes, such as String, Integer, etc. Final class cannot be inherited by any subclass.
* Use the final keyword in a method declaration to indicate that the method cannot be overridden by subclasses.
* A final variable can be explicitly initialized only once. A reference variable declared final can never be reassigned to refer to a different object. 


### 8. What is static keyword? (Filed, Method, Class). When do we usually use it?
* When you declare a variable as static, then a single copy of the variable is created and divided among all objects at the class level. Static variables are, essentially, global variables. Basically, all the instances of the class share the same static variable. Static variables can be created at class-level only.
* When a method is declared with the static keyword, it is known as a static method. The most common example of a static method is the main( ) method.  Methods declared as static can have the following restrictions:
    * They can directly call other static methods only.
    * They can access static data directly.
* A class can be made static only if it is a nested class. Nested static class doesn’t need a reference of Outer class. In this case, a static class cannot access non-static members of the Outer class.

### 9. What is the differences between overriding and overloading?
| overriding  | overloading |
| ----------------------------------|:--------------------------------------:|
| Implements “runtime polymorphism” | Implements “compile time polymorphism” |
| The method call is determined at runtime based on the object type|The method call is determined at compile time     |
| Occurs between superclass and subclass      | Occurs between the methods in the same class     |
| Have the same signature (name and method arguments)      | Have the same name, but the parameters are different     |
| On error, the effect will be visible at runtime      | On error, it can be caught at compile time     |

### 10. What is the differences between super and this?
* The **super** keyword is used to represent an instance of the parent class which is created implicitly for each object of the child class. The super keyword can be used to invoke the parent class methods and constructors. It can also be used to access the fields of the parent class.
* The **this** keyword is used to represent the current instance of a class. It is used to access the instance variables and invoke current class methods and constructors. The this keyword can be passed as an argument to a method call representing the current class instance.

### 11. What is the Java load sequence?
static variable/block -> constructor
### 12. What is Polymorphism ? And how Java implements it ?
* polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method.
*  Java performs Polymorphism via two different methods:

    * Method Overloading
    * Method Overriding
* Also, Polymorphism in Java can be classified into two types, i.e:

    * Static/Compile-Time Polymorphism
    *Dynamic/Runtime Polymorphism

### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
* Encapsulation refers to the bundling of fields and methods inside a single class. It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.
* Encapsulation helps us to keep related fields and methods together, which makes our code cleaner and easy to read. And it helps to control the values of our data fields. 

### 14. What is Interface and what is abstract class? What are the differences between them?
* Interfaces are a kind of code contract, which must be implemented by a concrete class.
* Abstract classes are similar to normal classes, with the difference that they can include abstract methods, which are methods without a body. Abstract classes cannot be instantiated.
* The **main difference** between an interface and an abstract class is that an interface cannot have state, whereas the abstract class can have state with instance variables. **Another key difference** is that classes can implement more than one interface, but they can extend only one abstract class. This is a design decision based on the fact that multiple inheritance (extending more than one class) can cause code deadlocks. Java's engineers decided to avoid that. **Another difference** is that interfaces can be implemented by classes or extended by interfaces, but classes can be only extended. It's also important to note that lambda expressions can only be used with a functional interface (meaning an interface with only one method), while abstract classes with only one abstract method cannot use lambdas.


### 16. What are Queue interface implementations and what are the differences and when to use what?
* The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.
* Characteristics of a Queue: 

    * The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept.
    * The Java Queue supports all methods of Collection interface including insertion, deletion, etc.
    * LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
    * If any null operation is performed on BlockingQueues, NullPointerException is thrown.
    * The Queues which are available in java.util package are Unbounded Queues.
    * The Queues which are available in java.util.concurrent package are the Bounded Queues.
    * All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively. The Deques support element insertion and removal at both ends. 

* PriorityQueue: PriorityQueue class which is implemented in the collection framework provides us a way to process the objects based on the priority. It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.
* LinkedList: LinkedList is a class which is implemented in the collection framework which inherently implements the linked list data structure. It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays or queues.
* PriorityBlockingQueue: It is to be noted that both the implementations, the PriorityQueue and LinkedList are not thread-safe. PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed. PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and supplies blocking retrieval operations. 
Since it is unbounded, adding elements may sometimes fail due to resource exhaustion resulting in OutOfMemoryError.