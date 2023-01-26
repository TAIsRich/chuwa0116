1. See `Coding/hw4/collections`
2. What is the `checked exception` and `unchecked` exception in Java, could you give one example?
   1. `checked exception` is done at compile time: IO exception
   2. `unchecked exception` are those ones do not require force checked from the compiler: NullPointerException
3. Can there be multiple finally blocks?
   1. NO, and it must follow the catch blocks
4. When both catch and finally return values, what will be the final result?
   1. The statement will only return the value form the `finally` statement
5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
   1. Runtime exception are the ones that will only occur when the program is executed.
   2. Compile exception are the ones that will appear when the program is being compiled
      into the bytecode
6. What is the difference between throw and throws?
   1. `throw`: used inside a function, when it is required to throw an exception
   2. `throws`: used as a function signature, when a function has some statement 
        that could lead to some exception.
7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
   exception before Exception ?
   1. in the `try` block, the program could generate the exceptions that is not checked during
      compile time, the therefore putting them before the `checked exception` -> Exception
        can prevent those exceptions programmatically.
8. What is optional? why do you use it? write an optional example.
   1. Optional is a class that could be used to avoid Null checks and NullPointerExceptions
   2. Example
      ```java
      Employee optional = Optional.ofNullable(employee)
                .orElse(new Employee(1, "JCole", 30, 6666));
      System.out.println(optional);
      ``` 
9. Why finally always be executed ?
   1. Make sure the statements in the finally block always get executed.
10. What is Java 8 new features ?
    1. Default and static method in interface.
    2. lambda and Functional Interface
    3. Optional class
    4. Method Reference
    5. Stream API
11. What are the types of design patterns in Java ?
    1. Creational: Singleton, Factory, Abstract Factory
    2. Structural: Adapter, Composite, Proxy
    3. Behavioral: Template Method, Mediator
12. What are the SOLID Principles ?
    1. S - **S**ingle-responsibility: Every class should only have one responsibility
    2. O - **O**pen-closed: Software open for extension, closed for modification
    3. L - **L**iskov substitution: Being able to pass an objet of Class B (extends Class A) to a methods that 
       requires Class A
    4. I - **I**nterface segregation: Client should not be forced to use interface that they do not need
    5. D - **D**ependency inversion: Depend upon abstractions, not concretions.
13. How can you achieve thread-safe singleton patterns in Java ?
    1. synchronize the `getInstance()` method
14. What do you understand by the Open-Closed Principle (OCP) ?
    1. **It mean that if the object of type A can do something, the object of type B could also be able tp
        perform the same thing**
    2. It means that all the objects of type A could execute all the methods present in its subtype B     
    3. It means if a method is present in class A, it should also be present in class B so that the object of    
          type B could substitute object of type A.    
    4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same
15. Watch the design pattern video, and type the code, submit it to MavenProject folder