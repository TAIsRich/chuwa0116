###### 1.Write up Example code to demonstrate the three fundmental concepts of OOP. (referenceCodeDemo repo as example)    
```
public class Person {
    private String id;
    private String name;
    private String gender;
    public Person(String id){
        this.id = id;
    }
    public Person(String id, String name, String gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    
    public void goToWork(){
        System.out.println("I am going to the company");
    }
}

class Student extends Person{

    public Student(String id) {
        super(id);
    }
    
    public Student(String id, String name, String gender){
        super(id, name, gender);
    }

    @Override
    public void goToWork(){
        System.out.println("I am going to the School");
    }
}
```   


###### 2. What is wrapper class in Java and Why we need wrapper class?   
Wrapper classes provide a way to use primitive data types as objects   
The primitive data type are not objects by default. They need to be converted into objects by using wrapper classes.   

###### 3. What is the difference between HashMap and HashTable?   
HashMap allows one null key and multiple null values whereas Hashtable doesn't all ant null key or value. Hashtable is synchronized while HashMap is not synchronized.   

###### 4. What is String pool in Java and why we need String pool?   
String pool is possible only because String is immutable in Java. String pool is a special storage are in Java heap. If the string is already present in the pool, then instead of creating a new object, old object's reference is returned. This way different String objects can refer to the same refernece in the pool, thus save a lot of heap space also.   

###### 5. What is Java garbage collection?   
Garbage collection in Java is the process of looking at heap memory, identifying which objects are in use and which are not and deleting the unused objects. An unused object or unreferneced object, is no longer referenced by any part of your program.   

###### 6. What are access modifiers and their scopes in Java?   
Access modifiers are keywords that can be used to control the visibility of fields, methods and constructors in a class. The four access modifiers in Java are public, protecyed, default, and private.   
Public: We can access the public modifier from anywhere. We can access public modifiers from within the class as well as from outside the class and also within the package and outside the package.   
Private: We can access the private modifier only within the same class and not from outside the class.  
Default: We can access the default modifier only within the same package and not from outside the package. And also, if we do not specify any access modifier it will automatically consider it as default.   
Protected: We can access the protected modifier within the same package and also from outside the package with the help of the child class. If we do not make th e child class, we cannot accress it from outside the package.   

###### 7. What is final key word? (Filed, Method, Class)   
If you use final with a primitive type variable, then its value cannot be changed once assigned.   
If you use final with a method, then you cannot override it in the subclass.   
If you use final with a class, then that class cannot be extented.   
If you use final with an object type, then that object cannot be referenced again.   

###### 8. What is static keyword? (Filed, Method, Class). When do we usually use it?    
If any variable is declared as static, then it is known as 'static variable'. Only single copy of the variable get created and all instances of the class shared static variable. The static variable gets memory only once in the class area at the time of class loading.   
Static variables should be used to declare common property of all objects as only single copy is created and shared among all class objects, for example, the company name of employees etc.    
When a method is declared with static keyword then it is known as static method. These methods belong to the class rather than the object of the class. As a result, a static method can be directly accessed using class name without the need of creating an object.   
One of the basic rules of working with static methods is that you can't access a non-static method or field from a static method because the static method doesn't have an instance of the class to use  to reference instance methods of fields. Another restriction is, 'this' and 'super' cannot be used in static context.     
###### 9. What is the differences between overriding and overloading?    
Two methods can be called overloaded if they follow below rules: 1. Both have same method name. 2. Both have different arguments.    
If both methods follow above two rules, then they may or may not:   
1. Have different access modifier. 2. Have different return types. 3. Throw different checked or unchecked exceptions   
The overriding method of child class must follow below rules:   
1. It must have same method name as that of parent class method. 2. It must have same arguments as that of parent class method. 3. It must have either the same return type or covarient return type. 4. It must not throw broader checked exceptions. 5. It must not have a more restrictive access modifier.     

###### 10. What is the differences between super and this?    
super keyword is used to access methods of the parent class while this is used to access methods of the current class.   

###### 11. What is the Java load sequence?   
static block executes first, then instance block, and then constructor.   

###### 12. What is Polymorphism? And how Java implements it?   
Poly means many and Morph means forms. Polymorphism is the process in which an object or function takes different forms. There are 2 types of Polymorphism: Compile Time Polymorphism (Overloading) and Run Time Polymorphism (Overriding).   

###### 13. What is Encapsulation? How Java implements it? And why we need encapsulation?    
Encapsulation is a process of Binding data and methods within a class. Think of it like showing the essential details of a class by using the access control modifiers. So we can say that Encapsulation leads to the desired level of Abstraction.   

###### 14. What is Interface and what is abstract class? What are the differences between them?   
A class that is declared using "abstract" keyword is known as abstract class. It can have abstract methods as well as concrete methods.   
An interface in Java is a blueprint of a class. It has static constants and abstract methods. Interface specify what a class must do but not how to do.   
An interface is like defining a constract that is fulfilled by implementing classes. An interface is used to achieve full abstraction. All methods in an interface are public and abstract by default and all variables declared in an interface are constants. A class which implements an interface will have to provide implementation of all the methods that are defined in the interface. A class can implement more than one interface, this is how Java allows multiple inheritance.   

###### 16. What are Queue interface implementations and what are the differences and when to use what?   
LinkedList and PriorityQueue. LinkedList preserves the insertion order, PriorityQueue does not.  

