# HW2

## 1. Refer coding folder, Encapsulation.java file

## 2. What is wrapper class in Java and Why we need wrapper class?
In java, a wrapper class is the class that wraps (or encapsulates) primitive data types, converting perimitive data to objects. 
For example, Long-long, Integer-int, Float-float, Character-char etc. Reasons are that 
1. when you use some Collection objects like `ArrayList`,
`ArrayList` only store objects rather than primitives. 
2. wrapper classes provide some convenient methods for primitive data like `equals`, `parseInt`, `valueOf` etc. 

## 3. What is the difference between HashMap and HashTable?
1. HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value.
2. HashMap is unsynchronized, while Hashtable is synchronized. This means that HashMap is not thread-safe, 
while Hashtable is thread-safe and can be used in a multi-threaded environment.
3. HashMap is generally faster than Hashtable because it is not synchronized.

## 4. What is String pool in Java and why we need String pool?
In Java, the string pool is a special area of the heap memory where strings are stored. 
When a string is created using a string literal (e.g. "Hello"), it is stored in the string pool. 
If a string with the same value already exists in the pool, 
a reference to the existing string is returned instead of creating a new one.

The main advantage of the string pool is that it helps to conserve memory by avoiding the creation of duplicate strings.
Since strings are immutable in Java, multiple references to the same string will have the same value, 
and storing multiple copies of the same string would result in unnecessary memory usage.

Additionally, the string pool also improves performance,
because comparing strings using the "==" operator will compare the memory addresses of the strings.

## 5. What is Java garbage collection?
Java garbage collection is the done JVM in the way that JVM automatically frees up memory that is no longer being used.
The JVM uses a garbage collector to periodically scan the heap and free unused objects.
One common algorithm is the mark-and-sweep algorithm.

## 6. What are access modifiers and their scopes in Java?
Default: within package

Private: within class only

Protected: within package or all subclasses in different packages

Public: anywhere

## 7. What is final key word? (Field, Method, Class)
Final variable: final variable cannot be reassigned to another value.

Final method: this method cannot be overridden by subclasses.

Final class: this class cannot be extended or inherited; immutable class.

Final field: the field cannot be modified once been initialized.

## 8. What is static keyword? (Filed, Method, Class). When do we usually use it?
Static field: this field, one and only one copy, is shared across all instances.

Static method: this method can be called directly on class without instantiate instances. 
Cannot access non-static variables and methods.

Static class: only inner class can be static class, so we can instantiate this class without instantiate outer class.

## 9. What is the differences between overriding and overloading?
Overriding: subclass re-implements parent's method with same name, same parameters, and same return type.

Overloading: one class may have two or more methods with the same name, but different parameters. 
It could be different number of parameters or different types of parameters; return type can be different too.

## 10. What is the differences between super and this?
`super` is used to calling parent class methods or accessing parent class fields, and `this` is used for accessing fields
or methods withing current class.



## 11. What is the Java load sequence?
Initializing part: Static block -> static variables -> constructor -> non-static variables.

Order of JVM loads, initializes Java program is loading -> linking -> initializing -> execution

## 12. What is Polymorphism ? And how Java implements it?
In programming, polymorphism refers to the same object exhibiting different forms and behaviors.
In Java, polymorphism is implemented through method overloading and method overriding.
> Static Polymorphism - Overload (same class) - compile time
> 
> Dynamic Polymorphism - Override (child class) - run time
## 13. What is Encapsulation? How Java implements it? And why we need encapsulation?
Encapsulation in OOP refers to binding the data and the methods to manipulate that data together in a
single unit (class).
Java implements encapsulation through the use of access modifiers (such as private, protected, and public) and getter/setter methods.
Encapsulation provides data hiding / code re-usability / code maintainability and scalability.

## 14. What is Interface and what is abstract class? What are the differences between them?
In Java, both interfaces and abstract classes are used to define a common set of methods and properties that are shared 
by multiple classes, but they have some key differences:
- Interfaces can only have abstract methods, while abstract classes can have both abstract and non-abstract methods.
- A class can implement multiple interfaces, but can only extend one abstract class.
- An interface is typically used to define a contract that multiple classes must implement, while an abstract class is 
- typically used to provide a common implementation that can be shared by multiple subclasses.


## 15. Refer coding/coding1 folder.

## 16. What are Queue interface implementations and what are the differences and when to use what?
The Queue interface is a part of the Java Collection Framework and provides a mechanism for holding multiple 
elements prior to processing. Some common implementations include:
- LinkedList: FIFO
- PriorityQueue: Heap
- ArrayDeque: Double ended queue

Choose what to use based on different scenarios, if you need heap, use PriorityQueue, if just FIFO, linkedlist queue.

