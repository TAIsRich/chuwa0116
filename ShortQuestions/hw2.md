# Chuwa 1.20 HW2
## 1. Write up Example code to demonstrate the three fundamental concepts of OOP.(reference Code Demo repo as example) 1.Encapsulation; 2. Polymorphism; 3. Inheritance;
``Encapsulation``
```
class  Encapsulation{
    private int age;
    private String name;

    public int getAge(){
        reurn age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
```
``Polymorphism & Inheritance``
```
class Parent {
    public void CNY(){
        System.out.println("Happy New Year!");
    }
}
class Child extends Parent {
    @Override
    public void CNY(){
        System.out.println("Happy Chinese New Year!");
    }
    int default_age = 24;
    public void print_age(){
        System.out.println("The age is "+default_age);
    }
    public void print_age(int age){
        System.out.println("The age is "+age);
    }
}
```
## 2. What is wrapper class in Java and Why we need wrapper class?
1. Wrapper class is a class cotaining ``primitive data types``, which provides a way to use primitive data types. All primitive types have corresponding wrapper class, for example, ``char -> Character``.
2. Wrapper class can help Java to be completely object-oriented since primitive data types are not objects.
## 3. What is the difference between HashMap and HashTable?
1. Hashmap is not synchronized while Hashtable is.
2. Hashmap's performance is better than Hashtable relatively.
3. Null is allowed for key and value in Hashmap but not allowed for Hashtable.
## 4. What is String pool in Java and why we need String pool?
1. String pool is a storing area inside Java heap, which is an implementation of String interning in Java. It helps the immutability of String in Java.
2. String pool helps save the memory, which decreases the number of string objects created in memory. JVM will first checks if a string is in the String pool when a new string is created.
## 5. What is Java garbage collection?
1. In Java, the programmer need not to care for all those objects which are no longer in use. Garbage collector destroys these objects.
2. Main objective of Garbage Collector is to free heap memory by destroying unreachable objects.
## 6. What are access modifiers and their scopes in Java?
1. Access modifiers are keywords that can control the visibility of fields, methods, and constructors in a class. Private, Default, Protected, ad Public.
   1. Private: only within same class.
   2. Default: within same package.
   3. Proctected: within same package and outside of the package with child class(inheritance).
   4. Public: access from anywhere.
## 7. What is final keyword?(Field,Method,Class)
1. Final field: **Constans or write-once field**.
2. Final method: **Methods that cannot be overriden by subclasses.**
3. Final class: **Classes cannot be extended or inherited.**
## 8. What is static keyword?(Field,Method,Class).When do we usually use it?
1. Static field: **class variable that will be applied universally to all instances of a class.**
2. Static methods: **Methods taht belongs to a class instead of an instance of a class. Static methods cannot call non-static methods.**
3. Static class: **Top-level classes cannot be static, while inner classes can be static. A static class can access only the static members of the outer class, and a static nested class can be instantiated withouth instantiating its outer class.**
## 9.  What is the differences between overriding and overloading?
1. Overriding: Override happens between superclass and subclass, and have the same signature (name and method arguments) for methods in parent and child classes.
2. Overloading: Overload means multiple methods with same names in same class, and they have different parameters.
## 10. What is the differences between super and this?
1. super: ``super`` stands for implicit reference of parent class.It can be used to call variable, methods, constructor, and etc. of parent class.
2. this: ``this`` stands for implicit reference of current class. It can be used to call variable, methods, constructor, and etc. of current class.
## 11. What is the Java load sequence?
1. Firstly ``static variable`` or ``static block``, then ``constructor``.
## 12. What is Polymorphism ? And how Java implements it ?
1. ``Polymorphism`` refers to the same object exhibiting different forms and behaviors.
2. Static polymorphism means overload, and dynamic polymorphism means override.
## 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
1. ``Encapsulation`` in OOP refers to binding the data and the methods to manipulate that data together in a single unit (class).
2. Use getter/setter to access some private variables.
## 14. What is Interface and what is abstract class? What are the differences between them?
1. An ``interface`` is a completely "abstract class" that is used to group related methods with empty bodies.
2. ``Abstract class`` is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
3. ``Differences``: Interface cannot have methods with actual contents/bodies, and we used the keyword ``implements`` when using the interface by some class. Abstract class cannot be instantiated, we should use the keyword ``extends`` to use such abstract class for some child class.
## 15. (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )
## 16. If you have no ability to design it,please find the solution in internet,then understand it,and re-type it.(Do NOT just copy and paste)
## 17. What are Queue interface implementations and what are the differences and when to use what?
1. PriorityQueue, LinkedList, PriroityBlockingQueue
2. ``Differences``
   1. **PriorityQueue**: PriorityQueue does not preserve the insertion order. It will sort elements based on some order, such as max heap and min heap. The overall big O for PriorityQueue will be O(logn).
   2. **LinkedList**: LinkedList prevserved the insertion order. Add and get operations have O(1) time complexity.
   3. **PriorityBlockingQueue**: The PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and supplies blocking retrieval operations. Since it is unbounded, adding elements may sometimes fail due to resource exhaustion resulting in OutOfMemoryError. This class does not permit null elements.