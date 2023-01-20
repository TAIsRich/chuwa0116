##1.Write up Example code to demonstrate the three foundmental concepts of OOP.
##(reference Code Demo repo as example)
1. Encapsulation;
2. Polymorphism;    
3. Inheritance;
####Answer:
    The answer is in the Coding/coding1 folder.

##2. What is wrapper class in Java and Why we need wrapper class?
####Answer:
    The wrapper calss means "wrapping" basic data type into objects. This wrapper is for basic data type.
    Because Java is a high-level language for object-oriented programming, the wrapper types are designed to 
    address the problem that the basic data types cannot be object-oriented programmed. In addition, the wrapper
    class provides classification capabilities for basic data types. Most og these functions are related to conversion
    between basic values, such as binary, octal, and hexadecimal.

##3. What is the difference between HashMap and HashTable?
####Answer:
    THe differece is as following:
    1)Security:
            HashTable is thread-safe, and HashMap is not. The performance of HashMap is higher than that of HashTable.
            It is recommanded to use HashMap if there is no special requirement. In a multithread environment, if HashMap 
            is used, we need to use Collections.synchronizedMap() method to get a thread-safe collection. And the principle
            of implementing Collections.synchronizedMap() is Collections defines an inner class named SynchronizedMap, which 
            implements the Map interface, and when calling methods, uses synchronzied to ensure thread synchronization.
    2)Whether null can be used as a key:
            HashMap can use null as a key, but it is recommended to avoid doing so. When null is used as a key, it is always 
            stored on the first node of the table array. However, HashTable does not allow null as a key.
    3)About what has been inherited and achieved:
            HashMap inherits AbstractMap, and HashTable inherits Dictionary abstract class. And both implement Map interface.
    4)The default capcaity and how to expand it:
            HashMap has an initial capacity of 16, and HashTable has an initial capacity of 11, both with a fill factor of 0.75 
            by default. When increasing the capacity, HashMap change the capacity to original capacity * 2 each tme, and HashTable 
            changes to original capacity * 2 + 1 each time.
    5)support differnt types of traversal
            HashMap only supports Iterator traversals, and HashTable can support both Iterator and Emumerator traversal.


##4. What is String pool in Java and why we need String pool?
####Answer:
    The String pool in java is a pool of strings stored in the Java heap memory. 
    The main purpose of using String Pool is to save storage space. In general, java programs are distributed with a 
    large  number of string variables. And in java, String is immutable, so if the contents of strings are the same, there 
    is no need to create a new string object. Instead, we can just return the exsiting object, and this can save memory space.



##5. What is Java garbage collection?
####Answer:
    The role of Garbage collection(GC) in java is to free up the memory. Becasue the memory space is finite, every created object 
    and variable takes up memory. And GC is mainly responsible for determining what memory needs to be reclaimed, when the memory 
    should be recyceld, and how to recycle it. 
    

##6. What are access modifiers and their scopes in Java?
####Answer:
    Access modifiers in java are used to define access levels for variables, methods, and classes. Java provides
    four levels of access modifiers, which are private, public, protected, and default. 
    1)private: Declarations are visible within the class only. Only allowing to be accessed when creating variables 
                or methods in the class. The private member of a class can only be accessed by the class itself, not 
                by any other class(in or out of the same package).
    2)public:  Declarations are visible everywhere. The public calss can be accessed by any class.
    2)protected: Declarations are visible within the package or all subclasses. protected members can be accessed by 
                other classes in the same package. And if classes in other packages inherit 
                from the class, the class can also access protected members of the inherited class.
    3)default: Declarations are visible only within the package(package private). The default access modifier allows 
                variables, methods, or classes to be accessed by other classes in the same package. A package is a 
                collection of related classes in a file directory. 



