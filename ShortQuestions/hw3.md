### Question 2: What is the checked exception and unchecked exception in Java, could you give one example
```
Checked exception: we need to use catch or throws, such as IOException. This happens at compile time.
Unchecked exception: Runtime exception. Such as the null pointer exception, division by zero exception
```

### Question 3:  Can there be multiple finally blocks
```
No.
```

### Question 4: When both catch and finally return values, what will be the final result?
```
It will return the value in the finally block
```

### Question 5: What is Runtime/unchecked exception? what is Compile/Checked Exception
```
runtime exception is the exception that throws during runtime, and normally it needs to be manullay catched
compile exception is the exception that notifies by the compiler
```

### Question 6: What is the difference between throw and throws
```
The throws is used to declare which exception can be thrown from a method
The throw is to explicitly throw an expcetion
```

### Question 7: Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
### exception before Exception ?
```
The scope of exception should be from small to large.
so the null exception will be throwed first.
```

### Question 9: What is optional? why do you use it? write an optional example
```
it's a class in java.util package.
Optional is designed to prevent too many null checks.
Optional<Integer> op1 = Optional.ofNullable(1000)
```

### Question 10. Why finally always be executed ?
```
This is becuase it ensures unexpected exception won't happen.
```

### Question 11. What is Java 8 new features ?
```
Optional, stream, lambda, functional interface, default and static method in an interface
```

### Question 12. What are the types of design patterns in Java
```
Java design pattern can be divided into creational, structural, and behavioral.
singleton: eager load: you create an instance of this class as a private static variable. Then, you create a private constructor.
            static getinstance method to generate the instance of this class.
            lazy load: use synchornized keyword on class of singleton, so if one thread initialized the instance, the rest of the 
            thread will share the same variable.
```

### Question 13.  What are the SOLID Principles  ?
```
single responsibility: each class only has one job
open-closed principle: software components should be open for extension, not for modificationm
liskov substitution principle: objects of a superclass should be replacable with objects of its subclasses
interface segregation principle: no client should be forced to depend on methods it does not use
dependency inversion: high level module should not depend on low level module
```

### Question 14.  How can you achieve thread-safe singleton patterns in Java ?
```
use the syncrhonized keyword on getinstance
```

### Question 15.  What do you understand by the Open-Closed Principle ?
```
If we want to add a new attribute to a class, we normally do not want to modify that class.
Instead, we should create a new subclass that extends the parent class.
```

### Question 16.  Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
### substituted with any object of type B. What does this actually mean? (from OA ) choose your answer. ?
```
c
```



