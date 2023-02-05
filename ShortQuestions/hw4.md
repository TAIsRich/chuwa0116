1.  Practice  collection
    Code can be seen in codingQuestions/02-java-core/src/main/java/com/chuwa/exercise/collection.
2.  What is the checked exception and unchecked exception in Java, could you give one example?
    
3.  Can there be multiple finally blocks?\
    You can only have one finally clause per try-catch-finally statement. 
4.  When both catch and finally return values, what will be the final result?\
    The receiving method will get the returned value from the finally block.
5.  What is Runtime/unchecked exception? what is Compile/Checked Exception?\
    A checked exception is caught at compile time. A runtime or unchecked exception is caught at runtime.
6.  What is the difference between throw and throws?
    The throws keyword is used to declare which exceptions can be thrown from a method. \
The throw keyword is used to explicitly throw an exception within a method or block of code.\
7.  Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
    exception before Exception ?\
    It’s because if we handle the most general exceptions first, the more specific exceptions will be omitted, which is not good, as Java encourages handling exceptions as much specific as possible.
8. Why finally always be executed?\
   A finally block is always get executed whether the exception has occurred or not.
9. What is Java8 new features?
   1. stream api
   2. lambda function
   3. functional interface
   4. interface default and static methods
   5. Optional
   6. method reference
10. What are the types of design patterns in Java ?
    1. Behavioral design patterns:
       Chain Of Responsibility Pattern, Command Pattern, Interpreter Pattern, Iterator Pattern, Mediator Pattern, Memento Pattern, Observer Pattern, State Pattern, Strategy Pattern, Template Pattern, Visitor Pattern.
    2. structural design patterns:
        adapter, bridge, composite, decorator, facade, flyweight, proxy pattern.
    3. creational design pattern: factory, abstract factory pattern, singleton, prototype, builder pattern.
        
11. What are the SOLID Principles ?
    1. The Single-responsibility principle: "There should never be more than one reason for a class to change." 
    2. The Open–closed principle: "Software entities ... should be open for extension, but closed for modification."
    3. The Liskov substitution principle: "Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it." See also design by contract.
    4. The Interface segregation principle: "Clients should not be forced to depend upon interfaces that they do not use."
    5. The Dependency inversion principle: "Depend upon abstractions, not concretions".
12. How can you achieve thread-safe singleton patterns in Java ? \
Method1:
```java
    public class Singleton{
        public static Singleton instance;
        private Singleton(){}
        public synchronized Singleton getInstance(){
            if(instance == null){
                instance = new Singleton();
            }
            return INSTANCE;
        }
}
```
Method2:
```java
    class Singleton {
    private static volatile Singleton instance;
    private Singleton(){};
    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singeleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return localRef;
    }

    // other functions and members...
}
```
Method 3:
```java
public enum Singleton {
    INSTANCE;
}
```
13. What do you understand by the Open-Closed Principle (OCP) ?\
    The Open-Closed Principle (OCP) states that software entities (classes, modules, methods, etc.) should be open for extension, but closed for modification. In practice, this means creating software entities whose behavior can be changed without the need to edit and recompile the code itself.
14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
    substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
    1. It mean that if the object of type A can do something, the object of type B could also be able tp
        perform the same thing
    2. It means that all the objects of type A could execute all the methods present in its subtype B
    3. It means if a method is present in class A, it should also be present in class B so that the object of
        type B could substitute object of type A.
    4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.\
    Answer: 3
15. Watch the design pattern video, and type the code, submit it to MavenProject folder\
    code can be found in MavenProject/hw4
