
1. What is generic in Java? and type the generic code by yourself.
   a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic/generic\
   Generics means parameterized types. Java has generic methods, generic classes.\
   Code can be found in codingQuestions/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic
2. Read those codes and type it one by one by yourself. the push the code to your branch.
   https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8\
    Code can be found in codingQuestions/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8/features/stream_api
3. practice stream API at least 3 times
   a. https://blog.devgenius.io/15-practical-exercises-help-you-master-java- stream-api-3f9c86b1cf82
4. Write the Singleton design pattern include eager load and lazy load.
    ```java
   public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();
    private EagerInitialization(){}

    public EagerInitialization getInstance(){
        return instance;
    }
}
   ```java
   public class LazyInitialization {
    private static LazyInitialization instance;
    private LazyInitialization(){}

    public LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
}

   ```
5. What is Runtime Exception? could you give me some examples?\
   The Runtime Exception is the parent class in all exceptions of the Java programming language that are expected to crash or break down the program or application when they occur.\
Example: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException.
6. Could you give me one example of NullPointerException?\
When you get an object and wants to use it's method, but the object is null.
```java
    public class StudentRepo{
        public Student getStudent(){
            return null;
        }
    }
```
```java
    public class Example{
        public static void Main(){
            StudentRepo repo = new StudentRepo();
            Student student = studentRepo.getStudent("111");
            System.out.printf(student.getName());
        }
    }
```
7. What is the Optional class?\
   Optional is a container object used to contain not-null objects. Optional object is used to represent null with absent value.
8. What is the @FunctionalInterface? \
An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface. It helps compiler to do sanity check.
9. what is lamda?\
   A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
10. What is Method Reference?\
    Method references are a special type of lambda expressions.
11. What is Java 8 new features?
    1. stream api
    2. lambda function
    3. functional interface
    4. interface default and static methods
    5. Optional
    6. method reference
12. Lambda can use unchanged variable outside of lambda? what is the details?\
    Inside lambda expression, we can't assign any value to some local variable declared outside the lambda expression. Because the local variables declared outside the lambda expression can be final or effectively final.\
    Effectively final means after initialization the value will never change.\
