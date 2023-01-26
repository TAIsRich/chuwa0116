1. Practice collection  
 In coding file
2. What is the checked exception and unchecked exception in Java, could you give one example?  
* checked exception: checked exceptions represent errors outside the control of the program. For example, the constructor of FileInputStream throws FileNotFoundException if the input file does not exist.
* unchecked exception: It reflects some error inside the program logic.
For example, if we divide a number by 0, Java will throw ArithmeticException:

3. Can there be multiple finally blocks?  
   There can only be one finally block, and it must follow the catch blocks. If the try block exits normally (no exceptions occurred), then control goes directly to the finally block. After the finally block is executed, the statements following it get control.
4. When both catch and finally return values, what will be the final result?  
   method will ultimately return value returned by finally block irrespective of value returned by catch block.
5. What is Runtime/unchecked exception? what is Compile/Checked Exception?  
   The Runtime Exception is the parent class in all exceptions of the Java programming language that are expected to crash or break down the program or application when they occur. Unlike exceptions that are not considered as Runtime Exceptions, Runtime Exceptions are never checked.  
   The Compile Exceptions are  checked by the compiler during the compilation process to confirm whether the exception is handled by the programmer or not. If not, then the system displays a compilation error.
6. What is the difference between throw and throws?  
   Both throw and throws are concepts of exception handling in Java. The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.
7. Run the below three pieces codes,Noticed the printed exceptions. why do we put the Null/Runtime
   exception before Exception?
   NullPointerException is a runtime exception in Java that occurs when a variable is accessed which is not pointing to any object and refers to nothing or null. Since the NullPointerException is a runtime exception, it doesn't need to be caught and handled explicitly in application code.
8. What is optional? why do you use it? write an optional example.  
   optional is used to represent a value that may or may not be present. We use it when an object can either contain a non-null value (in which case it is considered present) or it can contain no value at all (in which case it is considered empty).
9. Why finally always be executed?  
   The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs.
10. What is Java8 new features?
* forEach() method in Iterable interface. 
* default and static methods in Interfaces. 
* Functional Interfaces and Lambda Expressions. 
* Java Stream API for Bulk Data Operations on Collections. 
* Java Time API. 
* Collection API improvements. 
* Concurrency API improvements. 
* Java IO improvements.
11. What are the types of design patterns in Java ?  
    creational, structural, and behavioral
12. What are the SOLID Principles ?  
    SOLID principles are object-oriented design concepts relevant to software development.
13. How can you achieve thread-safe singleton patterns in Java ?
* Create the private constructor to avoid any new object creation with new operator. 
* Declare a private static instance of the same class. 
* Provide a public static method that will return the singleton class instance variable. If the variable is not initialized then initialize it or else simply return the instance variable.
14. What do you understand by the Open-Closed Principle (OCP) ?
    Objects or entities should be open for extension but closed for modification. This means that a class should be extendable without modifying the class itself.
15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.  
    Answer is 1.
16. Watch the design pattern video, and type the code, submit it to MavenProject folder
    singleton: https://www.bilibili.com/video/BV1Np4y1z7BU?p=22
    Factory: https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6 d9
    Builder: https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6 d9
    Publisher_Subscriber: https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f 7accf859bf7f6d9