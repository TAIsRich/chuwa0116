####What is generic in Java?    
Generics means parameterized types. The idea is to allow type to be parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity. Generally, Java Generics provides a way to reuse the same code with different inputs.   

####What is Runtime Exception? could you give me some examples?    
Runtime Exceptions as known as Unchecked exceptions. Compiler does not force us to handle these exceptions but as a programmer, it is our responsibility to handle runtime exceptions e.g. NullPointerException, ArthmeticException, ArrayIndexOutOfBoundException etc.   

####Could you give me one example of NullPointerException?    
NullPointerException is a runtime exception and it is thrown when the application try to use an object reference which has a null value.    

####What is the Optional class?
The OPtional class in Java is a container that can hold , at max, one value and gracefully deals with null values. It can be used to avoid Null checks and run time NullPointerExceptions.

####What is the @FunctionalInterface?     
@FunctionalInterface is an annotation to ensure our interface is functional only. It has one single Abstract method. @FunctionalInterface is for sanity check. It can have a lot of default methods.   

####what is lamda?     
A Lambda expression is a short block of code which takes in parameters and returns a value. Lambda can be used to replace anonymous inner class and work with functional interface.     

####What is Method Reference?    
Method references are a special type of lambda expressions. They are often used to create simple lambda expressions by referencing existing methods. There are four kinds of method refernece: Static methods. Instance methods of particular objects. Instance methods of an arbitrary object of a particular type. Constructor method.   
####What is Java 8 new features?    
1. Default method and static method in interface   
2. Lambda & Dunctional Interface   
3. Optional    
4. Method Reference   
5. Stream API   

####Lambda can use unchanged variable outside of lambda? what is the details?   
Yes, Lambda can use unchanged variable outside of lambda   
1. Final variable   
2. Non-final variable however never changed   
3. Object variable(if we use new to reassign a new memory, then this variable is changed, can not be used in lambda)   









