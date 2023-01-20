1. Write up Example code to demonstrate the three fundamental concepts of OOP.(referenceCodeDemo repo as example)
   * Please check folder `Coding/hw2-oop-concepts` for reference
2. What is **wrapper class** and why we need it in Java?
   * wrapper class provides a way to convert primitives to object and back.
   * primitive datatype are good when we only care about the value of the variable and
      make changes around it, but with wrapper class the primitive datatype would have more
      object-oriented appearance.
   * various methods in the wrapper class can provide more functionalities.
3. Difference between **HashMap** and **HashTable**?

   | HashMap                               | HashTable                            |
   |---------------------------------------|--------------------------------------|
   | No Method is Synchronized             | Methods are Synchronized             |
   | **Null** is allowed for key and value | **Null** is **Not** allowed for both |  
   | Not thread-safe                       | Thread-safe                          |
4. What is **String pool** and why do we need it?
   * **String pool** is a special storage place in Java heap memory,
     and whenever a new String is created, Java will first check the pool
     to see if the same string value is already there and will return the
     reference if it does, otherwise a new string value will be put into the 
     pool.
   * Java use String pool meanly to save memory space by increasing the 
      re-usability of the immutable strings.
5. What is Java **garbage collection**?
   * Garbage collection is a process in Java where the programs will perform 
    automatic memory managements. When Java program runs on the JVM, all the 
    objects will be created on heap in the memory space. After some time, 
    the garbage collector will identify objects which are no longer needed
    and will delete and free those memory space taken.
6. What are **access modifiers** and their scopes in Java?
   * The access modifiers are used to restrict the scope of a class,
    constructor, variable, method, or data member, see below for
    more detailed list
   
   | -------       |  Same Class  |  Same Package Subclass  |  Different Package subclass  |
   |---------------|:------------:|:-----------------------:|:----------------------------:|
   | **default**   |      Y       |            Y            |              N               |
   | **private**   |      Y       |            N            |              N               |
   | **protected** |      Y       |            Y            |              Y               |
   | **public**    |      Y       |            Y            |              Y               |
7. What is **final** key word?
   * **final** is a non-access modifier applied on field, method, and class
     * Field: prevent variable from being changed -> define a constant variable
     * Method: prevent method from being overridden
     * Class: prevent inheritance and make class immutable (e.g. Integer, String)
8. What is **static** key word? When do we usually use it?
   * **static** makes an field, method, class accessible without instantiating them.
     * Field: makes variable accessible without **new** keyword (e.g. MyClass.name)
     * Method: makes method accessible without **new** keyword (e.g. MyClass.speak())
     * Class: makes a static-nested class instantiable without **new** keyword 
       (e.g. `OuterClass.StaticClass staticClass = new OuterClass.StaticClass()`)
9. What is the difference between overriding and overloading?

    | Overloading                                 | Overriding                                      |
    |---------------------------------------------|-------------------------------------------------|
    | Happens at compile time                     | Happens at runtime                              |
    | Private and final methods can be overloaded | Private and final methods can NOT be overridden |
    | Performed in a class                        | Performed in a child class                      |
10. What's the difference between `super` and `this`?
    * `super`: used to access the methods and fields in the parent class, `super()`: constructor of the parent class
    * `this`: used to access the methods and fields at current class, `this()`: constructor of the current class
11. What is the java **load sequence**?
    * static block -> static variables -> constructor called
12. What is **Polymorphism**? And how Java implements it?
    * same object demonstrating various forms and behaviors, Java implements it by extending parent class and sharing
    the properties in it.
13. What is **Encapsulation**? And why we need encapsulation?
    * Is a method to bind data and methods together in a single unit.
    * By using encapsulation, we can have control over data hiding and decide which properties or methods we want to
    show outside this unit.
14. What is **Interface** and what is **abstract** class? What are the differences between them?
    * `abstract` class may have both abstract and non-abstract methods
    * `interface` defines what a class must do and leave the actual implementation empty
    
    | Interface                    | Abstract Class                              |
    |------------------------------|---------------------------------------------|
    | implements                   | extends                                     |
    | multiple inheritance allowed | multiple inheritance not allowed            |
    | have only abstract method    | can have both abstract or non-abstract ones |
15. Design a parking lot
16. What are Queue interface implementations and what are the differences and when to use what?
    * PriorityQueue: Ordering based on priority on a heap
    * LinkedList: implements a doubly linked list
    * ArrayDeque: implements queue based on array