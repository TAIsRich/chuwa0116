# HW4 chuwa 1.25 
2. ``What is the checked exception and unchecked exception in Java,could you give one example?``
   1. Checked exceptions are exceptions can be caught during the compile time, which must be either handled or specified the exception using the throws keyword. For example, ClassNotFoundException and IOException.
   2. Exceptions that are not checked under compile time. For example, RuntimeException and NullPointerException.
3. ``Can there be multiple finally blocks?``
   1. No, there can be only one.
4. ``When both catch and finally return values,what will be the final result?``
   1. Return values from the finally block.
5. ``What is Runtime/unchecked exception?what is Compile/Checked Exception?``
   1. **Runtime/unchecked exception**: An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.
   2. **Compile/Checked Exception**: A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions. These exceptions cannot simply be ignored at the time of compilation, the programmer should take care of (handle) these exceptions.
6. ``What is the difference between throw and throws?``
   1. We use the throws keyword to declare what exceptions we can throw from a method. The throw keyword, on the other hand, is mainly used to throw an exception explicitly within a block of code or a method. We can use the throws keyword in a method signature. It declares what exceptions a method can throw. 
   2. The throw keyword is used inside a function. It is used when it is required to throw an Exception logically, while the throws keyword is used in the function signature. It is used when the function has some statements that can lead to exceptions.
7. ``Run the below three pieces codes,Noticed the printed exceptions.why do we put the Null/Runtime exception before Exception ?``
   1. I think this can help the program to detect some run time error before entering the catch blockls.
8. `` What is optional?why do you use it?write an optional example.`` 
   1. Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present.
   2. Optional is generally used as a return type for methods that might not always have a result to return. 
```
import java.util.Optional;  
public class OptionalExample {  
    public static void main(String[] args) {  
        String[] str = new String[10];  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){ 
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("string value is not present");  
    }  
}  
```
9. ``Why finally always be executed?``
   1.  Because this can ensure that the finally block can be executed even some exceptions occur.
10. ``What is Java 8 new features?``
    1.  Default and static method
    2.  Lambda and functional interface
    3.  Optional
    4.  Stream api
    5.  Method reference
    6.  for each method
11. ``What are the types of design patterns in Java ?``
    1.  Aggregation, Composition, Singleton
12. ``What are the SOLID Principles ?``
    1.  S - Single-responsiblity Principle
    2. O - Open-closed Principle
    3. L - Liskov Substitution Principle
    4. I - Interface Segregation Principle
    5. D - Dependency Inversion Principle
13. ``How can you achieve thread-safe singleton patterns in Java ? ``
    1.  Create the instance variable at the time of class loading
    2.  Synchronize the getInstance() method
    3.  Use synchronized block inside the if loop and volatile variable
14. ``What do you understand by the Open-Closed Principle (OCP) ?``
    1.  The Open-Closed Principle (OCP) states that software entities (classes, modules, methods, etc.) should be open for extension, but closed for modification.
    2.  I think this can be achieved by composition or inheritance. It can allow the developer to change some function/behavior of the code without recompiling or editing it.
15. ``Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.``
    1. It mean that if the object of type A can do something,the object of typeB could also be able to perform the same thing
