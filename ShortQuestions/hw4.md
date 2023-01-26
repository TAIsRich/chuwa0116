## What is the checked exception and unchecked exception in Java, could you give one example?
checked exception: predictable
unchecked exceptipon: unpredictable
#### example
	checked: FileCanNotBeFound
	unchecked: OutofBounder
## Can there be multiple finally blocks?  
	No it cannot be multiple finally blocks
## When both catch and finally return values, what will be the final result?
	if exception is catched, it will return from catch
	else it will return from final
## What is Runtime/unchecked exception? what is Compile/Checked Exception?  
	runtime exception can only be found during runtime
	compile exception can be found during compile time
## What is the difference between throw and throws?  
	throws will be used in a method defination.
	throw will thorw an exception during runtime
## Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime  exception before Exception ?
	That is because Exception include other kinds of Exceptions
## What is optional? why do you use it? write an optional example.
	Optional is used to deal with problems when value is null. 
```
Integer value1 = null;
Integer value2 = 2;
Optional<Integer> a = Optional.ofNullable(value1);
Optional<Integer> b = Optional.ofNullable(value2);
Integer v1 = a.orElse(new Integer(0))
Integer v2 = b.get();
return v1 + v2;
```
## Why finally always be executed?
It will deal with some work to make sure program finished in a right way.
## What is Java8 new features?
lambda
stream
iterator.forEachRemaining
## What are the types of design patterns in Java ?
### Creational Design Pattern
### Structural Design Pattern
### Behavioral Design Pattern
## What are the SOLID Principles ?
### Single-Responsibility Principle
### Open Closed Principle
### Liskov Substitution Principle
### Interface Segregation Principle
### Dependency Inversion Principle
## How can you achieve thread-safe singleton patterns in Java ?
[singleton thread safe](https://www.digitalocean.com/community/tutorials/thread-safety-in-java-singleton-classes)
