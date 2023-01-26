1.  Practice  collection
2.  What is the checked exception and unchecked exception in Java, could you give one example?

    In Java, checked exceptions are exceptions that must be handled or specified in a throws clause at compile time. Unchecked exceptions do not need to be handled or specified and occur during runtime, an example is NullPointerException. An example of a checked exception is IOException, which is related to input/output operations.

3.  Can there be multiple finally blocks?

    Yes

4.  When both catch and finally return values, what will be the final result?

    When both catch and finally return values, the finally block will always execute last and the returned value from the finally block will be the final result.

5.  What is Runtime/unchecked exception? what is Compile/Checked Exception?

    Runtime/unchecked exceptions happen during program execution and don't need to be checked at compile time, while compile/checked exceptions are checked at compile time and must be handled or specified in the method.

6.  What is the difference between throw and throws?

    In Java, the 'throw' keyword is used to explicitly raise an exception within the code, while the 'throws' keyword is included in the method signature to indicate that the method may generate a specific exception. The 'throw' statement is utilized within the method to throw an exception, and the 'throws' clause is included in the method signature to indicate that the method may generate an exception.

7.  Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime 
exception before Exception ?

    ```java:
    public class Main {
        public static void main(String[] args) {
            int a = 0;
            int b = 3
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

    Catch blocks are executed in the order they appear, so it's important to put more specific exception types before the more general exception types. By putting the NullPointerException and RuntimeException catch blocks before the Exception catch block, specific exception types will be caught and handled before the more general Exception catch block is executed, allowing for more appropriate handling of specific exceptions.

7.  What is optional? why do you use it? write an optional example. 

    An Optional in Java is a container that can either hold a value or be empty. It is meant to express the presence or absence of a value, instead of using null values. By using Optional, it can help prevent errors caused by null values and make the code more easily understood.

8.  Why finally always be executed ?

    The finally block in Java is executed in all cases, whether an exception is thrown or not, since it is used to clean up resources such as file or database connections. It is important to ensure these resources are closed even when an exception occurs.

9.  What is Java 8 new features ?

    Lambda expressions and functional interfaces
    The Stream API for working with collections of data
    The Date and Time API
    The Optional class

10.  What are the types of design patterns in Java ?

    Singleton pattern
    Factory pattern
    Observer pattern
    Decorator pattern

11.  What are the SOLID Principles ?

    Single Responsibility Principle (SRP)
    Open-Closed Principle (OCP)
    Liskov Substitution Principle (LSP)
    Interface Segregation Principle (ISP)
    Dependency Inversion Principle (DIP)

12.  How can you achieve thread-safe singleton patterns in Java ?

    To create a thread-safe singleton pattern in Java, one can use the double-checked locking technique. This method only creates and initializes the singleton instance when it is required and stores it in a volatile variable to make sure that all threads have access to the same instance.

13.  What do you understand by the Open-Closed Principle (OCP) ?
        
    The Open-Closed Principle (OCP) suggests that a class should be able to be extended without making any changes to its source code. Classes should be flexible enough to be adapted to new requirements while keeping the existing code intact. This is achieved by using techniques like polymorphism, interfaces, and inheritance.

14.  Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be 
substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
* It mean that if the object of type A can do something, the object of type B could also be able tp 
    perform the same thing
* It means that all the objects of type A could execute all the methods present in its subtype B
* It means if a method is present in class A, it should also be present in class B so that the object of 
    type B could substitute object of type A.
* It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

    The correct one is "It means that if the object of type A can do something, the object of type B could also be able to perform the same thing."

15.  Watch the design pattern video, and type the code, submit it to MavenProject folder
   singleton: https://www.bilibili.com/video/BV1Np4y1z7BU?p=22
   Factory: https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6
d9
   Builder: https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6
d9
   Publisher_Subscriber: https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f
7accf859bf7f6d9