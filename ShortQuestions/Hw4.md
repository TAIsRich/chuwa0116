## What is the checked exception and unchecked exception in Java, could you give one example?

Checked exceptions are those that the Java compiler forces you to catch. Examples of checked exceptions include IOException and SQLException.

Unchecked exceptions are those that the Java compiler does not force you to catch. Examples of unchecked exceptions include NullPointerException and ArrayIndexOutOfBoundsException.

Checked exception is like IOException and unchecked exception is ArrayIndexOutOfBoundsException.

## Can there be multiple finally blocks? 

No, there can only be one finally block associated with a try block in Java.

## When both catch and finally return values, what will be the final result?

The return value of the finally block will be the final result.

## What is Runtime/unchecked exception? what is Compile/Checked Exception?

Checked exceptions are those that the Java compiler forces you to catch. Examples of checked exceptions include IOException and SQLException.

Unchecked exceptions are those that the Java compiler does not force you to catch. Examples of unchecked exceptions include NullPointerException and ArrayIndexOutOfBoundsException.

## What is the difference between throw and throws?

"throw" is used to throw an exception explicitly. It is used to throw an instance of a checked or unchecked exception. The "throw" keyword is followed by an instance of the exception.

## why do we put the Null/Runtime  exception before Exception 

If a more specific exception is caught before a more general one, the more specific exception will be handled and the more general one will not be executed. Therefore, it is generally recommended to catch specific exceptions before more general ones to ensure that the most appropriate exception handler is executed.

## What is optional? why do you use it? write an optional example.

An Optional is a container object used to represent the presence or absence of a value. It is used to handle null values in a more safe and elegant way than using null references.

Optional<String> output = getUppercase(input);

## Why finally always be executed ?

This is because the finally block is used to perform cleanup operations that need to happen regardless of whether an exception occurs.

##  What is Java 8 new features ?

Lambda expressions, Stream API

## What are the types of design patterns in Java ?

Creational design patterns, Structural design patterns and Behavioral design patterns.

## What are the SOLID Principles ?

Single Responsibility Principle, Open-Closed Principle, Liskov Substitution Principle, Interface Segregation Principle and Dependency Inversion Principle

## How can you achieve thread-safe singleton patterns in Java ?

Eager Initialization, Lazy Initialization, Singleton Implementation and Using enum

## What do you understand by the Open-Closed Principle (OCP) ?

The Open-Closed Principle (OCP) is one of the SOLID principles and it states that a class should be open for extension but closed for modification. This principle means that once a class is written and tested, it should not be changed, but it should be possible to extend its behavior by adding new functionality.

The main idea behind the OCP is that a class should be designed in such a way that it can be extended without modifying the class itself. This can be achieved by using inheritance, interfaces, and polymorphism.

## Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.

It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing.