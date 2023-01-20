1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo
   repo as example)

1a. Encapsulation;
class Encapsulate {
private String geekName;
public String getName() { return geekName; }
public void setName(String newName)
{
geekName = newName;
}
}

public class TestEncapsulation {
public static void main(String[] args)
{
Encapsulate obj = new Encapsulate();
obj.setName("Harsh");
System.out.println("Geek's name: " + obj.getName());
}
}

1b.Polymorphism

class Animal {
public void animalSound() {
System.out.println("The animal makes a sound");
}
}

class Pig extends Animal {
public void animalSound() {
System.out.println("The pig says: wee wee");
}
}

1c. Inheritance

class Employee {
int salary = 60000;
}
class Engineer extends Employee {
int benefits = 10000;
}
class Gfg {
public static void main(String args[])
{
Engineer E1 = new Engineer();
System.out.println("Salary : " + E1.salary + "\nBenefits : " + E1.benefits);
}
}

2. What is wrapper class in Java and Why we need wrapper class?

Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects).

3. What is the difference between HashMap and HashTable?

HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value. HashMap is generally preferred over HashTable if thread synchronization is not needed.

4. What is String pool in Java and why we need String pool?

String Pool in java is a pool of Strings stored in Java Heap Memory. It is created to decrease the number of string objects created in the memory. Whenever a new string is created, JVM first checks the string pool. If it encounters the same string, then instead of creating a new string, it returns a reference existing string to the variable.

5. What is Java garbage collection?

Garbage collection in Java is the automated process of deleting code that's no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers. Java applications are compiled into bytecode that may be executed by a JVM.

6. What are access modifiers and their scopes in Java?

Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.

<img src = "Access-Modifiers-in-Java.png" alt = "access modifier" />

7. What is final key word? (Filed, Method, Class)

final to variable: to create constants;
final to classes: to prevent Inheritance;
final to methods: to prevent method overriding.

8. What is static keyword? (Filed, Method, Class). When do we usually use it?

In Java, static keyword is mainly used for memory management. It can be used with variables, methods, blocks and nested classes. It is a keyword which is used to share the same variable or method of a given class. Basically, static is used for a constant variable or a method that is same for every instance of a class.

9. What is the differences between overriding and overloading?

Overriding occurs when the method signature is the same in the superclass and the child class. Overloading occurs when two or more methods in the same class have the same name but different parameters.

10. What is the differences between super and this?

“super” in Java is used to refer to methods, static and instance variables, constructors of an immediate parent class. “this” in Java is used to refer to methods, static and instance variables, constructors of a current class.

11. What is the Java load sequence?

12. What is Polymorphism ? And how Java implements it ?

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance. Polymorphism uses those methods to perform different tasks.

Polymorphism in Java can be achieved in two ways i.e., method overloading and method overriding. Polymorphism in Java is mainly divided into two types. Compile-time polymorphism can be achieved by method overloading, and Runtime polymorphism can be achieved by method overriding.

13. What is Encapsulation ? How Java implements it? And why we need encapsulation?

Encapsulation in Java is the inclusion of all methods and variables needed for a Java object to function, contained within the object itself.

Encapsulation in Java is the process by which data (variables) and the code that acts upon them (methods) are integrated as a single unit. By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them.

Encapsulation is a way to restrict the direct access to some components of an object, so users cannot access state values for all of the variables of a particular object. Encapsulation can be used to hide both data members and data functions or methods associated with an instantiated class or object.

14. What is Interface and what is abstract class? What are the differences between them?

An interface is a completely "abstract class" that is used to group related methods with empty bodies:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Differences are in below aspects.

Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also. From Java 9, it can have private concrete methods as well.

Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.

Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.

Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.

Inheritance vs Abstraction: A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.

Multiple implementations: An interface can extend one or more Java interfaces; an abstract class can extend another Java class and implement multiple Java interfaces.

Multiple Inheritance: Interface supports multiple inheritance; an abstract class does not support multiple inheritance.

Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.

16. What are Queue interface implementations and what are the differences and when to use what?

A queue can be implemented using Arrays, Linked-lists, Pointers, and Structures. The implementation using one-dimensional arrays is the easiest method of all the mentioned methods.
