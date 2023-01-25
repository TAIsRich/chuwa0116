### What is the checked exception and unchecked exception in java, could you give one example?
* A checked exception(eg. FileNotFound) is caught at compile time whereas a runtime or unchecked exception(eg. NullPointerException) is, as it states, at runtime
Checked 

### Can there be multiple finally blocks?
* No
### When both catch and finally return values, what will be the final result?
* The value in *fianlly* block will be returned.
### What is Runtime/unchecked exception? What is Compile/Checked Exception?
* A compile-time error generally refers to the errors that correspond to the semantics or syntax. A runtime error refers to the error that we encounter during the code execution during runtime
### What is the difference between throw and throws?
* The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code
### Why put the Null/Runtime exception before Exception?
Because *catch* scope should be from small to large
### What is optional? why do you use it? write an optional example
* **Optional** is used to represent a value that may or may not be present.  
* **Optional** is generally used as a return type for methods that might not always have a result to return  
* For example, a method that looks up a user by ID might not find a match, in which case it would return an empty Optional. 
### Why is finally always executed?
* This ensures that the *finally* block is executed even if an unexpected exception occurs.
### What is Java 8 new features

### What are the types of design patterns in Java?
* Aggregation and Composition
* Singleton

### What are the SOLID principle.
* Single Responsibility Principle (SRP)
* Open-Close Principle (OCP)
* Liskov Substitution Principle (LSP)
* Interface Segregation Principle (ISP)
* Dependency Inversion Principle (DIP)

### How can you achieve thread-safe singleton patterns in Java?
* static volatile variable
* make constructor **private**
* **static** synchronized **getInstance** method
* make sure thread-safe

### What do you understand by the Open-Closed Principle(OCP)?
* In object-oriented programming, the open–closed principle (OCP) states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification

### Liskov's substitution principle states that if class B is a subtype of class A , then object of type of A may be substitued with any object of type B. What does this actually mean? 
* It means that if the object of type A can do something, the object of type B could also be able to perform the same.
