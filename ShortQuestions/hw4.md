2.  What is the checked exception and unchecked exception in Java, could you give one example?
* A checked exception is caught at compile time whereas a runtime or unchecked exception is, as it states, at runtime. A checked exception must be handled either by re-throwing or with a try catch block, whereas an unchecked isn't required to be handled.
* Example for unchecked exception : Divide a number by 0, Java will throw ArithmeticException
  ```
  private static void divideByZero() {
  int numerator = 1;
  int denominator = 0;
  int result = numerator / denominator; }
  ```
* Example for checked exception:
   ```
  private static void checkedExceptionWithThrows() throws FileNotFoundException {
  File file = new File("not_existing_file.txt");
  FileInputStream stream = new FileInputStream(file);}
  ```
3. Can there be multiple finally blocks?
* There can only be one finally block, and it must follow the catch blocks. If the try block exits normally (no exceptions occurred), then control goes directly to the finally block. After the finally block is executed, the statements following it get control.

4. When both catch and finally return values, what will be the final result?
* If both catch and finally return, the receiving method will get the returned value from the finally block.

5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
* I think this question has the same answer as question 1
6. What is the difference between throw and throws?
* Both throw and throws are concepts of exception handling in Java. The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

7. why do we put the Null/Runtime exception before Exception
* Because Exception is larger than Null/Runtime exception. If we use small scape exception first we will know which part is wrong specific.
7. What is optional? why do you use it? write an optional example.
* Optional is generally used as a return type for methods that might not always have a result to return. For example, a method that looks up a user by ID might not find a match, in which case it would return an empty Optional. Optional can help to reduce the number of null pointer exceptions in your code.
8. Why finally always be executed?
* Finally will be executed whether or not the exception is handled.
* Finally will still be executed if there is a return statement in the catch clause.
9. What is Java 8 new features ?
* Default method and static method in interface
* Lambda & Functional Interface
* Method reference
* Stream API
10. What are the types of design patterns in Java
    Relationships Between Classes

* Is a - Inheritance
* Part-of : Composition(e.g. 4 Wheels --> Car)
* Has-a : Aggregation(e.g. Car --> 4 wheels
11. What are the SOLID Principles
* Single Responsibility
* Open/Closed
* Liskov Substitution
* Interface Segregation
* Dependency Inversion
12. How can you achieve thread-safe singleton patterns in Java ?
* Create the private constructor to avoid any new object creation with new operator.
* Declare a private static instance of the same class.
* Provide a public static method that will return the singleton class instance variable.
13. What do you understand by the Open-Closed Principle (OCP) ?
* In object-oriented programming, the open–closed principle (OCP) states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.
14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B
* It means If a method is present in class A, It should also be present in class B so that the object of type B could substitute object of type.che