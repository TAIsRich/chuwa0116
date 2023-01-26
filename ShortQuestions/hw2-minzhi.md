1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)

Three concepts are encapsulation, polymorphism, and inheritance

- encapsulation

```java
public class Student{
  private String id;
  private String name;
  
  public String getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  
  public void setId(String i){
    id = i;
  }
  public void setName(String n){
    name = n;
  }
}
```

- polymorphism

```java
public class Person{
  public void pri(){
    System.out.println('This is a person');
  }
}

public class Student extends People{
  @override
  public void pri(){
    System.out.println('This is a student');
  }
}

public class Test{
  public static void main(){
    Person p = new People();
    Person s = new Student();

    p.pri(); \\ 'This is a person'
    s.pri(); \\ 'This is a student'
  }
}
```

- inheritance

```java
public class Person{
  private String name;
  
  public String getName(){
    return name;
  }

  public void setName(String n){
    name = n;
  }
}

public class Student extends Person{
  private String id;
  
  public String getId(){
    return id;
  }
  
  public void setId(String i){
    id = i;
  }	
}
```

2. What is wrapper class in Java and Why we need wrapper class?

A wrapper class converts java primitives into objects. So a primitive wrapper class is a wrapper class that encapsulates, hides or wraps data types from the eight primitive data types so that these can be used to create instantiated objects with methods in another class or in other classes.

3. What is the difference between HashMap and HashTable?

- A HashMap allows the existence of null keys and values, while a Hashtable does not allow neither null keys, nor null values.
- A Hashtable is synchronized, while a HashMap is not. Thus, HashMap is preferred in single-threaded environments, while a Hashtable is suitable for multi-threaded environments.
- A HashMap provides its set of keys and a Java application can iterate over them. Thus, a HashMap is fail-fast. On the other hand, a Hashtable provides an Enumeration of its keys.

4. What is String pool in Java and why we need String pool?

String Pool in java is a pool of Strings stored in Java Heap Memory. String pool helps in saving a lot of space for Java Runtime although it takes more time to create the String.

5. What is Java garbage collection?

Automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects.

6. What are access modifiers and their scopes in Java?

Access modifiers in Java help to restrict the scope of a class, constructor, variable, method, or data member. There are four types of Access modifiers:

- Public – accessible from everywhere in the application
- Protected – accessible within the package and the subclasses in any package
- Package Private (Default) – accessible strictly within the package
- Private – accessible only within the same class where it is declared

7. What is final key word? (Filed, Method, Class)

- Final class: prevent inheritant, make class immutable
- Final methods: prevent methods overriding
- Final variable: create constant variable

8. What is static keyword? (Filed, Method, Class). When do we usually use it?

- Static blocks: If you need to do the computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded.
- Static variables: When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.
- Static methods: Any static member can be accessed before any objects of its class are created, and without reference to any object.
- Static class: A class can be made static only if it is a nested class. Nested static class doesn’t need a reference of Outer class. In this case, a static class cannot access non-static members of the Outer class.

9. What is the differences between overriding and overloading?

Method Overloading:

- Overloading happens at compile time.
- Gives better performance because the binding is being done at compile time.
- Private and final methods can be overloaded.
- Return type of method does not matter in case of method overloading.
- Arguments must be different in the case of overloading.
- It is being done in the same class.

Method Overriding:

- Overriding happens at runtime.
- Gives less performance because the binding is being done at run time.
- Private and final methods can NOT be overridden.
- Return type of method must be the same in the case of overriding.
- Arguments must be the same in the case of overriding.

10. What is the differences between super and this?

In java, super keyword is used to access methods of the parent class while this is used to access methods of the current class.

11. What is the Java load sequence?

static variables and blocks in super class -> static variables and blocks in subclass -> common code blocks and variables in superclass -> superclass's constructor -> common code blocks and variables in subclass -> subclass's constructor

12. What is Polymorphism ? And how Java implements it?

Polymorphism is the ability of programming languages to present the same interface for differing underlying data types. A polymorphic type is a type whose operations can also be applied to values of some other type.

There are two types of Polymorphism in Java:

- Compile-time polymorphism (Static binding) – Method overloading
- Runtime polymorphism (Dynamic binding) – Method overriding

13. What is Encapsulation ? How Java implements it? And why we need encapsulation?

Encapsulation provides objects with the ability to hide their internal characteristics and behavior. Each object provides a number of methods, which can be accessed by other objects and change its internal data.

Some of the advantages of using encapsulation are listed below:

- It improves modularity by preventing objects to interact with each other, in an undesired way.
- The internal state of every object is protected by hiding its attributes.

14. What is Interface and what is abstract class? What are the differences between them?

An abstract class in Java is one that is declared with the abstract keyword. It may have both abstract and non-abstract methods(methods with bodies).

An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.

Differences:

- All methods in an interface are implicitly abstract. On the other hand, an abstract class may contain both abstract and non-abstract methods.
- A class may implement a number of Interfaces but can extend only one abstract class.
- In order for a class to implement an interface, it must implement all its declared methods.
- Abstract classes can implement interfaces without even providing the implementation of interface methods.
- Variables declared in a Java interface is by default final. An abstract class may contain non-final variables.

15. (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder)

16. What are Queue interface implementations and what are the differences and when to use what?

Two classes implement the Queue interface i.e. LinkedList and PriorityQueue. So if we want to preserve the insertion order, we can use LinkedList. If we want to sort the orders, we can use PriorityQueue with Commparator.
