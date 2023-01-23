# HW2 - Hao Jia

### 1.  Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)

Encapsulation:
```agsl
public class User {

    private String name;
    private String SSN;
    private int age;

    public String getName() {
        return name;
    }

    public String getSSN() {
        return SSN;
    }

    public int getAge() {
        return age;
    }

    public User(String name, String SSN, int age) {
        this.name = name;
        this.SSN = SSN;
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
```

Inheritance:
```agsl
abstract class Animal{
    public abstract void makeSound();
}

class Dog extends Animal{
    @java.lang.Override
    public void makeSound() {
        System.out.println("Woof !");
    }
}

class Cat extends Animal{
    @java.lang.Override
    public void makeSound() {
        System.out.println("Meeow !");
    }
}
```

Polymorphism:
```agsl
public class Client {
    public static void main(String args[]){
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();

        User user1 = new User("Hao Jia", "123-456-789", 24);
        System.out.println(user1.toString());
    }
}
```

### 2.  What is wrapper class in Java and Why we need wrapper class?
Wrapper classes in Java are classes that "wrap" or encapsulate primitive data types such as int, double, and boolean, and provide them with an object-oriented interface. These classes are called Boolean, Integer, Double, etc.

We need wrapper classes for several reasons:

To use primitive data types as objects, where objects are required, such as in Collections classes like ArrayList, where only objects can be stored.

To provide additional functionality such as parse() and valueOf() methods for converting String to primitive data types.

To provide utility methods like compare(), max(), min() for comparing and manipulating primitive data types.

To provide constants like MIN_VALUE and MAX_VALUE for the corresponding primitive data types.

To provide methods like toString() for converting primitive data types to String.

In summary, Wrapper classes provide an object-oriented interface to primitive data types and provide additional functionality that is not available with primitive data types.

### 3.  What is the difference between HashMap and HashTable?
HashMap and Hashtable are both classes in Java that implement the Map interface, but

| HashMap                                     | HashTable                                |
|---------------------------------------------|------------------------------------------|
| Methods are not synchronized                | Key methods are synchronized             |
| Not thread safety                           | Thread safety                            |
| Iterator is used to iterate the values      | Enumerator is used to iterate the values |
| Allow one null key and multiple null values | Doesn't allow anything that is null      |
| Performance is higher                       | Performance is slower                    |

### 4.  What is String pool in Java and why we need String pool?
The string pool is a feature of the Java programming language that is used to optimize the storage of strings in memory. When a string is created in Java, the JVM checks the string pool to see if an identical string already exists. If it does, the JVM will simply return a reference to the existing string, rather than creating a new one. This helps to reduce the amount of memory used by the application, and also improves performance by reducing the number of objects that need to be managed by the garbage collector.

The main reason we need String pool is to save memory and improve performance. When we create a new string object using the string literal, JVM checks the string pool first. If the same string already exists in the pool, JVM will not create a new object and it will provide the reference to the existing string, so it saves memory. Also, when we use intern() method, JVM will check the string pool and returns the reference of the existing string if found otherwise it will add the new string to the pool and returns the reference.

### 5.  What is Java garbage collection?
Java garbage collection is a process by which the Java Virtual Machine (JVM) automatically manages the memory used by an application. The JVM periodically frees memory that is no longer needed by the application, by identifying and discarding objects that are no longer being used. This frees up memory for the application to use, and helps prevent the application from running out of memory. The garbage collector runs in the background and is designed to minimize the impact on the performance of the application.

### 6.  What are access modifiers and their scopes in Java?
| Modifier     | Scope                            |
|--------------|----------------------------------|
| `Default`    | within the package               |
| `Private`    | within the class                 |
| `Protected`  | within the package or subclasses |
| `Public`     | everywhere                       |



### 7.  What is final key word? (Filed, Method, Class)
| Where  | Description                                                       |
|--------|-------------------------------------------------------------------|
| Field  | the field will not be a variable any more, and will be a constant |
| Method | it cannot be overridden.                                          |
| Class  | it cannot be inherited.                                           |

### 8.  What is static keyword? (Filed, Method, Class). When do we usually use it?
| Where  | Description                                                                 |
|--------|-----------------------------------------------------------------------------|
| Field  | only one copy of the variable that is shared by all instances of the class. |
| Method | the method can be called without creating an instance of the class.         |
| Class  | a class that can only contain static members.                               |

1. Create a utility class that has only static methods.
2. When we have a variable that does not change and is common for all instances of the class.
3. When we want to use a variable or method without creating an object of the class.
4. When we have a variable or method that is used by other classes and does not depend on the state of an object.
5. When we want to use a variable or method that is independent of any object, in other words, a class level variable or method.

### 9.  What is the differences between overriding and overloading?
| Overriding                      | overloading                        |
|---------------------------------|------------------------------------|
| Method name should be the same  | Method name should be the same     |
| The argument should be the same | Different argument type            |
| Return type should be the same  | There may be different return type |