##7. What is final key word? (Filed, Method, Class)
####Answer:
    The key word in Java means that the object is in its final form and it is immutable. When final is applied to variables, 
    methods, and classed, the measning of is different, but the essence is the samme. All of them mean that they cannot 
    be changed.
    1)Filed, Variable: used to define constants. And indicates that the variable is immutable once initialized. Immutable 
        means immutable for a primitive type variable and immutable for an object reference type variable.
    2)Method, used to prevent override
    3)Class, used to prevent inheritance, and make class immutable 



##8. What is static keyword? (Filed, Method, Class). When do we usually use it?
####Answer:
    The static keyword is a static modifier. The static keyword is mainly used for memory management. The static can be 
    used to modify variables, methods, blocks, and inner classes. The variables, methods, blocks, and inner classes applied
    static keyword belong to classes, not instances. This means that they are stored in the method area, instead of heap 
    in the memeory. And the keyword static makes it easy to call without creating an object, which can be accessed by the 
    class name directly. 
    1)Filed, Variable: static variables can be used for common properties of different objects with the same class. And 
                        static variables are only saved and copied once in the method area, which can improve the ultilization of memory
                        and save memory.
    2)Method: static methods belong to the class, rather than any object. And a static method can be called directly from 
                the class without creating an instance. Static methods can get static data, and modify their values. And 
                note that this and super can not be used in static methods. The methods of utility classes are generally 
                designed to be static. And non-static variables and non-static methods can not be called from a static method.
    3)Class: The normal calsses are not allowed to be declared static. Only the inner class can be declared static.


##9. What is the differences between overriding and overloading?
####Answer:
    1.overriding and overloading methods are different expressions of Java polymorphism. Overloading is static polymorphism,
        and overriding is dynamic polymorphism.
    2.Overriding is an expression of polymorphism between a parent class and a subclass, while overloading is an expression 
        of polymorphism with the same class.
    3.Overloading happens at the complie time, while overriding happens at the run time.
    4.Method overloading: private and final methods can be overloaded.
      Method overriding: private and final methods can not be overriden.
    5.In method overloading, arguments must be different, while in method overriding, arguments must be the same.

##10. What is the differences between super and this?
####Answer:
    super calls constructor of the parent class from a subclass, and this calls other methods in the same class. 
    Essentially, this is a pointer to this object, while super is a java keyword.

##11. What is the Java load sequence?
####Answer:
    1) In the case of no parent class, the loading sequence is: static member variable, static code block -> member 
        variable, code block -> constructor.
    2) If there is a parent class, the loading sequence is: static filed/ variable, static code block of the parent class
        -> static fileds/variables or static code block of subclass  -> common variables and code block of the parent class
        -> the superclass constructor is loaded -> variables or code block of subclass -> the subclass constructor is loaded.

##12. What is Polymorphism ? And how Java implements it ?
####Answer:
    1）In programming, Polymorphism refers to the same object exhibiting different forms and behaviors.
    2)To implement Polymorphism, it needs to meet the following conditions.
        1.Inheritance: there must be a subclass to inherit from the parent class.
        2.Override: a subclass needs to override some methods in its parent class, and then calls methods that the subclass
            overrides, instead of the original parent.
        3.Upward tarnsition: in Polymorphism, a refernce to a subclass needs to be assigned to a super calss object, so 
            that the reference can be equipped to call the methods both of the superclass and subclass. After upward 
            transition, the subclass overloads methods in the parent class.




##13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
####Answer:
    1)Encapsulation in java means to bind the data and the methods to manipulate that data together in a single unit(class).
        It hides some information of the class inside the class, and external programs are not allowed to access it directly.
        Instead, external programs can manipulate and access the hidden information via some meethods provided by the class.
    2) The implemention steps of  encapsulation include changing the property of the class to private, and creating 
        getter/setter methods to obtain and set data. And objects can only read and write data by calling these two methods.
    3)After creating an object of a class, we can use the "object.properties" to assign values to the properties of an object.
        Here the assignment operation is subject to the data type and storge range of the attribute. There are no other 
        constrains, but in practical problems, we often need to put additional constrains on attribute assignment. This 
        condition cannot be expressed when the property is declared. We can only add the condition through the method. At
        the same time, we need to prevent users from using "object.properties" again. In this way, the attribute needs to 
        be declared private. And encapsulation can bring a lot of advantagements. To be more specific, good encapsulation 
        reduces coupling, and the internal structure of the class can be modified freely. And the member variables of the 
        class can be controlled more precisely. Additionally, it can hide information, and realize more details.




