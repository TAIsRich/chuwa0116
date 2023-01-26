#hw4

## Q1
refer Coding/Collections

## Q2 What is the checked exception and unchecked exception in Java, could you give one example?
Checked exceptions are exceptions that are checked at compiled time,
but unchecked exceptions are exceptions that did not handled well during run time.
For example, IO exceptions are checked exceptions and NullPointerException are run time exceptions.

## Q3 Can there be multiple finally blocks?
There can only be one finally block

## Q4 When both catch and finally return values, what will be the final result?
If both catch and finally return, the receiving method will get the returned value from the finally block.

## Q5 What is Runtime/unchecked exception? what is Compile/Checked Exception?
Unchecked exceptions are runtime exceptions that are not required to be caught or declared in a throws clause. 
These are the exceptions that are checked at compile time. If some code within a method throws a checked exception, 
then the method must either handle the exception or it must specify the exception using the throws keyword

## Q6 What is the difference between throw and throws?
Both throw and throws are concepts of exception handling in Java. The throws keyword is used to declare which exceptions
can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

## Q7 Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
Because Null/Runtime is a more specific exception, if we put it in the end, then it is unreachable; the exception is already
caught by the most general Exception.

## Q7 What is optional? why do you use it? write an optional example.

## Q8 Why finally always be executed ?
The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs. But finally is useful for more than just exception handling — it allows the programmer to avoid having cleanup code accidentally bypassed by a return, continue, or break. Putting cleanup code in a finally block is always a good practice, even when no exceptions are anticipated.

## Q9 What is Java 8 new features ?
1. forEach() method in Iterable interface
2. default and static methods in Interfaces
3. Functional Interfaces and Lambda Expressions
4. Java Stream API for Bulk Data Operations on Collections

## Q10 What are the types of design patterns in Java ?
Java design patterns are divided into three categories - creational, structural, and behavioral design patterns.

## Q11 What are the SOLID Principles ?
- The Single Responsibility Principle
  - A class should do one thing and therefore it should have only a single reason to change.
- The Open-Closed Principle
  - classes should be open for extension and closed to modification.
- The Liskov Substitution Principle
  - subclasses should be substitutable for their base classes.
- The Interface Segregation Principle
  - Segregation means keeping things separated, and the Interface Segregation Principle is about separating the interfaces
  - The principle states that many client-specific interfaces are better than one general-purpose interface. Clients should not be forced to implement a function they do no need.
- The Dependency Inversion Principle
  - The Dependency Inversion principle states that our classes should depend upon interfaces or abstract classes instead of concrete classes and functions.

## Q12 How can you achieve thread-safe singleton patterns in Java ?
1. Create the instance variable at the time of class loading. 
2. Synchronize the getInstance() method.
3. Use synchronized block inside the if loop and volatile variable

## Q13 What do you understand by the Open-Closed Principle (OCP) ?
We should be able to add new functionality without touching the existing code for the class. This is because whenever we modify the existing code, we are taking the risk of creating potential bugs. So we should avoid touching the tested and reliable (mostly) production code if possible.

## Q14 Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
It means that all the objects of type A could execute all the methods present in its subtype B

## Q15 Watch the design pattern video, and type the code, submit it to MavenProject folder
refer Maven/










