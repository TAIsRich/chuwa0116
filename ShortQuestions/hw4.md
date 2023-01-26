
## 2. What is the checked exception and unchecked exception in Java, could you give one example?

**Checked Exceptions** are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the throws keyword.

```Java
import java.io.*;
class CheckedExceptions {
    public static void main(String[] args){ 
        FileReader file = new FileReader("C:\\test\\a.txt"); // If the file does not exist, it will throw IOException
 
        BufferedReader fileInput = new BufferedReader(file);
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());
        fileInput.close();
    }
}
```

**Unchecked Exceptions** are the exceptions that are not checked at compile time. It is up to the programmers to be civilized, and specify or catch the exceptions. In Java, exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked. 

```Java
import java.io.*;
class UncheckedExceptions {
    public static void main(String[] args){
        int x = 0;
        int y = 10;
        int z = y / x;  // Dividing by zero will throw ArithmeticException.
    }
}
```
## 3. Can there be multiple finally blocks?

No. Only one.

## 4. When both catch and finally return values, what will be the final result?

Finally.

## 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?

**Unchecked Exceptions** are the exceptions that are not checked at compile time. It is up to the programmers to be civilized, and specify or catch the exceptions. In Java, exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked. 

**Checked Exceptions** are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the throws keyword.

## 6. What is the difference between throw and throws?


throw: The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 

throws: throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions.

## 7.Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?

It will give more detailed exception information. If we put Exception at very front, all exceptions will go to that block.

## 7. What is optional? why do you use it? write an optional example.

Optional is generally used as a return type for methods that might not always have a result to return to avoid null check and NullPointerException.

```Java
import java.util.Optional;
 
public class OptionalDemo {
    public static void main(String[] args)
    {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
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

This ensures that the finally block is executed even if an unexpected exception occurs.

## 9. What is Java 8 new features ?

Lambda, Functional Interface, Optional, Method Reference, Stream API

## 10. What are the types of design patterns in Java ?

Aggregation, composition, singleton

## 11. What are the SOLID Principles ?

SOLID is an acronym for five other class-design principles: Single Responsibility Principle, Open-Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle.

## 12. How can you achieve thread-safe singleton patterns in Java ?

Use lazy load

1. Create the private constructor to avoid any new object creation with new operator.
2. Declare a private static instance of the same class.
3. Provide a public static method that will return the singleton class instance variable. If the variable is not initialized then initialize it or else simply return the instance variable.

## 13. What do you understand by the Open-Closed Principle (OCP) ?

The open–closed principle (OCP) states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.

## 14.Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.

1. It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing
