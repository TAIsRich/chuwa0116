5.  What is Runtime Exception? could you give me some examples?
> Runtime - runtime exceptions are internal to your application but are not typically recoverable. For example, an object that is expected to have a value but is actually null. In this case, a NullPointerException exception would be thrown.
6. Could you give me one example of NullPointerException?
> NullPointerException is a runtime exception and it is thrown when the application try to use an object reference which has a null value. Eg:
``` 
public class Tester {
public static void main(String[] args) {
Object ref = null;
ref.toString(); // this will throw a NullPointerException
}}
```
7. What is the Optional class?
>The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values. The class was introduced in the java. util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.
Eg:
```
public class OptionalDemo {
public static void main(String[] args)
{
    String[] words = new String[10];
    Optional<String> checkNull= Optional.ofNullable(words[5]);
    if (checkNull.isPresent()) {
        String word = words[5].toLowerCase();
        System.out.print(word);
        }
    else
        System.out.println("word is null");
        }
}
```
8.  What is the @FunctionalInterface?
> An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, static methods but can contain only one abstract method. It can also declare methods of object class. Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. It's for sanity check and lambda is the implememtation of the abstract method.
9.  what is lambda?
> A lambda is a short block of code which takes in parameters and returns a value. It provide a clear and concise way to replace anonyous inner class and work with funtional interface.
10. What is Method Reference?
> Method reference is a new feature of Java 8, a short and easily readable writing syntax for a lambda expression.
11. What is Java 8 new features?
> Permanent Generation.
> Parallel Array Sorting.
> Base64 encoding and decoding.
> Date & Time API.
> Functional Interfaces.
> Lambda expressions.
12. Lambda can use unchanged variable outside of lambda? what is the details?
>Final variable
>Non-final variable however never changed
>Object variable (if we use new to reassign a new memory, then this variable is
changed, can not be used in lambda)