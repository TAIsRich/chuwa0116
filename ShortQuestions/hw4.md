## Homework

Name: Zijun Zhou

### 1. 
Included in the Coding directory

### 2. What is the checked exception and unchecked exception in Java, could you give one example?
Checked Exception is typically handled by developer, and it's checked by the complier at the compling time, however, unchecked exception generally could happen everywhere, if we declare the unchecked exception in our code, this could reduce the clarity of our code. 

### 3. Can there be multiple finally blocks?
No, only one finally block is allowed.

### 4. When both catch and finally return values, what will be the final result?
The value in the finally block would be returned, because it's executed in the last.

### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
Runtime Exception is the exception that could not be identified by the developer, and could happen anywhere, however, checked exception would require the developers to handle it right before the compiling time.

### 6. What is the difference between throw and throws?
Differences: 
- The throw keyword is used inside a method, however, the throws keyword is used in the function signature.
- The throw keyword is used to throw an exception explicitly, it can only throw only one exception at a time, however, the throws keyword could declare multiple exceptions
- The throw keyword cannot propagate the checked exceptions, it's only used to propagate the unchecked exceptions. However, the throws keyword is used to propagate the checked exception

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
Because the Null/Runtime Exception is more specific, if you put Exception before Null/RuntimeException, the more specific exception would not catch anything.

### 8. What is optional? why do you use it? write an optional example.
Optional is a container object used to contain non-null objects. Optional object is used to represent null with absent value. It's very useful to avoid the handling of NullPointerException.

### 9. Why finally always be executed ?
Because it's very useful to release the resources in the end no matter whether we encounter exceptions.

### 10. What is Java 8 new features 
- Introduced Optional Class
- Functional Interface and Lambda Expressions
- Default and static methods for interfaces
- Stream API
- forEach() method in Iterable interface

### 11. What are the types of design patterns in Java ?
There are creational, structural, and behavioral design patterns in Java.

### 12. What are the SOLID Principles ?

 S: Single responsibility principle
 O: Open-closed principle
 L: Liskov substitution principle
 I: Interface segregation principle
 D: Dependency inversion principle

### 13.How can you achieve thread-safe singleton patterns in Java ?
We can implement that of lazy initialization like below:
```
class Singleton{
private Singleton(){}
private static volatile Singleton singleton;
public static Singleton getInstance(){
    if(null == singleton){
        synchronized(Singleton.class){
         if(null == singleton)
         singleton = new Singleton();
        }
    }
    return singleton;
}
}
```

### 14.What do you understand by the Open-Closed Principle (OCP) ?
Objects should be open for extension but closed for modification, which means that if you try to calculate the area of different shape class in an object, you should not create separate methods for each shape class, instead you should make shape class extends a common interface which contains getArea() method, therefore, in our class, we could simply invoke getArea(), but different shapes have different area calculation logic, they could override getArea() method to specify that.

### 15.Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
  It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.

### 16.  Watch the design pattern video, and type the code, submit it to MavenProject folder
Included in the MavenProject folder