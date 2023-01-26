### 2.  What is the checked exception and unchecked exception in Java, could you give one example?
`Checked Exception` are checked by the compiler at the time of compilation.<br>
`Eg. ClassNotFound Exception`<br>
`Unchecked Exception` are not checked during the compile time by the compiler.  The compiler doesn’t force to handle these exceptions.<br>
`Eg. ArrayIndexOutOfBounds`

### 3.  Can there be multiple finally blocks?
No, we can have multiple try-catch blocks but only one finally block

### 4.  When both catch and finally return values, what will be the final result?
If a try-catch catches an exception, the logic in the catch block is executed first, and then the logic in the finally block.
<p>If there are no exceptions to the try-catch block, the final result will be executed in addition to the normal try block code, as well as the code in the finally block.

### 5.  What is Runtime/unchecked exception? what is Compile/Checked Exception?
Checked Exception are checked by the compiler at the time of compilation.  Classes that extend Throwable class except Runtime exception and Error are called checked Exception.
<p>Unchecked Exception are not checked during the compile time by the compiler.  The compiler doesn’t force to handle these exceptions.

### 6.  What is the difference between throw and throws?
The throws keyword in Java is used to declare exceptions that can occur during the execution of a program. For any method that can throw exceptions, it is mandatory to use the throws keyword to list the exceptions that can be thrown.
<p>The throw keyword in Java is used for explicitly throwing a single exception. This can be from within a method or any block of code. 

### 7.  Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
```
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        String s = null;
        try {
            System.out.println(b / a);
            System.out.println(s.equals("aa"));
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("End ...");
    }
}
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 3
        String s = null;
        try {
            // System.out.println(b / a);
            System.out.println(s.equals("aa"));
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("End ...");
    }
}
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 3
        String s = null;
        try {
            // System.out.println(b / a);
            // System.out.println(s.equals("aa"));
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("End ...");
    }
}
```
1. The first exception is because it violates the mathematical law that 0 cannot be divisor
2. The second exception is a null pointer exception, because s is null so the s.equals() method raises a null pointer exception
3. The third exception is the rumtime exception actively thrown from the try block

### 7.  What is optional? why do you use it? write an optional example.
Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present.
<p>Using Optional can make your code more readable and less prone to null pointer exceptions.

```
public class OptionalExample {
    public static void main(String[] args) {
        String name = "John Doe";
        Optional<String> optionalName = Optional.ofNullable(name);
        if (optionalName.isPresent()) {
            System.out.println("Name: " + optionalName.get());
        } else {
            System.out.println("Name not found.");
        }
    }
}

```

### 8.  Why finally always be executed ?
Cleanup: The finally block is often used to perform cleanup tasks, such as closing open files or releasing resources that were acquired in the try block.
<p>Guaranteeing execution: The finally block is also used to guarantee that certain code is executed, regardless of whether an exception was thrown or not. 

### 9.  What is Java 8 new features ?
1. Lambda expressions
2. Stream API
3. Functional interfaces
4. Optional
5. Method reference
6. Date and Time API
7. Default and static methods in interfaces

### 10.  What are the types of design patterns in Java ?
1. Creational patterns (Singleton pattern,Factory pattern)
2. Structural patterns  
3. Behavioral patterns (Observer pattern)

### 11.  What are the SOLID Principles ?
SOLID is an acronym that stands for five design principles for object-oriented programming and software development.
>* Single Responsibility Principle (SRP)
>* Open/Closed Principle (OCP)
>* Liskov Substitution Principle (LSP) 
>* Interface Segregation Principle (ISP) 
>* Dependency Inversion Principle (DIP)

### 12.  How can you achieve thread-safe singleton patterns in Java ?
use lazy load singleton patterns
```
public class Singleton {
    private static volatile Singleton instance;     // 1, static volatile variable
    
    private Singleton() {                           // 2, make constructor be private
                                                    // 保证不能new， 一旦可以new, 就可以建造很多instance， 则就不再是singleton。
    }
   
    public static Singleton getInstance() {          // 3. static synchronized getInstance method
                                                     // static保证在没有instance的情况下，可以调该方法。
                                                     // 4, make sure thread safe, improve performance
        if (instance == null) {                     // 可能是多个线程
                                                    // T1(first --> unlock), T2(wait)
            synchronized (Singleton.class) {        // 保证正能进入一个线程
                                                    //T1 is here first, and then comes T2 
                if (instance == null) {  
                                                    //T1 is here, T2...Tn will never be here.
                    instance = new Singleton(); 
                }
            }
        }
        return instance;
    }
}
```

### 13.  What do you understand by the Open-Closed Principle (OCP) ?
The Open-Closed Principle (OCP) is a principle of object-oriented programming that states that "classes should be open for extension, but closed for modification." This means that a class or module should be designed in such a way that new functionality can be added to it without modifying the existing code.
developers can add new features to a system without having to make changes to existing code, which can help to minimize the risk of introducing bugs or breaking existing functionality.
<p>There are several ways to achieve OCP in Java

1. Using inheritance and polymorphism
2. Using interfaces and composition
3. Using the Strategy pattern
4. Using the Decorator pattern

### 14.  Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
1.  It mean that if the object of type A can do something, the object of type B could also be able tp
    perform the same thing
2.  It means that all the objects of type A could execute all the methods present in its subtype B
3.  It means if a method is present in class A, it should also be present in class B so that the object of
    type B could substitute object of type A.
4.  It means that for the class B to inherit class A, objects of type B and objects of type A must be same. 
`answer is 1`