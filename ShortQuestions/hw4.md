##1. Practice collection
####Answer:
    in the CodingforCollections folder.

##2.What is the checked exception and unchecked exception in Java, could you give one example?
####Answer:
    1)Checked Exception are exceptions that must be handled properly in the code, and the compiler forces the developer
    to handle them, otherwise the compilation will fail. Developers can catch these exceptions using a catch statement 
    or throw the Exception using the throws statement at the method declaration. However, Unchecked Exceptions do not 
    have to be caught or thrown.
    2)checked exception: for example, IOException, before we read/write to a file, we need to check if this file exists. 
    If this file does not exist, the system will throw the IOException(FileNotFound). And Unchecked Exception is caused 
    by programmers who do not perform the required checks, for example, NullPointerException(NPE).    
    

##3.Can there be multiple finally blocks?
####Answer:
    No. finally can only be used once with a try or try-catch block. 


##4. When both catch and finally return values, what will be the final result?
####Answer:
    The final result will be values from finally block;
    


##5.What is Runtime/unchecked exception? what is Compile/Checked Exception?
####Answer:
    1)Runtime/unchecked exception: Runtime exception is that the compiler does not require to be forced to handle. It refers
    to a logical error in programming and is an exception that programmers should actively avoid. the Java.Lang.RuntimeException 
    class and its subclasses are all runtime exception. The feature of it is that the compiler will not to check it. When such
    unusual has happened in the program, the program can still compile(runtime may be an error).
    2)Compile/Checked Exception: An compile exception requires must be handled. The general exception caused by 
    external factors when the program is running, The compile requires that Java programs must catch or declared all 
    compile-time exceptions. The characteristics of compile exception is that the Java compiler will check for them. If there 
    is an exception, the exception must be handled, otherwise, the program will not be able to compile.


##6.What is the difference between throw and throws?
####Answer:
    The throw statement is used in a method body to throw an exception, which is handled by the statement in the method body.
    The throws statement is used after the method declaration to indicate the exception is thrown, which is handled by the caller
    of the method.

##7.Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
##exception before Exception ?
####Answer:
    1)the result of the first piece code:
        java.lang.ArithmeticException: / by zero at Main.main(Main.java:7)
        End ...
    2)the result of the second piece code:
        java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s" is null at Main.main(Main.java:27)
        End ...
    3)the result of the third piece code:
        java.lang.RuntimeException at Main.main(Main.java:47)
        End ...
    The reason is that the catch scope should be from small to large. Because the exception includes null/runtime exception
    and compile time exception, its scope is larger than the null/runtime exception.
    

##8.What is optional? why do you use it? write an optional example.
####Answer:
    1)The Optional class is a container object that can be null. Optional is introduced to address 
    NullPointerExceptions. 
    2)Example: Integer value1 = null; Optional<Integer> a = Optional.ofNullable(value1);
               Integer value2 = 2; Optional<Integer> b = Optional.of(value2);

##9. Why finally always be executed ?
####Answer:
    1)Although there may be getting an exception, then throwed or returned, but it does not finish.
    2)analyzing at the bytecode level:
    When compiling the Java code, the compiler makes a copy of the finally block and places the contents of the finally
    block at the exit of all the normal and exception paths in the try and catch blocks. It can seen frim the decompilated
    bytecode that there are multiple copies of the finally bytecode. So this is why the finally block always be executed.


##10. What is Java 8 new features ?
####Answer:
    Java 8 brings a host of new features to the Java language, compilers, libraries, development tools, and JVMS. The Java 
    8 new features include functional interface, Lambda expression, Method reference/constructor reference, stronger Stream API,
    interface enhancement, Optional, New time and date API, etc... 

##11. What are the types of design patterns in Java ?
####Answer:
    Generally speaking, design patterns can be divided into three categories.
    1)Creational patterns: Factory Method pattern, Abstract Factory pattern, Singleton pattern, Builder patter, Prototype pattern.
    2)Structural patterns: Adapter pattern, Decorator pattern, Proxy pattern, Facade pattern, Bridge pattern, Composite pattern,
        Flyweight pattern.
    3)Behavioral pattern: Strategy pattern, Template Method pattern, Observer pattern, Iterator pattern, Chain of Responsibility 
        pattern, Command pattern, Memento pattern, State pattern, Visitor pattern, Mediator pattern, Interpreter pattern.

##12. What are the SOLID Principles ?
####Answer: 
    SOLID principles are the five principles for object-oriented class design. 
    To be more specific, S- Single Responsibility Principle, O- Open-Closed Principle, L- Liskov Substitution Principle,
    I- Interface Segregation Principle, and D- Dependency Inversion Principle.

##13.  How can you achieve thread-safe singleton patterns in Java ?
####Answer:
    Step1: static volatile variable
    Step2: make constructor be private 
    Step3: static synchronized getInstance method
    Step4: make sure thread safe
    Code: via lazy load
```
public class Singleton {
    private Singleton(){

    }
    //volatile:
    private static volatile Singleton instance;

    public static Singleton getInstance(){
        //first check, if instance is not null, it is no need to Preemption lock
        if(instance == null){
            synchronized (Singleton.class){
                //second check
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

```
   

##14. What do you understand by the Open-Closed Principle (OCP) ?
####Answer:
    1)The meaning of the Open-Closed Principle is that when the requirements of the application change, the function of the 
    module can be expanded to meet the new requirement without modifying the source code or binary code of the software entity.
    2)The Open-Closed Principle is the ultimate goal of object-oriented programming, which enables software entities to have a 
    certain degree of adaptability and flexibility as well as stability and continuity.
    3)The OCP can be implemented through "abstraction constrains, encapsulation changes". This means a relatively stable abstraction 
    layer is defined for software entities through interfaces or abstract classes, and the same variable factors are encapsulated
    in the same concrete implementation class. 

    

##15.  Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
##substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
####Answer: 
      choose 1
1. It mean that if the object of type A can do something, the object of type B could also be able to
   perform the same thing
2. It means that all the objects of type A could execute all the methods present in its subtype B
3. It means if a method is present in class A, it should also be present in class B so that the object of
   type B could substitute object of type A.
4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

##16. Watch the design pattern video, and type the code, submit it to MavenProject folder
