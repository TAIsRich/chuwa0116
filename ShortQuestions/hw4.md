## 3. Can there be multiple finally blocks? 
> There can only be one finally block, and it must follow the catch blocks.

## 4. When both catch and finally return values, what will be the final result?
> finally return will be the final result

## 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
- An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.

- A checked exception is a type of exception that must be either caught or declared in the method in which it is thrown. For example, the java.io.IOException is a checked exception. These exceptions cannot simply be ignored at the time of compilation, the programmer should take care of (handle) these exceptions.

## 6. What is the difference between throw and throws？
> The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.



## 7. What is optional? why do you use it? write an optional example.


## 8. Why finally always be executed ?
> The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs.


## 9. What is Java 8 new features 
- Permanent Generation

- Parallel Array Sorting
- Base64 encoding and decoding
- Date & Time API
- Functional Interfaces
- Lambda expressions

## 10. What are the types of design patterns in Java
> Java design patterns are divided into three categories - creational, structural, and behavioral design patterns

## 11. What are the SOLID Principles ?
- Single Responsibility Principle (SRP)

- Open-Close Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)


## 12. How can you achieve thread-safe singleton patterns in Java?
## 13. What do you understand by the Open-Closed Principle (OCP) 