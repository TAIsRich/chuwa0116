2. What is the checked exception and unchecked exception in Java, could you give one example?

    In broad terms, a checked exception (also called a logical exception) in Java is something that has gone wrong in your code and is potentially recoverable. For example, if there's a client error when calling another API, we could retry from that exception and see if the API is back up and running the second time.
    eg: For example, if a developer tries to access a file, the Java IO library forces them to deal with the checked FileNotFoundException.
    
    An unchecked exception is a programming error and are fatal, whereas a checked exception is an exception condition within your codes logic and can be recovered or retried from.

    eg: If a program throws an unchecked exception, it reflects some error inside the program logic. For example, if we divide a number by 0, Java will throw ArithmeticException: 

3. Can there be multiple finally blocks?

    There can only be one finally block, and it must follow the catch blocks. If the try block exits normally (no exceptions occurred), then control goes directly to the finally block. After the finally block is executed, the statements following it get control.

4. When both catch and finally return values, what will be the final result?

    If both catch and finally return, the receiving method will get the returned value from the finally block.

5. What is Runtime/unchecked exception? what is Compile/Checked Exception?

    An unchecked exception (also known as an runtime exception) in Java is something that has gone wrong with the program and is unrecoverable. Just because this is not a compile time exception, meaning you do not need to handle it, that does not mean you don't need to be concerned about it

    A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions. These exceptions cannot simply be ignored at the time of compilation, the programmer should take care of (handle) these exceptions.

6. What is the difference between throw and throws?

    Both throw and throws are concepts of exception handling in Java. 
    The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code


7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?

    Because small to big logic, Null/Runtime scope is smaller than Exception, we should catch smaller first.

8. What is optional? why do you use it? write an optional example.

    Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present. In other words, an Optional object can either contain a non-null value (in which case it is considered present) or it can contain no value at all (in which case it is considered empty).
    
    ```
        import java.util.Optional;  
        public class OptionalExample {  
            public static void main(String[] args) {  
                String[] str = new String[10];  
                Optional<String> checkNull = Optional.ofNullable(str[5]);  
                if(checkNull.isPresent()){  // check for value is present or not  
                    String lowercaseString = str[5].toLowerCase();  
                    System.out.print(lowercaseString);  
                }else  
                    System.out.println("string value is not present");  
            }  
        }  
    ```

9. Why finally always be executed ?

    The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs.

10. What is Java 8 new features ?

        forEach() method in Iterable interface

        default and static methods in Interfaces

        Functional Interfaces and Lambda Expressions

        Java Stream API for Bulk Data Operations on Collections

        Java Time API

        Collection API improvements

        Concurrency API improvements

        Java IO improvements

11. What are the types of design patterns in Java ?

    Java design patterns are divided into three categories - creational, structural, and behavioral design patterns.

12. What are the SOLID Principles ?

    SOLID is an acronym for the first five object-oriented design (OOD) principles.

    S - Single-responsiblity Principle
    O - Open-closed Principle
    L - Liskov Substitution Principle
    I - Interface Segregation Principle
    D - Dependency Inversion Principle

13. How can you achieve thread-safe singleton patterns in Java ?
    Create the private constructor to avoid any new object creation with new operator.

    Declare a private static instance of the same class.

    Provide a public static method that will return the singleton class instance variable. If the variable is not initialized then initialize it or else simply return the instance variable.

14. What do you understand by the Open-Closed Principle (OCP) ?

    In object-oriented programming, the open–closed principle (OCP) states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.

15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
    1. It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing
