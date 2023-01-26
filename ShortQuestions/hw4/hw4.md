### 2. What is the checked exception and unchecked exception in Java, could you give one example?

- Checked exception: 必须捕获的异常，包括Exception及其子类，但不包括RuntimeException及其子类，这种类型的异常称为Checked Exception
- UncheckedException: 不需要捕获的异常，包括Error及其子类，RuntimeException及其子类。


### 3. Can there be multiple finally blocks

No, only one finally block followed with the catch blocks.


### 4. When both catch and finally return values, what will be the final result?

If both catch and finally return, the receiving method will get the returned value from the finally block


### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?

runtime/unchecked exception: 
- An unchecked exception is an exception that occurs at the time of execution. 
- These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. 
- Runtime exceptions are ignored at the time of compilation.

compile/checked exception: 
- These are the exceptions that are checked at compile time. 
- If some code within a method throws a checked exception, 
- then the method must either handle the exception or it must specify the exception using the throws keyword.


### 6. What is the difference between throw and throws
the **throws** keyword is used to declare which exceptions can be thrown from a method, 
while the **throw** keyword is used to explicitly throw an exception within a method or block of code.

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
Catch scope should be from small to large.
### 7. What is optional? why do you use it? write an optional example
To avoid Null checks and run time NullPointerExceptions


### 8. Why finally always be executed ?
A finally block is always get executed whether the exception has occurred or not. If an exception occurs like closing a file or DB connection, then the finally block is used to clean up the code. We cannot say the finally block is always executes because sometimes if any statement like System.

### 9. What is Java 8 new features ?
- stream API 
- lambda expressions and 
- functional interfaces

### 10. What are the types of design patterns in Java ?

Creational, structural, and behavioral design patterns

### 11. What are the SOLID Principles ?

- Single Responsibility Principle (SRP)
- Open-Close Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)


### ! 12. How can you achieve thread-safe singleton patterns in Java ?
- using Static field Initialization
- private constructor makes impossible to create another instance, except one case

### ! 13. What do you understand by the Open-Closed Principle (OCP)
"software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.

### ! 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B
if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A




