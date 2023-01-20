### Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)
1.  Encapsulation;
```
some code
```
2.  Polymorphism;
3.  Inheritance; 


### What is wrapper class in Java and Why we need wrapper class? 
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects. 

Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects)

```
ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
```


### What is the difference between HashMap and HashTable?

| HashMap  | HashTable |
| ------------- | ------------- |
| No method is synchronized.  | Every method is synchronized.  |
| Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe.  | At a time only one thread is allowed to operate the Hashtable’s object. Hence it is thread-safe.  |
| Threads are not required to wait and hence relatively performance is high. | It increases the waiting time of the thread and hence performance is low. |
| Null is allowed for both key and value. | Null is not allowed for both key and value. Otherwise, we will get a null pointer exception. |


### What is String pool in Java and why we need String pool? 



### What is Java garbage collection?

### What are access modifiers and their scopes in Java?

### What is final key word? (Filed, Method, Class)

### What is static keyword? (Filed, Method, Class). When do we usually use it?

### What is the differences between overriding and overloading?

### What is the differences between super and this?

### What is the Java load sequence?

### What is Polymorphism ? And how Java implements it ? 

### What is Encapsulation ? How Java implements it? And why we need encapsulation?

### What is Interface and what is abstract class? What are the differences between them?

### (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )

### If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)

### What are Queue interface implementations and what are the differences and when to use what?
