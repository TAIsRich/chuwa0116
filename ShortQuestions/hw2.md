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

2.  Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
    Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects).

3.

HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value. HashMap is generally preferred over HashTable if thread synchronization is not needed.

4.  String Pool in java is a pool of Strings stored in Java Heap Memory. It is created to decrease the number of string objects created in the memory. Whenever a new string is created, JVM first checks the string pool. If it encounters the same string, then instead of creating a new string, it returns a reference existing string to the variable.

5.  Garbage collection in Java is the automated process of deleting code that's no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers. Java applications are compiled into bytecode that may be executed by a JVM.
