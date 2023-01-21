#### 1.  Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo 
repo as example)
```
// Encapsulation
public class Employees {
    private String Name;
    private int age;

    public Employees(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    public int GetAge() {
        return age;
    }
}
```
```
// Polymorphism
public class Solution {
    public static void main(String[] args) {
        Employees emp = new SDE("Sam", 24, 120000);
        emp.setAge(26);
    }
}
```
```
// Inheritance
public class SDE extends Employees {
    private int salary;

    public SDE(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public void SetSalary(int salary) {
        this.salary = salary;
    }

    public void GetSalary() {
        return salary;
    }
}
```

#### 2.  What is wrapper class in Java and Why we need wrapper class? 
    Wrapper class provides a way to use primitive data types as object.
    Wrapper class is used for multithreading synchronization.

#### 3.  What is the difference between HashMap and HashTable?
    HashMap is not synchronized while HashTble is synchronized.
    For HashMap, multiple threads can operate at the same time. On the other hand, for HashTable, only one thread is allowed to operate at one time.

#### 4.  What is String pool in Java and why we need String pool? 
    It's a special storage space to store string literals.
    String pool can increase the performance of code and reduce memory usage.

#### 5.  What is Java garbage collection?
    Java harbage collection is a auto process in java to delete unnecessary code that's not used.

#### 6.  What are access modifiers and their scopes in Java? 
    Keywords used to control the visibility of fields, methods, and constructors.
    EX: private, public, protected, default.

#### 7.  What is final key word? (Filed, Method, Class)
    It's non access modifier which makes field non-changeable, methond non-overriden, and class non-inheritable.

#### 8.  What is static keyword? (Filed, Method, Class). When do we usually use it?
    Static is a keyword for variable: all instance in class share the variable.
                            method: access static data and directly call other static methods.
                            class: used in nested class.

#### 9.  What is the differences between overriding and overloading?
    overloading: In the same class, write the same method with different parameters.
    overriding: Same method in super and child classes.

#### 10.  What is the differences between super and this?
     Super is used to access methods from parent class and this is used to access which from the current class.

#### 11.  What is the Java load sequence?
     Static blocks -> constructors -> instance methods.

#### 12.  What is Polymorphism ? And how Java implements it ? 
     A class can provide different implementation of a method depends on the type of object passed.
     It can be implemented using overloading and overriding.

#### 13.  What is Encapsulation ? How Java implements it? And why we need encapsulation? 
     Building field and method that prevents outer classes from changing them.
     Using access control modifier.
     For data hiding.

#### 14.  What is Interface and what is abstract class? What are the differences between them?
     A class that contains abstract keyword is abstract class. A interface is a blueprint used to implement class.
     A class can implement multiple interfaces while a class can only inherit one abstract class.
     Abstract class can have data field while interface can't.
     Interface has no access modifier while abstract class does.

#### 15.  (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )
1.  If you have no ability to design it, please find the solution in internet, then understand it, and re-type 
it.(Do NOT just copy and paste)
     In coding1 folder.

#### 16.  What are Queue interface implementations and what are the differences and when to use what?
     ArrayDeque, LinkedList, PriorityQueue.
     ArrayDeque is faster than LinkedList, they both store element in the order you put, but PriorityQueue keeps elements sorted.
