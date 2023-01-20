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

