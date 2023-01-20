### 1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)

- Encapsulation  
``` 
    class Student {  
        private int Student_Id;
        private String name;
        //getters, setters for Student_Id and name fields.
        public int getId() {
            return Student_Id;
        }
        public void setId(int s_id) {
            this.Student_Id = s_id;
        }
        public String getname() {
            return name;
        }
        public void setname(String s_name) {
            this.name = s_name;
        }
    }

    class Main {
        public static void main (String[] args){
            Student s = new Student();
            s.setId(36);
            s.setName("Xukun Cai");
        }
    }
```

- Inheritance
```
    class Bird {
        protected int numOfWings = 2;
        protected boolean canFly = true;

        public void Fly(){
            System.out.println("Let's fly!")
        }

    }

    class Eagle extends Bird {
        private boolean isPrey = true;
        private int speed = 120;

        public int getSpeed(){
            return speed;
        }

        public void accelerate(){
            speed += 10;
        }

    }
```

- polymorphism 
```
    class Shape {
        public void area() {
            System.out.println("Find area ");
        }
        public void area(int r) {
            System.out.println("Circle area = "+3.14*r*r);
        }

        public void area(int width, int height, int t = 0) {
            if (t==0) {
                System.out.println("Rectangle area = "+width*height);
            } else {
                System.out.println("Triangle area = "+(int)(0.5*width*height));
            }
        }

        public void draw() {
            System.out.println("Drawing a shape");
        }
    }

    class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    class Square extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a square");
        }
    }


```


### 2. What is wrapper class in Java and Why we need wrapper class?  
- A Wrapper class is a class which contains the primitive data types (int, char, short, byte, etc). In other words, wrapper classes provide a way to use **primitive data types (int, char, short, byte, etc)** as objects. These wrapper classes come under java.util package.  


- Why we need wrapper class:
    - Wrapper Class will **convert primitive data types into objects.** The objects are necessary if we wish to modify the arguments passed into the method (because primitive types are passed by value).  

    - To bind the values of different primitive data types into objects. This helps in performing complex operations and working with collections like HashMap, ArrayList, etc.

    - Since primitive data types can’t be given a null value, but wrapper classes can, they also act as a workaround for assigning a null value to any primitive data type.

### 3. What is the difference between HashMap and HashTable?
| HashMap      | HashTable |
| ----------- | ----------- |
| No method is synchronized.    | Every method is synchronized.|
| Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe. | At a time only one thread is allowed to operate the Hashtable’s object. Hence it is thread-safe.    |
| Threads are not required to wait and hence relatively performance is high. | It increases the waiting time of the thread and hence performance is low.|
| Null is allowed for both key and value.| Null is not allowed for both key and value. Otherwise, we will get a null pointer exception.   |

### 4. What is String pool in Java and why we need String pool? 
> String Pool in Java is a special storage space in Java Heap memory where string literals are stored.

> When we create a string literal, the JVM first check that literal in the String pool. If the literal is already present in the pool, it returns a reference to the pooled instance. If the literal is not present in the pool, a new String object takes place in the String pool.

> We need string pool to get better performance and save more memory in many cases. 


### 5. What is Java garbage collection?
> Garbage collection in Java is the automated process of deleting code that’s no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers.  

> Java applications are compiled into bytecode that may be executed by a JVM. Objects are produced on the heap (the memory space used for dynamic allocation), which are then monitored and tracked by garbage collection operations. Most objects used in Java code are short-lived and can be reclaimed shortly after they are created. The garbage collector uses a mark-and-sweep algorithm to mark all unreachable objects as garbage collection, then scans through live objects to find objects that are still reachable.


### 6. What are access modifiers and their scopes in Java?
> Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private

Access Modifiers' scopes:   

| Access Modifier     | within class | within package| outside package by subclass only  | outside package|
| ----------- | ----------- | ----------- | ----------- | ----------- |
| private | YES | NO | NO | NO |
| default   | YES  | YES | NO | NO |
| protected | YES| YES | YES | NO |
| public | YES | YES | YES | YES |

### 7. What is final key word? (Field, Method, Class)
> The final key word in Java is used to restrict the user.
- Field  

    If we make any field as final, it will be constant, we cannot change the value of final field (variable).
