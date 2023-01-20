#### 1. Write up Example code to demostrate the three fundmental concepts of OOP
* Encapsulation
```
 class EncapTest{
    private String name;
    
    public void set_name(String name){
        this.name=name;
    }
    public String get_name(){
        return this.name;
    }
}
```

* Polymorphism
```
 class PolyTest{
    private String str1;
    private String ste2;
    private int num1;
    private int num2;
    
    public String add(String a,String b){
        return a+b;
    }
       
    public int add(int a,int b){
        return a+b;
    } 
}
```
* Inheritance
```
class car{
    private String type;
    car(String type){
        this.type=type;
    }
    
    public String get(){
        return this.type;
       }
}

class Honda extends car{
    private String make;
    car(String make,String type)
    {
    super(type);
    this.make;
    }
    
    public show()
    {
        System.out.println(get()+","+make);
    }
}
```

#### 2.What is wrapper class in Java and Why we need wrapper class?
Wrapper classes provide a way to use primitive data types as objects  
Wrapper classes helps Java be completely object-oriented.
#### 3. What is the difference between HashMap and HashTable?
* HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
* HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.

#### 4. What is String pool in Java and why we need String pool?
String Pool in Java is a special storage space in Java Heap memory where string literals are stored.  
To decrease the number of strings created in the memory and save memory.
#### 5. What is Java garbage collection?
Garbage collection in Java is the automated process of deleting code that's no longer needed or used.
#### 6. What are access modifiers and their scopes in Java?
Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class  
public, protected, default, and private
#### 7. What is final keyword? (Filed, Method, Class)
* If you make any variable as final, you cannot change the value of final variable
* If you make any method as final, you cannot override it.
* If you make any class as final, you cannot extend it.
#### 8. What is static keyword? (Filed, Method, Class). When do we usually use it
* When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level
* When a method is declared with the static keyword, it is known as the static method
*
A static class is a class that is created inside a class, is called a static nested class in Java
#### 9. What is the differences between overriding and overloading?
* Overloading is done in same class while overriding is implemented in derived classes
* Overloading happens at compile time while overriding happens at runtime
* Arguments must be different in case of overloading while they must be same for overriding
#### 10. What is the differences between super and this?
this keyword points to the class itself while keyword super points to the father class
#### 11. What is the Java load sequence?
static variable/block -> constructor
#### 12. What is Polymorphism? And how Java implements it?
In Java, polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method.  
It is implemented by inheritance and overriding
#### 13. What is Encapsulation? How Java implements it? And why we need encapsulation?
Encapsulation in Java is a powerful mechanism for storing the data members and data methods of a class together. It is done in the form of a secure field accessible by only the members of the same class.  
It is implemented by the modifiers in the class.
#### 14. What is Interface and what is abstract class? What are the differences between them?
A class that contains an abstract keyword on the declaration is known as an abstract class. It is necessary for an abstract class to have at least one abstract method.  
An interface is a sketch that is useful to implement a class. The methods used in the interface are all abstract methods.
* An abstract class can contain both abstract and non-abstract methods while interface contains only abstract methods
* A class can only inherit one abstract class but many interfaces
#### 16 What are Queue interface implementation and what are the differences and when to use what?