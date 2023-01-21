
1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)
   * Encapsulation: In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through public getter and setter.\
   The example can be seen in: Coding/hw2/encapsulation.\
   Variables are declared as privates. Each variable has a pair of setter and getter.

   * Polymorphism: Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.\
     The example can be seen in: Coding/hw2/polymorphism.\ In this example, animal can speak. Both cat and dog are animals, so they can speak. But they speak in different ways. When parent references are refer to different child classes, they speak in different way.

   * Inheritance: Child class acquires parent class's methods and fields.\
     The example can be seen in: Coding/hw2/inheritance.\
     Dog and Cat are created by inheriting from Animals. Dog and Cat acquire methods and variables from Animals. So they both can eat.
2.  What is wrapper class in Java and Why we need wrapper class?
    Java consists of objects. Java uses wrapper class to convert primitive data types into objects.\
    Autoboxing in wrapper class: Integer obj = Integer.valueOf(num);
    Unboxing in wrapper class: int num = obj.intValue();
3.  What is the difference between HashMap and HashTable?
    * HashMap is non-synchronized and not thread-safe. HashTable is synchronized and thread-safe. 
    * HashMap allows one null key and multiple null values. HashTable doesn't allow any null key or value.
4.  What is String pool in Java and why we need String pool?
    * String pool is a pool of Strings stored in heap.\
    * Strings are immutable in Java. Storing strings in a pool helps save space for java. When we use double quotes to create a String, it first looks for String with the same value in the String pool, if found it just returns the reference, else it creates a new String in the pool and then returns the reference.
5.  What is Java garbage collection?
    In C++, object needs to be free by ourselves. Java provided a mechanism to collect garbage automatically. Garbage collection in Java is the automated process of deleting code that’s no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers.
6.  What are access modifiers and their scopes in Java?
    * private: methods and variables are accessible within the class.
    * default: methods and variables are accessible within the same package.
    * protected: methods and variables are accessible within the same package and its sub classes.
    * public: methods and variables are accessible for everywhere in the program.
7.  What is final key word? (fields, Method, Class)
    * when final is used to decorated fields, it means these fields can't be modified.
    * when final is used to decorated methods, it means these methods can't be override.
    * when final is used to decorated classes, it means these classes can't be inherited.
8.  What is static keyword? (Field, Method, Class). When do we usually use it?
    * static field belongs to the class not concrete objects. It's initialized when the class is loaded. Static fields are used to information with all objects of this class.
    * static method belongs to the class not concrete objects. When methods want to access static fields, they need to be declared as static.
    * static class is used only for nested class. A static lass can access static methods and fields in the outer class. For non-static fields and methods, a static nested class can use them only through an object reference.\
      If you declare a member class that does not require access to an enclosing instance, always put the static modifier in its declaration, making it a static rather than a nonstatic member class.
    
9.  What is the differences between overriding and overloading?
    * Overriding happens between superclass and subclass. Subclass can override a method with the same signature as superclass.
    * Overloading happens between methods with the same name but different parameters in the same class.
    * Override and overload both provide polymorphism. Overriding implements runtime polymorphism. Overloading implements compile time polymorphism.

10. What is the differences between super and this?
    * super points to its parent class.
    * this points to the current class.
11.  What is the Java load sequence?
     The class loaders in the JVM are organized into a tree hierarchy, in which every class loader has a parent. Prior to locating and loading a class, a good practice for a class loader is to check whether the class’s parent can load—or already has loaded—the required class.
     The ClassLoader Delegation Hierarchy Model always functions in the order Application ClassLoader->Extension ClassLoader->Bootstrap ClassLoader.
12.  What is Polymorphism ? And how Java implements it ?
     * Polymorphism is the ability of an object to take on many forms. 
     * There are two kinds of polymorphism in java. Run-time polymorphism is implemented by override. When a parent class reference is used to refer to a child class object. Compile time polymorphism: In the same class, methods must have the same name and different signatures. 
13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
    * In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through public getter and setter.\
    * Implementation: declare all variables as private. provide public setter and getter to access variables.
14. What is Interface and what is abstract class? What are the differences between them?
    * An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.
    * An abstract class in Java is a template that stores the data members and methods that we use in a program.
    * Difference: 
      * interface only have final static variables. abstract can have non-final, non-static variables.
      * interface can't have constructor. abstract can have constructor.
      * interface only have abstract method. abstract class can have static and non-static methods.
15. (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )
If you have no ability to design it, please find the solution in internet, then understand it, and re-type
   it.(Do NOT just copy and paste)\
    1. The parking lot has multiple levels. Each level has multiple rows of spots. 
    2. The parking lot can park motorcycles, cars, and buses. 
    3. The parking lot has motorcycle spots, compact spots, and large spots. 
    4. A motorcycle can park in any spot. 
    5. A car can park in either a single compact spot or a single large spot. 
    6. A bus can park in five large spots that are consecutive and within the same row. It cannot park in small spots.
16. What are Queue interface implementations and what are the differences and when to use what?
    * PriorityQueue:  provides FIFO operations, but with order. Is a priority queue based on the heap data structure. This queue orders elements according to the order specified at construction time.
    * LinkedList: provides FIFO operations.  It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part.
    * ArrayDeque:  This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. 