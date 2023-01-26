# HW4
### 1.Practice collection
```
Please check Collection Folder in Coding Folder
```

### 2. What is the checked exception and unchecked exception in Java, could you give one example?
```
Checked exception: the exception will be checked while compiling. Example: ClassNotFoundException
UncheckedException: the exception will be check during processing. Example: NullPointerException
```

### 3. Can there be multiple finally blocks
```
There can only be one finally block, and it must follow the catch blocks.
```

### 4. When both catch and finally return values, what will be the final result?
```
The final result is the returned value from the finally block.
```

### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
```
A runtime/unchecked exception in Java is something that has gone wrong with the program and is unrecoverable.
A compile/checked exception is a type of exception that must be either caught or declared in the method in which it is thrown
```

### 6. What is the difference between throw and throws
```
The throw keyword is used to explicitly throw an exception within a method or block of code
The throws keyword is used to declare which exceptions can be thrown from a method
```

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
```
Because Exception has a larger scope than Null/Runtime exception. If we use small scope exception first, then we will know a more specific exception message.
```

### 7. What is optional? why do you use it? write an optional example
```
The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.
We use it to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.
```
```java
class OptionalExample {  
    public static void main(String[] args) {  
        String[] sentence = new String[10];
        Optional<String> checkForWord = Optional.ofNullable(sentence[9]);  
        if(checkForWord.isPresent()){
            String word = checkForWord.get().concat("suffix");            
            System.out.println(String.format("Word with suffix: %s", word));
        } else  
            System.out.println("No word is present to append suffix to.");
    }  
}
```

### 8. Why finally always be executed ?
```
This ensures that the finally block is executed even if an unexpected exception occurs.
```

### 9. What is Java 8 new features ?
```
Default method and static method in interface
Lambda & Functional Interface
Method reference
Stream API
```

### 10. What are the types of design patterns in Java ?
```
Creational, structural, and behavioral design patterns
```

### 11. What are the SOLID Principles ?
```
Single Responsibility Principle (SRP)
Open-Close Principle (OCP)
Liskov Substitution Principle (LSP)
Interface Segregation Principle (ISP)
Dependency Inversion Principle (DIP)
```

### 12. How can you achieve thread-safe singleton patterns in Java ?
```
Create the private constructor to avoid any new object creation with new operator.
Declare a private static instance of the same class.
Provide a public static method that will return the singleton class instance variable.
```

### 13. What do you understand by the Open-Closed Principle (OCP)
```
The OCP states software entities should be open for extension, but closed for modification; that is, such an entity can allow its behaviour to be extended without modifying its source code.
```

### 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B
```
3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A
```

### 15. Watch the design pattern video, and type the code, submit it to MavenProject folder
```
Please check MavenProject folder
```



