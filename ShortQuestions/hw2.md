1. Write up Example code to demonstrate the three fundamental concepts of OOP. (reference Code Demo repo as example)  
```java
//this is Encapsulation
public class Student{
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```
```java
//Polymorphism
class Animal{
    void food(){}
}
class Tiger extends Animal{
    @java.lang.Override
    void food() {
        System.out.println("Meat");
    }
}
class Rubbit extends Animal{
    @java.lang.Override
    void food() {
        System.out.println("Medicago");
    }
}
```
```java
//Inheritance
public class Employee{
    private String name;
    private String work;
    public Employee(String myName, String myWork){
        name = myName;
        work = myWork;
    }
    public void title(){
        System.out.println(name + "'s work is" + work);
    }

}
public class Teacher extends Employee{
    public Teacher(String myName, String myWork){
        super(myName,myWork);
    }
}
```
2. What is wrapper class in Java and Why we need wrapper class?  
Wrapper class is a kind of class which would provide a way to use primitive data types as object.  
The reason we use it is that we cannot use primitive data to solve problem such as LinkedList<>(),
3. What is the difference between HashMap and HashTable?  
   HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value. HashMap is generally preferred over HashTable if thread synchronization is not needed.
4. What is String pool in Java and why we need String pool?  
   String Pool in java is a pool of Strings stored in Java Heap Memory. String pool helps in saving a lot of space for Java Runtime although it takes more time to create the String. 
5. What is Java garbage collection?  
It can be used to handle process of deallocating memory.
6. What are access modifiers and their scopes in Java?  
   Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.
 * public: We can access the public modifier from anywhere. We can access public modifiers from within the class as well as from outside the class and also within the package and outside the package.
 * protected: We can access the protected modifier within the same package and also from outside the package with the help of the child class. If we do not make the child class, we cannot access it from outside the package. So inheritance is a must for accessing it from outside the package.
 * default: We can access the default modifier only within the same package and not from outside the package. And also, if we do not specify any access modifier it will automatically consider it as default.
 * private: We can access the private modifier only within the same class and not from outside the class.
7. What is final keyword?(Filed,Method,Class)  
   The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable. It can be used when you want a variable to always store the same value.
8. What is static keyword?(Filed,Method,Class).When do we usually use it?  
   The static keyword is a non-access modifier used for methods and attributes. Static is used for a constant variable or a method that is same for every instance of a class.
9. What is the differences between overriding and overloading? 
 * Overriding occurs when the method signature is the same in the superclass and the child class. Have the same signature (name and method arguments).
 * Overloading occurs when two or more methods in the same class have the same name but different parameters. Same method name but different parameters in the same class;
10. What is the differences between super and this?
 * super: On other hand super keyword represents the current instance of a parent class.
 * this: this keyword mainly represents the current instance of a class.
11. What is the Java load sequence?  
    static variable/block -> constructor
12. What is Polymorphism ? And how Java implements it ?  
    polymorphism is the provision of a single interface to entities of different types or the use of a single symbol to represent multiple different types. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
13. What is Encapsulation ? How Java implements it? And why we need encapsulation?  
    Encapsulation is a way to restrict the direct access to some components of an object, so users cannot access state values for all of the variables of a particular object. Encapsulation can be used to hide both data members and data functions or methods associated with an instantiated class or object. It can help us to hide data, make code more flexibility and easy to reuse.
14. What is Interface and what is abstract class? What are the differences between them?  
    An interface is a completely "abstract class" that is used to group related methods with empty bodies. An abstract class is a class that is declared abstract —it may or may not include abstract methods.  
    The main difference between an interface and an abstract class is that an interface cannot have state, whereas the abstract class can have state with instance variables.
15. (OOD) Design a parking slot (put the code to codingQuestions/coding1 folder, )
16. If you have no ability to design it,please find the solution in internet, then understand it,and re-type it.(Do NOT just copy and paste)
17. What are Queue interface implementations and what are the differences and when to use what?
    The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order.  When we need to record data in sequence and get them in same sequence. Queue will be a good choice.