### 10.  What is the differences between super and this?
| super                                                              | this                                                                |
|--------------------------------------------------------------------|---------------------------------------------------------------------|
| refer to the immediate parent class of the current class           | refer to the current instance of an object                          |
| call methods or access fields that are defined in the parent class | call methods or access fields that are defined in the current class |
| access the parent class's constructor.                             | call another constructor within the same class.                     |

### 11.  What is the Java load sequence?
The Java load sequence refers to the order in which the Java Virtual Machine (JVM) loads various elements of a program into memory. The load sequence includes the following steps:

Loading the bootstrap class loader: The JVM loads the bootstrap class loader, which is responsible for loading the core Java libraries and other core classes that are required for the JVM to run.

Loading the extension class loader: The JVM loads the extension class loader, which is responsible for loading any additional classes that are provided as extensions to the core Java libraries.

Loading the system class loader: The JVM loads the system class loader, which is responsible for loading any additional classes that are specific to the application or system.

Loading of user defined classes: The JVM loads any user-defined classes, using the system class loader, that are required by the application.

Once all classes are loaded, the JVM will also execute any static initializer blocks, which are used to initialize static variables and perform other one-time setup tasks.

It's important to note that this sequence is not always strictly followed, and the loading order might vary depending on the way the classpath is set and the actual classes and libraries being used.

### 12.  What is Polymorphism ? And how Java implements it ?
polymorphism means many forms. A single object can refer to the super-class or sub-class depending on the reference type which is called polymorphism.
```agsl
abstract class Animal{
    public abstract void makeSound();
}

class Dog extends Animal{
    @java.lang.Override
    public void makeSound() {
        System.out.println("Woof !");
    }
}

class Cat extends Animal{
    @java.lang.Override
    public void makeSound() {
        System.out.println("Meeow !");
    }
}
```

### 13.  What is Encapsulation ? How Java implements it? And why we need encapsulation?
Encapsulation refers to the practice of hiding the implementation details of a class from other parts of the program and providing a public interface through which the class can be accessed.
```agsl
public class User {

    private String name;
    private String SSN;
    private int age;

    public String getName() {
        return name;
    }

    public String getSSN() {
        return SSN;
    }

    public int getAge() {
        return age;
    }

    public User(String name, String SSN, int age) {
        this.name = name;
        this.SSN = SSN;
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
```
1. Protects the code from others.
2. Code maintainability.
### 14.  What is Interface and what is abstract class? What are the differences between them?
| Interface                                                                                                        | abstract class                                                             |
|------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| implements                                                                                                       | extends                                                                    |
| Implement several Interfaces                                                                                     | Only one abstract class                                                    |
| The interface does not have access modifiers. Everything defined inside the interface is assumed public modifier | Abstract Class can have an access modifier                                 |
| Return type should be the same                                                                                   | There may be different return type                                         |
| Interface can have only abstract methods.                                                                        | Abstract class can have abstract and non-abstract methods                  |
| An interface cannot declare constructors or destructors.                                                         | Abstract class can declare constructors and destructors                    |
| only static and final variables.                                                                                 | Abstract class can have final, non-final, static and non-static variables. |
| Interface cannot be instantiate                                                                                  | Abstract class can be instantiate                                          |
### 15.  (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )
1.  If you have no ability to design it, please find the solution in internet, then understand it, and re-type
    it.(Do NOT just copy and paste)

### 16.  What are Queue interface implementations and what are the differences and when to use what? 
The Queue interface in Java is a data structure that holds a collection of elements in a specific order, typically in a first-in, first-out (FIFO) order. There are several implementations of the Queue interface in the Java collections framework, including:

ArrayDeque: An implementation of a double-ended queue, which means it can be used as a queue or a stack. It is implemented as a resizable array and is not thread-safe.

LinkedList: An implementation of a doubly-linked list. It supports all optional list operations, and is also an implementation of the Deque interface, which means it can be used as a queue or a stack. It is not thread-safe.

PriorityQueue: An implementation of a priority queue, which means that elements are ordered according to their natural ordering or according to a provided comparator. It is implemented as a binary heap, which provides a logarithmic time complexity for the enqueing and dequeing operations.

ConcurrentLinkedQueue: An implementation of a thread-safe, unbounded queue based on linked nodes. It does not support null elements and does not allow insertion of the same element multiple times.

ArrayBlockingQueue: An implementation of a blocking queue that is based on a resizable array. It is thread-safe and supports optional fairness policies. It is useful when multiple threads are producing and consuming elements concurrently.

The choice of which implementation to use depends on the specific requirements of your application. For example, if you need a thread-safe queue, you should use a ConcurrentLinkedQueue or ArrayBlockingQueue. If you need a priority queue, you should use a PriorityQueue. If you need a double-ended queue, you should use an ArrayDeque or a LinkedList.