##14. What is Interface and what is abstract class? What are the differences between them?
####Answer:
    1)Interface: it is an abstract type that requires a Class to implement specified methods so that objects of different 
                classes can communicate using the same interface. Interface is usually declared as interfaces, which can 
                contain only Method signatures and constant declarations(variable declarations include static and final).
                An interface does not contain method implementations(only definitions). Besides, interfaces can not be 
                instantiated, and a class that implements an interface must implement all methods described within the 
                interface.
        Abstract class: A method without a method body can by defined in a class by using the abstract keyword to define 
                        the abstract method. And the class that contains the abstract method can be defined as an abstract class.
                        In the object-oriented concept, all objects are represented by classes, but conversely, not all 
                        classes are represented by objects. If a class does not contain enough information to represent a 
                        concrete object, such a class is called abstract class. An abstract class can only be inherited, 
                        and can not be instantiated.
    2)difference:
        1.The most important difference is that the methods in interface must have no implemention and are absolutely 
            abstract methods. But abstract classes can have instance methods that implement default behavior.
        2.Variables declared in interface are final by default, while variables declared in abstract calss can be non-final.
        3. Members in interface are public by default, while in abstract class can be private, protected, etc..
        4.The interface is implemented by another class via the keyword implements, while abstract class is extended by another class 
            via the keyword extends.
        5.An interface can implement more than one interface, while an abstract class can extend another Java class and/or 
            implement multiple interfaces.
        6.Java classes can implement multiple interfaces, but only extend one abstract class.
        7.The Interface is slower than abstract class, because the interface requires additional indirect addressing.


##15. (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )
    1. If you have no ability to design it, please find the solution in internet, then understand it, and re-type
        it.(Do NOT just copy and paste)

##16. What are Queue interface implementations and what are the differences and when to use what?
###Answer:
    Queue is used to simulate a data structure called a queue, which is a first in and first out(FIFO) container.
    The common Queue interface implementations are as following:
        1)PriorityQueue: non-blocking, non-thread-safe, borderless, and supports priority queue implementation classes.
        2)ConcurrentLinkedQueue: non-blocking, thread-safe, borderless, the queue implementation class is based on
            linked nodes. And it is an appropriate choice when multiple threads are shared to access to a common collection.
            And null is not allowed in this queue.
        3)ArrayBlockingQueue: blocking, thread-safe, bounded, and immutable once created. It allows only one thread to be 
            queued or dequeued at the same time by using global exclusive locks, which is similar to adding synchronized 
            to methods.
        4)LinkedBlockingQueue: Blocking, thread-safe, optional bounded, an optional bounded blocking queue implementation
            class consisting of a linked list structure, with a capacity equals to Integer.MAX_VALUE, if not specified.
            since the inbound and outbound queues are two unfair exclusive locks, it is possible to have one thread enqueued
            and another one thread dequeued at the same time, which is actually a producer-consumer model.
        5)PriorityBlockingQueue: blocking, thread-safe, borderless, borderless blocking queue implementation class that 
            supports priority sorting.
        6)DelayQueue: blocking, thread-safe, borderless, unbounded blocking queue implementation classes implemented via 
            using priority queue, from which elements can be extracted only when the delay expires.
        7)SynchronousQueue: blocking, thread-safe, blocking queue implementation class with no data queues, no elements stored,
            and no internal capacity.
        8)LinkedBlockingDeque: Blocking, thread-safe, borderless, optional range bidirectional blocking queue implementation 
            class consisting of a linked list structure, with a capacity equaling to Integer.MAX_VALUE, if not specified.



