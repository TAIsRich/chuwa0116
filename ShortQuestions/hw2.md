### 1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)
- Encapsulation:
```
public class Car {
    private String year;
    private String color;
    public Car(String color,String year){
        this.color = color;
        this.year = year;  
    }
    public String getYear(){
        return year;
    }
    public void showCar(){
        System.out.println("This is a car");
    }
}

```
- Inheritance and Polymorphism:
```
public class Honda extends Car{
    private String model;
    public Honda(String color, String year, String model) {
        super(color, year);
        this.model = model;
    }
    
    @Override
    public void showCar(){
        System.out.println("This is a car made by Honda");
    }
}
```
### 2. What is wrapper class in Java and Why we need wrapper class?
A Wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. Wrapper class can convert primitive data types into objects.

### 3. What is the difference between HashMap and HashTable?
| Hashmap     | Hashtable |
| :-----------: | :-----------: |
| No method is synchronized.| Every method is synchronized.      |
| Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe.   | At a time only one thread is allowed to operate the Hashtable’s object. Hence it is thread-safe.        |
| Threads are not required to wait and hence relatively performance is high.| It increases the waiting time of the thread and hence performance is low.     |
| Null is allowed for both key and value.| Null is not allowed for both key and value. Otherwise, we will get a null pointer exception.  |

### 4. What is String pool in Java and why we need String pool?
String Pool in Java is a special storage space in Java Heap memory where string literals are stored. When we declare a String literal, the JVM creates the object in the pool and stores its reference on the stack. Before creating each String object in memory, the JVM performs some steps to decrease the memory overhead.

### 5. What is Java garbage collection?
Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.
### 6. What are access modifiers and their scopes in Java?
Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private. 
### 7.  What is final key word? (Filed, Method, Class)
The final keyword in java is used to restrict the user.
### 8.  What is static keyword? (Filed, Method, Class). When do we usually use it?
It is a keyword which is used to share the same variable or method of a given class. Basically, static is used for a constant variable or a method that is same for every instance of a class.
### 9.  What is the differences between overriding and overloading?
| Overloading     | Overriding |
| :-----------: | :-----------: |
| Overloading happens at compile time.| Overriding happens at runtime      |
| Gives better performance because the binding is being done at compile time.   | Gives less performance because the binding is being done at run time.    |
| Private and final methods can be overloaded.| Private and final methods can NOT be overridden.    |
| Return type of method does not matter in case of method overloading.| Return type of method must be the same in the case of overriding. |
| Arguments must be different in the case of overloading.| Arguments must be the same in the case of overriding. |
| It is being done in the same class.| Base and derived(child) classes are required here.|
| Mostly used to increase the readability of the code.| Mostly used to provide the implementation of the method that is already provided by its base class.|



### 10.  What is the differences between super and this?
this refers to the current class object. Super refers immediate parent class object.
### 11.  What is the Java load sequence?
static variable/block -> constructor(used in Obj)
### 12.  What is Polymorphism ? And how Java implements it ?
In programming, polymorphism refers to the same object exhibiting different forms and behaviors. Java implements polymorphism in two ways: One is static or compile-time polymorphism is done by method overloading (more then one methods sharing the same name but different number/types/order of parameters). The other is dynamic or runtime polymorphism is done by method overriding (defining a method in the child class which has the same name and same number/types/order of parameters as that in parent class)

### 13.  What is Encapsulation ? How Java implements it? And why we need encapsulation?
Encapsulation in OOP refers to binding the data and the methods to manipulate that data together in a single unit (class). Encapsulation in Java is the process by which data (variables) and the code that acts upon them (methods) are integrated as a single unit. By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them. We need encapsulation for security.
### 14.  What is Interface and what is abstract class? What are the differences between them?
In Java, an interface is an abstract type that contains a collection of methods and constant variables. An abstract class is a class that is declared abstract —it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed. When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class. Difeerences between them:

- In Interface, a class can implement multiple interfaces, whereas the class can inherit only one Abstract Class.
- In Interface does not have access modifiers. Everything defined inside the Interface is assumed to have a public modifier, whereas Abstract Class can have an access modifier.
- The Interface cannot contain data fields, whereas the abstract class can have data fields.
- Interfaces help define a class’s peripheral abilities, whereas an abstract class defines the identity of a class.

### 15.  (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder,)
### 16.  What are Queue interface implementations and what are the differences and when to use what?
The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle. The most commonly used Queue implementations are PriorityQueue, LinkedList and PriorityBlockingQueue:

+ PriorityQueue class which is implemented in the collection framework provides us a way to process the objects based on the priority. It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.
+ inkedList is a class which is implemented in the collection framework which inherently implements the linked list data structure. It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays or queues.
+ PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed. PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and supplies blocking retrieval operations.
