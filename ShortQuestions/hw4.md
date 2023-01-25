## 2. What is the checked exception and unchecked exception in Java, could you give one example?

> This problem I think is nearly the same to Problem 5.

- For checked exception, a good example is **FileNotFound**
- For unchecked exception, a good example is **NullPointerException**

## 3. Can there be multiple finally blocks? 
> There can only be one finally block, and it must follow the catch blocks.

## 4. When both catch and finally return values, what will be the final result?
> finally return will be the final result

## 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
- An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.

- A checked exception is a type of exception that must be either caught or declared in the method in which it is thrown. For example, the java.io.IOException is a checked exception. These exceptions cannot simply be ignored at the time of compilation, the programmer should take care of (handle) these exceptions.

## 6. What is the difference between throw and throws？
> The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.



## 7. What is optional? why do you use it? write an optional example.

- Optional is generally used as a return type for methods that might not always have a result to return. For example, a method that looks up a user by ID might not find a match, in which case it would return an empty Optional. Optional can help to reduce the number of null pointer exceptions in your code.

```
import java.util.Optional;
 
public class OptionalDemo {
    public static void main(String[] args)
    {
        String[] words = new String[10];
        Optional<String> checkNull
            = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}
```


## 8. Why finally always be executed ?
> The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs.


## 9. What is Java 8 new features 
- Permanent Generation

- Parallel Array Sorting
- Base64 encoding and decoding
- Date & Time API
- Functional Interfaces
- Lambda expressions

## 10. What are the types of design patterns in Java
> Java design patterns are divided into three categories - creational, structural, and behavioral design patterns

## 11. What are the SOLID Principles ?
- Single Responsibility Principle (SRP)

- Open-Close Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)


## 12. How can you achieve thread-safe singleton patterns in Java?

1. static volatile variable
2. make constructor be private
3. static synchronized getInstance method
4. make sure thread safe

```
public class Singleton {
    // 1, private static variable
    private static Singleton instance = new Singleton();
    // 2, make constructor be private
    // 保证不能new， 一旦可以new, 就可以建造很多instance， 则就不再是singleton。
    private Singleton() {
    }
    // 3. static getInstance method
    // static保证在没有instance的情况下，可以调该方法。
    public static Singleton getInstance() {
        return instance;
    }
}
Singleton is NOT null
Singleton.getInstance(); //faster
```


## 13. What do you understand by the Open-Closed Principle (OCP) 

- the open–closed principle (OCP) states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification" 

- that is, such an entity can allow its behaviour to be extended without modifying its source code.

## 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA )

> It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A
