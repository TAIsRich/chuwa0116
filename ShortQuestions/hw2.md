#hw2
### 1 Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)
#### Encapsulation
```java
class Encapsulate {
	private String personName;
	private int personAge;
	public int getAge() { return personAge; }
	public String getName() { return personName; }
	public void setAge(int newAge) { personAge = newAge; }
	public void setName(String newName){ personName = newName;}
}
public class TestEncapsulation {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();
		obj.setName("Samuel");
		obj.setAge(24);

		System.out.println("Person's name: " + obj.getName());
		System.out.println("Person's age: " + obj.getAge());
	}
}
```
#### Polymorphism
Overload
```java
public class Sum {
    public int sum(int x, int y) { return (x + y); }
    public double sum(double x, double y) { return (x + y); }
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10.5, 20.5));
    }
}
```

Override
```java
class Parent {
    void show()
    {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void show()
    {
        System.out.println("Child");
    }
}
class Main {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.show();
        Parent obj2 = new Child();
        obj2.show();
    }
}
```

#### Inheritance
``` java
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
        System.out.println("Salary : " + E1.salary  + "\nBenefits : " + E1.benefits);
    }
}
```

### 2 What is wrapper class in Java and Why we need wrapper class?
```
Wrapper classes provide a way to use primitive data types ( int , boolean , etc..) as objects.
The primitive data types in java are not objects, by default. They need to be converted into objects using wrapper classes.
```

### 3 What is the difference between HashMap and HashTable?
```
1. HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
3. HashMap is generally preferred over HashTable if thread synchronization is not needed.
```

### 4 What is String pool in Java and why we need String pool?
```
String Pool in Java is a special storage space in Java Heap memory where string literals are stored.
String Pool can help to decrease the number of string objects created in the memory.
```

### 5  What is Java garbage collection?
```
Garbage collection in Java is the automated process of deleting code that's no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers.
```

### 6 What are access modifiers and their scopes in Java?
```
Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.
1. Private: We can access the private modifier only within the same class and not from outside the class.
2. Default: We can access the default modifier only within the same package and not from outside the package.
3. Protected: We can access the protected modifier within the same package and also from outside the package with the help of the child class.
4. Public: We can access the public modifier from anywhere.
```

### 7 What is final key word? (Filed, Method, Class)
```
Final variables cannot be changed.
Final methods cannot be override.
Final class cannot be inherited.
```

### 8 What is static keyword? (Filed, Method, Class). When do we usually use it?
Static variables: only one instance will be created and shared between objects.
Static methods: can be directly called using class name
Static class: only one instance will be created and shared between objects.

Static keywords are useful to efficiently manage memory. If we want to access variables or methods inside a class, we first need to create an instance or object of that class.

### 9 What is the differences between overriding and overloading?
```
1. Method overloading is a example of compile time polymorphism. Whereas method overriding is a example of run time polymorphism.
2. In the method overloading, inheritance may or may not be required. Whereas in method overriding, inheritance always required.
3. Method overloading is performed between methods within the class. Whereas method overriding is done between parent class and child class methods.
4. In the method overloading, methods or functions must have the same name and different signatures. Whereas in the method overriding, methods or functions must have the same name and same signatures.
```

### 10 What is the differences between super and this?
```
In java, super keyword is used to access methods of the parent class while this is used to access methods of the current class.
```

### 11 What is the Java load sequence?
```
The static blocks are executed first, followed by constructors and then the instance methods.
```

### 12 What is Polymorphism ? And how Java implements it ?
```
Polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method.

Polymorphism in Java can be achieved in two ways, method overloading and method overriding.
```

### 13 What is Encapsulation ? How Java implements it? And why we need encapsulation?
```
Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit. In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.
In java, we can set variables private and use getter and setter to change them.
Encapsulation is a way to restrict the direct access to some components of an object, so users cannot access state values for all of the variables of a particular object. And encapsulation in Java provides an option of code-reusability.
```

### 14 What is Interface and what is abstract class? What are the differences between them?
```
An Interface is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.
An abstract class in Java is one that is declared with the abstract keyword.
Differences:
1. Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods
2. A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.
3. An interface can extend one or more Java interfaces; an abstract class can extend another Java class and implement multiple Java interfaces.
```

### 16 What are Queue interface implementations and what are the differences and when to use what?
```
LinkedList and PriorityQueue.
The difference between PriorityQueue and Linkedlist is at the time of insertion. PriorityQueue will be sorted as well as ordered as per the natural order but we can add a Commparator also in order to define the particular order of sorting for a record, while as LinkedList will be just ordered.
So while we are trying to add elements in PriorityQueue, they will get sorted on the basis of their natural order or as per the comparator function.
```
