## Homework2

Name: Zijun Zhou

### 1.Write up Example code to demonstrate the three foundmental concepts of OOP.
- Encapsulation:
```
class Car{
private int price;
private String brand;
public int getPrice(){
  return price;
}
public void setPrice(int price){
    this.price=price;
}    
public String getBrand(){
    return brand;
}
public void setBrand(String brand){
    this.brand=brand;
}
}
class CarTest{
 public static void main(String[] args){
    Car car=new Car();
    car.setPrice(30000);
    car.setBrand("Toyota");
 }
}
```
- Polymorphism:
```
interface Vehicle{
 void startEngine();
}
class Car implements Vehicle{
    private String brand;
    private int price;
    public void startEngine(){
        System.out.println("Car's way of starting engines");
    }
}
class Bicycle implements Vehicle{
    private int price;
    private String mode;
    public void startEngine(){
        System.out.println("Bicycle's way of starting engines");
    }
}
class Tests{
  public static void main(String[] args){
    Vehicle car = new Car();
    Vehicle bicycle = new Bicycle();
    car.startEngine();
    bicycle.startEngine();
 }
}

```
- Inheritance:
```
class Car{
    private String brand;
    private int price;
    public void startEngine(){
        System.out.println("Car's way of starting engines");
    }
}
class Telsa extends Car{
    private int powerRemaining;
    public void startCharging(){
        System.out.println("Telsa is now being charged");
        ++powerRemaining;
    }
}
```

### 2. What is wrapper class in Java and Why we need wrapper class? 
Wrapper class is the class which contains the primitive type in its fields.
Why? Because Java is an OOP language, using wrapper class would enable us to treat the primitive types as objects, and sticks with the idea of OOP.

### 3.  What is the difference between HashMap and HashTable?
The differences between HashMap and HashTable are as follows:
- HashMap is not thread-safe and non-synchronizd, however, hashtable is thread-safe and synchronized.
- HashMap allows one null key and values can be null whereas HashTable doesn't allow null key or value.
- HashMap is faster than HashTable.
- HashMap iterator is fail-safe where HashTable iterator is not fail-safe.
- HashMap extends AbstractMap class where HashTable extends Dictionary class.

### 4. What is String pool in Java and why we need String pool? 
String Pool is a space in Java Heap memory which is responsible for storing the string literals
Why:
Because this could help the system save memory, because we do not need to reinitialize a new object whose content is the same, we just reuse the
existing one

### 5. What is Java garbage collection? 
Garbage collection in Java is the automated process of deleting code that's no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers. 

### 6. What are access modifiers and their scopes in Java?
- public: methods of the same class, and methods of other classes
- private: methods of the same class only
- protected: methods of the same class, methods of subclasses, and methods of subclasses in the same package
- default: methods in the same package only

### 7. What is final key word? (Field, Method, Class)
final in Field means that this field could not be modified or changed
final in method means that this method could not be overriden
final in class means that this class does not have its subclasses, and could not be extended

### 8. What is static keyword? (Field, Method, Class). When do we usually use it?
static field: the fields declared as static would be shared among all the instances of the same class
static method: this is the method belonging to the class
static class: this is the inner nested class, and is created after relevant outer class is created
If we are trying to implement a method, create a field or class that is not related to the specific state, then we could switch to use static ones.

### 9. What is the differences between overriding and overloading?
Actually, overriding is frequently used in the case of extending a parent class or implementing a interface. Overriding methods would have same method signatures. However, overloading typically occurs in the same class, and they have different parameters in contrast to overriding

### 10. What is the differences between super and this?
super in Java is used to refer to methods, static and instance variables, constructors of an immediate parent class. this in Java is used to refer to methods, static and instance variables, constructors of a current class.

### 11. What is the Java load sequence?
- The static code block or segment in the parent class
- The static code block or segment in the child class
- The ordinary variable and code block in the parent class
- The constructor in parent class
- The ordinary variables and code block in the child class
- The constructor in child class

### 12. What is Polymorphism ? And how Java implements it ?
Polymorphism in Java is the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method.
How: Actually, in Java, you can first write an interface or abstract class, and then write different classes extend the abstract class or implement the interface, and you could use the interface or abstract class type to refer to the actual type object, then even if you invoke the methods whose names are the same, they could behave differently
### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation? 
The encapsulation means the bundling of fields and methods inside a single class. In Java, we could hide all the fields of a class by declared them as private, and then expose users with the secure modification methods. Encapsulation is actually hiding the important information, protect them from the outside world, which ensures the security of data.
### 14. What is Interface and what is abstract class? What are the differences between them?
Interface is a code contract, which would require a concrete class to implement the interface. Abstract class is more like a normal class, and it could contain the normal method just like the normal class, but it could also contain the abstract method which would be overriden by its subclasses. 
Differences:
- Interfaces could not include states, while abstract classes could have states
- A class could implement more than one interface, however, they could only extend one abstract class.
### 16. What are Queue interface implementations and what are the differences and when to use what?
Queue interface has LinkedList and PriorityQueue as its implementations, 
Differences: 
LinkedList actually does not maintain the elements in order, however, we could add elements to the head, or to the tail
PriorityQueue performs the heap sort every time an element is inserted, and by default the top element of the heap is the smallest element, and we could modify this by passing in a comparator object to make it become big heap
LinkedList should be used when you require a queue in which the last inserted element would go last.
However, PriorityQueue could tell you the smallest element among a set of data, if you pop one element out, it could tell the second smallest element, etc.