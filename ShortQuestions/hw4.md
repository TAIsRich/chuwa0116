**1.Practice collection**
+ https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection

**2.What is the checked exception and unchecked exception in Java, could you give one example?**
+ Checked exceptions are checked at compile-time. It means if a method is throwing a checked exception then it should handle the exception using try-catch block or it should declare the exception using throws keyword, otherwise the program will give a compilation error.
  + IOException (FileNotFound)
  + SQLException (Id/data doesn't exist) 
+ Unchecked exceptions are not checked at compile time. It means if your program is throwing an unchecked exception and even if you didn’t handle/declare that exception, the program won’t give a compilation error. Most of the times these exception occurs due to the bad data provided by user during the user-program interaction. It is up to the programmer to judge the conditions in advance, that can cause such exceptions and handle them appropriately. All Unchecked exceptions are direct sub classes of RuntimeException class.
  +  NullPointerException
  +  IndexOutOfBoundsException

**3.  Can there be multiple finally blocks**
+ No.

**4.When both catch and finally return values, what will be the final result?**
+ return value from finally block.

**5. What is Runtime/unchecked exception? what is Compile/Checked Exception? ?**
+ Compile/Checked exception means the exception will be checked while compiling : FileNotFound
+ Runtime/UncheckedException means the exception will be check during processing : NullPointerException

**6. What is the difference between throw and throws**
+ `throws` is used to declare which exceptions can be thrown from a method.
    ```
      import java.io.*;
      class Example {  
         public static void main(String args[]) throws IOException
         {
         }
      }
    ```
+ `throw` is used to explicitly throw an exception within a method or block of code.
    ```
      catch(NullPointerException e)
              {
                  System.out.println("Caught inside fun().");
                  throw e; // rethrowing the exception
              }
    ```

**7.  Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
exception before Exception ?**
+ The order is whatever matches first, gets executed.
+ So when catching exceptions you want to always catch the most specific first and then the most generic

**7. What is optional? why do you use it? write an optional example**
+ Optional is generally used as a return type for methods that might not always have a result to return.
+ The main advantage of this new construct is that No more too many null checks and NullPointerException.
    ```java
        Employee optional =
            Optional.ofNullable(employee).orElse(new
            Employee(1, "JCole", 30, 6666));
    ```

**8. Why finally always be executed ?**
+ ensures that the finally block is executed even if an unexpected exception occurs.


**9. What is Java 8 new features ?**
+ Default method and static method in interface
+ Lambda & Functional Interface
+ Optional
+ Method reference
+ Java Stream API for Bulk Data Operations on Collections.
+ forEach() method in Iterable interface.

**10. What are the types of design patterns in Java ?**

+ Relationships Between Classes 
  + Is a - Inheritance 
  + Part-of : Composition(e.g. 4 Wheels --> Car)
  + Has-a : Aggregation(e.g. Car --> 4 wheels
 <img width="767" alt="image" src="https://user-images.githubusercontent.com/92887232/214722615-f3a083d4-b6f3-4231-992a-8a36efb3b824.png">



**11. What are the SOLID Principles ?**
+ S: Single responsibility principle.
+ O: Open-closed principle.
+ L: Liskov substitution principle.
+ I: Interface segregation principle.
+ D: Dependency inversion principle.

**12.How can you achieve thread-safe singleton patterns in Java ?**

Steps:
+ static volatile variable
+ make constructor be private
+ static synchronized getInstance method
+ make sure thread safe
    ```java
    public class Singleton {
    // 1, private static variable
    private static Singleton instance = new Singleton();
    // 2, make constructor be private
     // 保证不能new， ⼀旦可以new, 就可以建造很多instance， 则就不再是singleton。
    private Singleton() {
     }
    // 3. static getInstance method
     // static保证在没有instance的情况下，可以调该⽅法。
    public static Singleton getInstance() {
    return instance;
     }
    }
    ```

**13. What do you understand by the Open-Closed Principle (OCP)**
+ Open for Extension, Closed for Modification

**14.Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
substituted with any object of type B**
+ It means If a method is present in class A, It should also be present in class B so that the object of type B could substitute object of type.

**15.Design Patten**
Watch the design pattern video, and type the code, submit it to MavenProject folder
singleton: https://www.bilibili.com/video/BV1Np4y1z7BU?p=22
Factory: https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6 d9
Builder: https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6 d9
Publisher_Subscriber: https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f 7accf859bf7f6d9
