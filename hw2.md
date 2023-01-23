1. example code to demo OOP
  1. Encapsulation:
     public class Employee{
	private String name;
	private int income;
	
	//

	public int getIncome(){ return this.income};
	public int setIncome(int inc){ this.income = inc};
     }
     // bind data and methods to only expose to class should have access to them
  2. Polymorphism
     public class Animal(){

     public void bark(){}
     }
     public class Dog extends Animal(){
       @override	
       public void bark(){
	System.out.print("Woof")		
       }
     }
      public void bark(){}
     }
     public class Duck extends Animal(){
       @override
       public void bark(){
        System.out.print("Quack")
       }
     }
   3.inheritance:
	similar to above code example to perform vinheritance by extend from superclass
        or implement interfaces 
2.wrapper class: wrap the primitive types into object types that can handel null value, convinent for check value
3.hashMap allows null, but hashtable does not, hashmap is not thread safe.
4.String pool in Java is the pool to store Strings as constant intead of objects on heap, helps decrease the number of string objects created in the memory.
5.garbage collection:helps manage dynamically memory allocation
6. private: same class only
   protected:same package only and my children
   public: everyone
7.final: can not be reassigned 
8.static: belong to class not instance, thread safe
9.overriding:redefine parent class method, resolve at runtime
  overload:same method name, different paramter, resolve at compile time
10. super: access its super class object method
   this: access current class object method and field
11.load sequence: Defines the order in which products are loaded onto a transportation unit (TU) so that they can be unloaded in the reverse order at a particular stop of a route
12. same method have diverse implementation based on the object class, jave implment polymorphism using inheritance and override
13. excapsulation is only expose interface to those who should have access and gives extra protection to avoid invalid access, jave implement by setting access indentifier to class,method, field, we need encapsulation because it provides security to the program
14. interface only include method signiture no implementation, abstract class can have both unimplemented method and implemented method
15. Please visit coding section
16. Queue can be implemented using ArrayList or LinkedList. If need a lot random access choose ArrayList, if need a lot delete use LinkedList.

