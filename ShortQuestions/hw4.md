## hw4

### 2. What is the checked exception and unchecked exception in Java, could you give one example?
* Checked exceptions are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the throws keyword. In checked exception, there are two types: fully checked and partially checked exceptions. A fully checked exception is a checked exception where all its child classes are also checked, like IOException, InterruptedException. A partially checked exception is a checked exception where some of its child classes are unchecked, like Exception.

* Unchecked exceptions are the exceptions that are not checked at compile time. In C++, all exceptions are unchecked, so it is not forced by the compiler to either handle or specify the exception. It is up to the programmers to be civilized, and specify or catch the exceptions. In Java, exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked. 


### 3. Can there be multiple finally blocks?
No, there can only be **one** finally block, and it must follow the catch blocks.
### 4. When both catch and finally return values, what will be the final result?
If both catch and finally return, the receiving method will get the returned value from the finally block.
### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
* Checked exceptions are those that the Java compiler forces you to catch. Examples of checked exceptions include IOException and SQLException.

* Unchecked exceptions are those that the Java compiler does not force you to catch. Examples of unchecked exceptions include NullPointerException and ArrayIndexOutOfBoundsException.

### 6. What is the difference between throw and throws?
The throw and throws are the concepts of exception handling in Java where the throw keyword throws the exception explicitly from a method or a block of code, whereas the throws keyword is used in the signature of the method.

| throw  | throws |
| ------------- |:-------------:|
|The throw keyword is used inside a function. It is used when it is required to throw an Exception logically.     | The throws keyword is used in the function signature. It is used when the function has some statements that can lead to exceptions.   |
| The throw keyword is used to throw an exception explicitly. It can throw only one exception at a time.      | The throws keyword can be used to declare multiple exceptions, separated by a comma. Whichever exception occurs, if matched with the declared ones, is thrown automatically then.     |
| Syntax of throw keyword includes the instance of the Exception to be thrown. Syntax wise throw keyword is followed by the instance variable.      | Syntax of throws keyword includes the class names of the Exceptions to be thrown. Syntax wise throws keyword is followed by exception class names.    |
|throw keyword cannot propagate checked exceptions. It is only used to propagate the unchecked Exceptions that are not checked using the throws keyword.    |  throws keyword is used to propagate the checked Exceptions only.  |

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
NullPointerException is a RuntimeException. In Java, a special null value can be assigned to an object reference. NullPointerException is thrown when program attempts to use an object reference that has the null value.

### 7. What is optional? why do you use it? write an optional example.
* An Optional object in Java is a container object that can hold both empty and a non-null values. If an Optional object does contain a value, we say that it is present; if it does not contain a value, we say that it is empty.
* Optional is generally used as a return type for methods that might not always have a result to return. For example, a method that looks up a user by ID might not find a match, in which case it would return an empty Optional. Optional can help to reduce the number of null pointer exceptions in your code. It is not intended as a replacement for existing reference types, such as String or List, but, rather, as an addition to the Java type system.
```Java
import java.util.Optional;

 public class Java8Tester {
   public static void main(String args[]){
   
      Java8Tester java8Tester = new Java8Tester();
      Integer value1 = null;
      Integer value2 = new Integer(10);
        
      // Optional.ofNullable - 允许传递为 null 参数
      Optional<Integer> a = Optional.ofNullable(value1);
        
      // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
      Optional<Integer> b = Optional.of(value2);
      System.out.println(java8Tester.sum(a,b));
   }
    
   public Integer sum(Optional<Integer> a, Optional<Integer> b){
    
      // Optional.isPresent - 判断值是否存在
        
      System.out.println("第一个参数值存在: " + a.isPresent());
      System.out.println("第二个参数值存在: " + b.isPresent());
        
      // Optional.orElse - 如果值存在，返回它，否则返回默认值
      Integer value1 = a.orElse(new Integer(0));
        
      //Optional.get - 获取值，值需要存在
      Integer value2 = b.get();
      return value1 + value2;
   }
}
```

### 8. Why finally always be executed ?
The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs.

### 9. What is Java 8 new features ?
* Lambda expressions
* Stream API

### 10. What are the types of design patterns in Java ?
* Creational design patterns
* Structural design patterns 
* Behavioral design patterns.

### 11. What are the SOLID Principles ?
* S - Single-responsiblity Principle
* O - Open-closed Principle
* L - Liskov Substitution Principle
* I - Interface Segregation Principle
* D - Dependency Inversion Principle

### 12. How can you achieve thread-safe singleton patterns in Java ?
* Create the instance variable at the time of class loading.
* Synchronize the getInstance() method. 
* Use synchronized block inside the if loop and volatile variable.

### 13. What do you understand by the Open-Closed Principle (OCP) ?
The open–closed principle (OCP) states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.

The name open–closed principle has been used in two ways. Both ways use generalizations (for instance, inheritance or delegate functions) to resolve the apparent dilemma, but the goals, techniques, and results are different.


### 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.

It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing.