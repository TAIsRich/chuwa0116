1.  What is generic in Java?

        Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

2. Please see codes in coding.

3. Please see codes in coding.

4.  Write the Singleton design pattern include eager load and lazy load. 

        Eager load
        ```
        public class Singleton {
                private static Singleton instance = new Singleton();
                private Singleton() {

                }
                public static Singleton getInstance() {
                        return instance;
                }
        }
        ```
        Lazy load
        ```
        public class Singleton {
                private static volatile Singleton instance;
                private Singleton(){};
                public static Singleton getInstance() {
                        if (instance == null) { //外层的null是为了提高performance
                                synchronized (Singleton.class) {
                                        if (instance == null) {
                                                instance = new Singleton(); //里面的null是为了singleton
                                        }
                                }
                        }
                        return instance;
                }
        }
        ```

5.  What is Runtime Exception? could you give me some examples?

        RuntimeException is the superclass of all classes that exceptions are thrown during the normal operation of the Java VM (Virtual Machine).  The RuntimeException and its subclasses are unchecked exceptions. The most common exceptions are NullPointerException, ArrayIndexOutOfBoundsException, ClassCastException, InvalidArgumentException etc.

6.  Could you give me one example of NullPointerException?

        ```
        public class test{
                List<Integer> test = new ArrayList<>();
                test.get(0);//will case NullPointerException
        }
        ```


7. What is the Optional class?

        The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values. The class was introduced in the java.util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.

8.  What is the @FunctionalInterface?

        A functional interface has exactly one abstract method (for sanity check).

9.  what is lamda?

        Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

10. What is Method Reference?

        Method reference is a new feature of Java 8, a short and easily readable writing syntax for a lambda expression. To refer to a functional interface method, use a method reference. You can replace a method reference for your lambda expression whenever you are just referring to a method with a lambda expression.

11. What is Java 8 new features?

        Default method and static method in interface
        Lambda & Functional Interface
        Optional
        Method Reference 

12. Lambda can use unchanged variable outside of lambda? what is the details?

        Lambda expressions can use variables defined in an outer scope. We refer to these lambdas as capturing lambdas. They can capture static variables, instance variables, and local variables, but only local variables must be final or effectively final.
