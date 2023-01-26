####What is the checked exception and unchecked exception in Java, could you give one example?    
Checked Exceptions: All exceptions other than RuntimeException and Error are known as Checked exceptions. These exceptions are checked by the compiler at the the compile time itself. E.g. When you are trying to read from a file, then compiler enforces us to handle the FileNotFoundException because it is possible that the file may not be present. Some other checked exceptions are SQLException, IOException etc.   
Unchecked Exceptions: Runtime Exceptions are known as Unchecked exceptions. Compiler does not force us to handle these exceptions but as a programmer, it is our responsibility to handle runtime exceptions e.g. NullPointerException, ArithmeticExceptions, ArrayIndexOutOfBoundException etc.   

####Can there be multiple finally blocks?    
There can only be one finally block.    

####When both catch and finally return values, what will be the final result?   
If both catch and finally return, the receiving method will get the returned value from the finally block.   

####What is the difference between throw and throws?   
throw is a keyword which is used to explicitly throw an exception in the program, inside a function or inside a block of code.   
throws is a keyword which is used with the method signature to declare an exception which might get thrown by the method while executing the code.   
throw keyword is followed by an instance of an Exception class whereas throws is followed by Exception class names.   
You can throw one exception at a time but you can declare multiple exceptions using throws keyword   
Using throw keyword, only unchecked exceptions are progagated, whereas using throws keyword both checked and unchecked exceptions can be propagated.   

####why do we put the Null/Runtime exception before Exception?   
The scope of Exception e is larger than that of Null/Runtime exception.   

####What is optional? why do you use it? write an optional example.    
Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present. In other words, an Optional object can either contain a non-null value or it can contain no value at all.   
Optinal is generally used as a return type for methods that might not always have a result to return. For example, a method that looks up a user by ID might not find a match, in which case it would return an empty Optional.   
Optional can help to reduce the number of null pointer exceptions in your code. It is not intended as a replacement for existing reference types, such as String or List, but, rather, as an addition to the Java type system.   
```
public int getMobileScreenWidthOptional(Mobile mobile) {
	return Optional.ofNullable(mobile).flatMap(Mobile::getDisplayFeaturesOpti
onal).flatMap(DisplayFeatures::getResolutionOptional).map(ScreenResolution::getWidth).orElse(0);
}
```   

####Why finally always be executed?    
The finally block in java is used to put important codes such as clean up code e.g. closing the file or colosing the connection. The finally block executes whether exception rise or not and whether exception handled or not.   
####What is Java 8 new features?    
1. Default method and static method in interface   
2. Lambda & Functional Interface   
3. Optional   
4. Method Reference   
5. Stream API   

####What are the types of design patterns in Java?    
1. Factory Design Pattern   
2. Abstarct Factory Design Pattern   
3. Strategy Design Pattern   
4. Builder Design Pattern   
5. Singleton Design Pattern   
6. Observer Design Pattern   

####What are the SOLID Principles?   
SOLID principles are object-oriented design concepts relevant to software development. SOLID is an acronym for five other class-design principles: Single Responsibilities Principle, Open-Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle.   
Single Responsibilities Principle: Each class should be responsibile for a single part or functionality of a system.     
Open-Closed Principle: Software components should be open for extension, but not for modification.   
Liskov Substitution Principle: Objects of a superclass should be replaceable with objects of its subclasses without breaking the system.   
Interface Segregation Principle: No client should be forced to depend on methods taht it does not use.   
Dependency Inversion Principle: High-level modules should not depend on low-level modules, both should depend on abstractions.    

####How can you achieve thread-safe singleton patterns in Java?   
Singleton design pattern comes under Creational Design Pattern category and this partten ensures that only one instance of class exits in the JVM.   
Thread Safe Singleton Implementation: Here the easiest way to prevent multiple threads from creating more than one instance is to make the global accress method 'synchronized', this way threads will acquire a lock first before entering the getInstance() method. Synchronizing the entire method comes with performance degradation, also acquiring the lock and releasing the lock on every call to getInstance() method seems un-necessary, because only first few calls to getInstance() method needs to be synchronized, what I mean to say by this statement is: Let's suppose there are 10 threads that are trying to call getInstance() method, now you need to apply synchronization to only these 10 threads at this time and the thread which first acquires the lock will create the object. After that, every thread will get the same object because of null check in if condition, so we can optimize the above code by using double-checked locking principle, where we will use a synchronized block inside the if condition. Suppose there are 2 threads and both called the getInstance() method at the same time, now they will both be inside the first if condition as instance is null at this time, and the first thread which acquires the lock will create the object and as soon as it exits the synchronized block, other thread whilch was waiting, will acquire the lock and it will also create another object thus breaking the singleton pattern. This is why it is called “double-checked locking”. Now, some people have faced issues with the above approach in java 1.4 and earlier versions, which was solved in later versions by using ‘volatile’ keyword with the above approach like below: ocalRef variable is there for the cases where instance is already initialized (discussed above), the volatile field is only accessed once because we have written return localRef not return instance. There is another approach where an inner static class is used to create the Singleton class instance and it is returned from the global access method. This approach is called Bill Pugh Singleton Implementation.    

####What do you understand by the Open-Closed Principle (OCP)?    
Software components should be open for extension, but not for modification.    
####What does this actually mean? (from OA ) choose your answer.   
3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.    


