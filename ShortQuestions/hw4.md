**1.Practice collection**
```
See in Coding Folder's Collection Folder
```

**2.What is the checked exception and unchecked exception in Java, could you give one example?**
+ Checked exception means the exception will be checked while compiling : FileNotFound
+ UncheckedException means the exception will be check during processing : NullPointerException

**3.  Can there be multiple finally blocks**
+ No

**4.When both catch and finally return values, what will be the final result?**
+ finally will be the final result.

**5. What is Runtime/unchecked exception? what is Compile/Checked Exception? ?**
+ Compile/Checked exception means the exception will be checked while compiling : FileNotFound
+ Runtime/UncheckedException means the exception will be check during processing : NullPointerException

**6. What is the difference between throw and throws**
+ The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

**7.  Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
exception before Exception ?**
+ Because Exception is larger than Null/Runtime exception. If we use small scape exception first we will know which part is wrong specific.

**7. What is optional? why do you use it? write an optional example**
+ Optional is used to avoid Null checks and run time NullPointerExceptions
```java
    Employee optional =
        Optional.ofNullable(employee).orElse(new
        Employee(1, "JCole", 30, 6666));
```

**8. Why finally always be executed ?**
+ finally will be executed whether or not the exception is handled.
+ finally will still be executed if there is a return statement in the catch clause.


**9. What is Java 8 new features ?**
+ Default method and static method in interface
+ Lambda & Functional Interface
+ Method reference
+ Stream API

**10. What are the types of design patterns in Java ?**

Relationships Between Classes 
+ Is a - Inheritance 
+ Part-of : Composition(e.g. 4 Wheels --> Car)
+ Has-a : Aggregation(e.g. Car --> 4 wheels


**11. What are the SOLID Principles ?**
+ Single Responsibility
+ Open/Closed 
+ Liskov Substitution 
+ Interface Segregation 
+ Dependency Inversion

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
+ See code in MavenProject folder