- Method  

    If we make any method as final, it cannot be overriden.
- Class

    If we make any class as final, it cannot be inherited, the class will be immutable.


### 8. What is static keyword? (Field, Method, Class). When do we usually use it?
>The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.

- Field  
    When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.

    Use the static variable for the property that is common to all objects.
- Method  

    Methods declared as static have several restrictions: 

    - They can only directly call other static methods.
    - They can only directly access static data.
    - They cannot refer to this or super in any way.

    Use static methods for changing static variables.

- Class  
    A class can be made static only if it is a nested class. We cannot declare a top-level class with a static modifier but can declare nested classes as static. Such types of classes are called Nested static classes. Nested static class doesn’t need a reference of Outer class. In this case, a static class cannot access non-static members of the Outer class. 

    Using the static class is a way of grouping classes together. It is also used to access the primitive member of the enclosing class through the object reference. 



### 9. What is the differences between overriding and overloading?
| Overriding      | Overloading |
| ----------- | ----------- |
| Implements “runtime polymorphism”     | Implements “compile time polymorphism” |
| The method call is determined at runtime based on the object type   | The method call is determined at compile time        |
| Occurs between superclass and subclass | Occurs between the methods in the same class|
| Have the same signature (name and method arguments) | Have the same name, but the parameters are different   |

### 10.  What is the differences between super and this?
| this     | super|
| ----------- | ----------- |
| this keyword mainly represents the current instance of a class.    | super keyword represents the current instance of a parent class.|
| this keyword used to call default constructor of the same class.   | super keyword used to call default constructor of the parent class.   |
| this keyword used to access methods of the current class as it has reference of current class.| One can access the method of parent class with the help of super keyword.|
| this keyword can be referred from static context i.e can be invoked from static instance. For instance we can write **System.out.println(this.x)**， which will print value of x without any compilation or runtime error. | On other hand super keyword can't be referred from static context i.e can't be invoked from static instance. For instance we cannot write **System.out.println(super.x)**， this will leads to compile time error.  |

### 11. What is the Java load sequence?
> The Java load sequence is the order in which the JVM loads and initializes the parts of a Java program, starting with class files, linking, initializing variables and static blocks, and ending with the main method starting execution.

### 12. What is Polymorphism? And how Java implements it?
- Polymorphism in Java is the phenomenon by which an object can acquire an ability to operate from different perspectives.

- Polymorphism in Java is mainly divided into two types.
    - Compile-time polymorphism
    - Runtime polymorphism    

    Compile-time polymorphism can be achieved by method overloading, and Runtime polymorphism can be achieved by method overriding. 

### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation? 
- Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit. In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.

- Java achieves encapsulation implementation by making all the data members private and then providing getter and setter methods that are public so that we can read the values of the private variables and set new values for these variables.

- To hide the data. Or in other words, to decide about the access given to data as to who can access it, and who cannot.

### 14. What is Interface and what is abstract class? What are the differences between them?
- Abstract classes are similar to normal classes, with the difference that they can include abstract methods, which are methods without a body. Abstract classes cannot be instantiated.



- Interfaces are a kind of code contract, which must be implemented by a concrete class.

| Interface     | Abstract Class |
| ----------- | ----------- |
| Interface can have only abstract methods | An abstract class can have abstract and non-abstract methods.|
| Abstract class can have final, non-final, static and non-static variables.  | The interface has only static and final variables. |
| Interface can't provide the implementation of abstract class.| Abstract class can provide the implementation of interface.|
| An interface can be implemented using keyword "implements". | An abstract class can be extended using keyword "extends".  |
| Interface supports multiple inheritance.| Abstract class doesn't support multiple inheritance.|

### 16. What are Queue interface implementations and what are the differences and when to use what? 
- As the Queue is an interface, it cannot be instantiated. We need some concrete classes to implement the functionality of the Queue interface. Two classes implement the Queue interface i.e. LinkedList and PriorityQueue.  

- The difference between PriorityQueue and Linkedlist is at the time of insertion PriorityQueue will be sorted as well as ordered as per the natural order but we can add a Commparator also in order to define the particular order of sorting for a record, while as LinkedList will be just ordered by the order of insertion.

