#### 5.  What is Runtime Exception? could you give me some examples?
Runtime expection is a parent class that crash or break down the program when expections exist.
ArrayIndexOutOfBounds: It occurs when the the index of array is out of bound.

#### 6.  Could you give me one example of NullPointerException?
Object object = null;
System.out.println(object);

#### 7. What is the Optional class?
The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.
It is used to deal with NullPointerException in Java application.

#### 8.  What is the @FunctionalInterface?
An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface. A functional interface has exactly one abstract method.

#### 9.  what is lamda?
It's a short block of code that takes parameters and returns a value.

#### 10. What is Method Reference?
It's a short and easily readable writing syntax for lambda expression.

#### 11. What is Java 8 new features?
Permanent Generation
Parallel Array Sorting
Date & Time API
Functional Interfaces
Lambda expressions

#### 12. Lambda can use unchanged variable outside of lambda? what is the details?
Yes.
Lambda expressions can use variables defined in an outer scope. We refer to these lambdas as capturing lambdas. They can capture static variables, instance variables, and local variables, but only local variables must be final or effectively final.

