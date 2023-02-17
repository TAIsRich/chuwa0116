
### 1.Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo
repo as example)

```
 class Animal{
    private String type;
    private String name;
    private String gender;
    public Animal(String type,String name,String gender){
        this.type=type;
        this.name=name;
        this.gender=gender;
    }
    public void make_sound(String name){
        System.out.println("my name is "+name);
    }
    public String get_type(){
        return type;
    }
    public String get_name(){
        return name;
    }
    public String get_gender(){
        return gender;
    }
    public void set_type(String NewType){
        type=NewType;
    }
    public void set_name(String NewName){
        name=NewName;
    }
    public void set_gender(String NewGender){
        gender=NewGender;
    }
    
}
class Cat extends Animal{
    public Cat(String type,String name,String gender){
        super(type,name,gender);
    }
    @Override
    public void make_sound(String s){
        System.out.println("My name is "+s+" Meow!");
    }
}
```

### 2. What is wrapper class in Java and Why we need wrapper class?
The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive
why need wrapper class:
+ So that a null value is possible
+ To include in a Collection
+ To treat generically / polymorphically as an Object along with other Objects

### 3. What is the difference between HashMap and HashTable?
+ HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code. Hashtable is synchronized. It is thread-safe and can be shared with many threads.
+ HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
+ HashMap is generally preferred over HashTable if thread synchronization is not needed.

### 4. What is String pool in Java and why we need String pool? 
String Pool in Java is a special storage space in Java Heap memory where string literals are stored.
Whenever a string literal is created, the JVM first checks the String Constant Pool before creating a new String object corresponding to it.

### 5. What is Java garbage collection
Garbage collection in Java is the automated process of deleting code that’s no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers.  

### 6.  What are access modifiers and their scopes in Java?
Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. 
+ Private: We can access the private modifier only within the same class and not from outside the class.
+ Default: We can access the default modifier only within the same package and not from outside the package. And also, if we do not specify any access modifier it will automatically consider it as default.
+ Protected: We can access the protected modifier within the same package and also from outside the package with the help of the child class. If we do not make the child class, we cannot access it from outside the package. So inheritance is a must for accessing it from outside the package.
+ Public: We can access the public modifier from anywhere. We can access public modifiers from within the class as well as from outside the class and also within the package and outside the package

### 7.  What is final key word? (Field, Method, Class)
The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).
+ Field: Final fields can be either constants or write-once fields.
+ Method: Methods marked as final cannot be overridden.
+ Class: Classes marked as final can’t be extended

### 8. What is static keyword? (Filed, Method, Class). When do we usually use it?
The keyword static means that the particular member belongs to a type itself, rather than to an instance of that type. 
+ Field: when we declare a field static, exactly a single copy of that field is created and shared among all instances of that class
+ Method: static methods also belong to a class instead of an object. So, we can call them without creating the object of the class in which they reside. Static methods can't be overridden.
+ Class: static nested classes behave exactly like any other top-level class, but are enclosed in the only class that will access it, to provide better packaging convenience.

### 9 What is the differences between overriding and overloading
+ Overloading: 	
    - Implements “compile time polymorphism”.
    - The method call is determined at compile time
    - Occurs between the methods in the same class
    - Have the same name, but the parameters are different
    - On error, it can be caught at compile time

+ Overriding:

    - Implements “runtime polymorphism”
    - The method call is determined at runtime based on the object type
    - Occurs between superclass and subclass
    - Have the same signature (name and method arguments)
    - On error, the effect will be visible at runtime
  

### 10 What is the differences between super and this?
In java, super keyword is used to access methods of the parent class while this is used to access methods of the current class

### 11.  What is the Java load sequence?
Loading, Linking, and Initializing

### 12. What is Polymorphism ? And how Java implements it ?
In Java, polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method.
Java implements it using function overriding and overloading.

### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation? 
Encapsulation refers to the bundling of fields and methods inside a single class
Java implements encapsulation using Getter and Setter methods.
Encapsulation helps us to keep related fields and methods together, which makes our code cleaner and easy to read.

### 14.   What is Interface and what is abstract class? What are the differences between them?
 Interfaces are a kind of code contract, which must be implemented by a concrete class.
 Abstract classes are similar to normal classes, with the difference that they can include abstract methods, which are methods without a body.
 Interfaces have no access modifiers, abstract classes can have access modifiers
+ Consider using abstract classes if :
    - You want to share code among several closely related classes.
    - You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
    - You want to declare non-static or non-final fields.



+ consider using interfaces if:

    - You expect that unrelated classes would implement your interface. For example,many unrelated objects can implement Serializable interface.
    - You want to specify the behaviour of a particular data type, but not concerned about who implements its behaviour.
    - You want to take advantage of multiple inheritance of type.
  
### 16. What are Queue interface implementations and what are the differences and when to use what?
The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. The
most common classes are PriorityQueue and LinkedList. PriorityQueue in java is a min heap by default. LinkedList implements the FIFO queue in data structure. 


  









