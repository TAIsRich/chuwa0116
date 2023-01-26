## What is the checked exception and unchecked exception in Java, could you give one example?

Checked exception are the exceptions that are checked at compile time.

Unchecked exception are not checked at compile time.

| Criteria  | Unchecked Exception                                                                                   | Checked Exception                                                                         |
|-----------|-------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| Purpose   | Unanticipated errors in logic that show up at runtime                                                 | Anticipated problems associated with the normal use of an API                             |
| Ancestry  | Includes RuntimeException                                                                             | Does not include RuntimeException                                                         |
| Handling  | Exception handling semantics are not required                                                         | Must be handled in a try-and-catch block, or be thrown by the invoking method             |
| Extension | Can be customized by extending RuntimeException                                                       | Can be customized by extending java.lang.Exception                                        |
| Examples  | NullPointerException, ClassCastException, ArithmeticException, DateTimeException, ArrayStoreException | ClassNotFoundException, SocketException, SQLException, IOException, FileNotFoundException |

## Can there be multiple finally blocks?

There can only be one finally clause per try/catch/finally statement.

## When both catch and finally return values, what will be the final result?

When catch and finally block both return value, 
method will ultimately return value returned by finally block irrespective of value returned by catch block.

## What is Runtime/unchecked exception? what is Compile/Checked Exception?

Answered in Question #1.

## What is the difference between throw and throws?

The ```throws``` keyword is used in a method signature and declares which exceptions can be thrown from a method.

The ```throw``` keyword is used within a method body, 
or any block of code, and is used to explicitly throw a single exception.

| Throw                                                    | Throws                                                |
|----------------------------------------------------------|-------------------------------------------------------|
| Used within a method (or constructor)                    | Used with method (or constructor) signature           |
| Used to throw an exception explicitly                    | Used to declare exceptions                            |
| Can only throw a single exception                        | Can declare multiple exceptions                       |
| Followed by a throwable instance                         | Followed by an exception class name                   |
| Cannot be used to propagate checked exceptions by itself | Can be used to propagate checked exceptions by itself |


## Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtimeexception before Exception ?

Because Exception includes Null/Runtime exception. Put Null/Runtime exception before Exception can help us narrow down the cause
of error, otherwise it will throw a general error.

## What is optional? why do you use it? write an optional example.

Optional is generally used as a return type for methods that might not always have a result to return.

1. Create a optional variable
   - `Optional.of`
     - ```java
       Optional<Exmloyee> optional = 
       Optional.of(exployee);
       ```
   - `Optional.ofNullable`
     - ```java
       employee = null;
       Optional<Exmployee> optional2 = 
       Optional.ofNullable(employee);
       ```
2. important/popular methods
   - `.orElse`
     - ```java
       Employee optional3 =
       Optional.ofNullable(employee)
       .orElse(new Employee(1, "JCole", 30, 6666));
       ```
   - `.orElseThrow`
     - ```java
       Employee optional3 =
       Optional.ofNullable(employee)
       .orElseThrow( () -> new RuntimeException("Wow Exception"));
       ```
       
## Why finally always be executed ?

The `finally` block always executes when the try block exits. 
This ensures that the `finally` block is executed even if an unexpected exception occurs.

## What is Java 8 new features ?

1. Default method and static method in interface
2. Lambda & Functional Interface
3. Optional
4. Method Reference
5. Stream API

## What are the types of design patterns in Java ?

![image](https://user-images.githubusercontent.com/93806902/214664792-7b9f1f49-f432-4fe2-a273-e3a1ba3eda28.png)


## [What are the SOLID Principles ?](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)

SOLID stands for:

- S - Single-responsibility Principle
- O - Open-closed Principle
- L - Liskov Substitution Principle
- I - Interface Segregation Principle
- D - Dependency Inversion Principle

**Single-responsibility Principle (SRP) states:**
> A class should have one and only one reason to change, meaning that a class should have only one job.

For example, consider an application that takes a collection of shapes—circles, 
and squares—and calculates the sum of the area of all the shapes in the collection.


**Open-closed Principle (OCP) states:**
> Objects or entities should be open for extension but closed for modification.

This means that a class should be extendable without modifying the class itself.


**Liskov Substitution Principle states:**
> Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.

This means that every subclass or derived class should be substitutable for their base or parent class.


**Interface segregation principle states:**
> A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.


**Dependency inversion principle states:**
> Entities must depend on abstractions, not on concretions. 
> It states that the high-level module must not depend on the low-level module, 
> but they should depend on abstractions.

## How can you achieve thread-safe singleton patterns in Java ?

- Singleton lazy initialization
    
```java
    public class Singleton {

   // 1, static volatile variable
   private static volatile Singleton instance;

   // 2, make constructor be private
   private Singleton() {
   }

   // 3. static synchronized getInstance method
   public static Singleton getInstance() {

        // 4, make sure thread safe
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
   }
   }
   ```
- Singleton eager initialization

```java
public class Singleton implements Serializable {

    // make constructor be private
    private Singleton() {
    }

    // define a inner static class
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    // provide public access method
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
```

## What do you understand by the Open-Closed Principle (OCP) ?

This means that a class should be extendable without modifying the class itself.

##  Liskov’s substitution principle states that if class B is a subtype of class A, 
then object of type A may be substituted with any object of type B. 
What does this actually mean? (from OA ) choose your answer.

1. **It means that if the object of type A can do something, the object of type B could also be able tp
   perform the same thing**
2. It means that all the objects of type A could execute all the methods present in its subtype B
3. It means if a method is present in class A, it should also be present in class B so that the object of
   type B could substitute object of type A.
4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.
