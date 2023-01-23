1. Write up Example code to demonstrate the three fundamental concepts of OOP. (reference Code Demo
   repo as example)
    
    1. Encapsulation;
      Encapsulation is a way to restrict the direct access to some components of an object, so users cannot access state values for all of the variables of a particular object. Encapsulation can be used to hide both data members and data functions or methods associated with an instantiated class or object.
    ```
    // User Class
    class User {

        private String userName; //use private to hide data
        private String password;
        private String email;
         //public String userName; If we use public here, the data can be changed directly by others
         //public String password;
        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
            this.email = email;
        }

        public void login(String userName, String password) {

            if (this.userName.toLowerCase().equals(userName.toLowerCase()) && this.password.equals(password) && this.email.equals(email)) {
                

                System.out.println("Access Granted against the username: "+this.userName +" and password: "+this.password + " and email: " + this.email);
            } else {
                System.out.println("Invalid Credentials!");
            }
        }
    }
    
    public class Encapsulation {
       public static void main(String[] args) {
           User user = new User("Tom","123","Tom@gmail.com"); 
   
           user.login("Tom","123","Tom@gmail.com"); 
   
           user.login("Tom", "34"); 
   
           user.login("Tom","123","Jack@gmail.com");
    }
    ```   
   2. Polymorphism;

      In Java, polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method. To put it simply, polymorphism in Java allows us to perform the same action in many different ways.

      ```
       class Animal {
          public void animalSound() {
            System.out.println("Animal sound");
          }
       }

       class Wolf extends Animal {
           public void animalSound() {
                System.out.println("Wolf make some sound");
           }
       }
    
       class Dog extends Animal {
           public void animalSound() {
               System.out.println("Dog make some sound");
           }
       }

       class Main {
           public static void main(String[] args) {
               Animal myAnimal = new Animal();  // Create a Animal object
               Animal myWolf = new Wolf();  // Create a Wolf object
               Animal myDog = new Dog();  // Create a Dog object
               myAnimal.animalSound();
               myWolf.animalSound();
               myDog.animalSound();
           }
       }

       ```
   3. Inheritance;
      In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

       subclass (child) - the class that inherits from another class
   
       superclass (parent) - the class being inherited from
       To inherit from a class, use the extends keyword.

       ```
       class Vehicle {
            protected String brand = "Ford";
            public void honk() {
               System.out.println("Tuut, tuut!");
            }
       }
      

       class Car extends Vehicle {
            private String modelName = "Mustang";
            public static void main(String[] args) {
                Car myFastCar = new Car();
                myFastCar.honk();
                System.out.println(myFastCar.brand + " " + myFastCar.modelName);
            }
       }


       ```

2. What is wrapper class in Java and Why we need wrapper class?

   Wrapper classes are fundamental in Java because they help a Java program be completely object-oriented. The primitive data types in java are not objects, by default. They need to be converted into objects using wrapper classes.
   
    Wrapper classes in Java are beneficial for situations where the program demands working with an object instead of a primitive data type. In that sense, wrapper classes help the Java program be 100% object-oriented.


3. What is the difference between HashMap and HashTable?

   HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value. HashMap is generally preferred over HashTable if thread synchronization is not needed.
        

4. What is String pool in Java and why we need String pool?

   String Pool in Java is a special storage space in Java Heap memory where string literals are stored. It is also known by the names - String Constant Pool or String Intern Pool. Whenever a string literal is created, the JVM first checks the String Constant Pool before creating a new String object corresponding to it.
    It can help save memory.
    

5. What is Java garbage collection?

   Garbage collection in java is the process of looking
   at heap memory, identifying which objects are in use and
   which are not and deleting the unused objects. An unused
   object or unreferenced object, is no longer referenced by
   any part of your program.
                

6. What are access modifiers and their scopes in Java?

    Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.
    

7. What is final key word? (Filed, Method, Class)

   Java final keyword is a non-access specifier that is used to restrict a class, variable, and method. If we initialize a variable with the final keyword, then we cannot modify its value.
   If we declare a method as final, then it cannot be overridden by any subclasses. And, if we declare a class as final, we restrict the other classes to inherit or extend it.
   In other words, the final classes can not be inherited by other classes.
    

    1. Final Variable in Java 
   
       Once we declare a variable with the final keyword, we can’t change its value again. If we attempt to change the value of the final variable, then we will get a compilation error.
    2. Final Method in Java
       
       The Method with Final Keyword cannot be overridden in the subclasses. The purpose of the Final Method is to declare methods of how’s definition can not be changed by a child or subclass that extends it.
    3. Final Class in Java
       
       When we declare a class as final, then we restrict other classes to inherit or extend it. Java final class can’t be extended by other classes in the inheritance. If another class attempts to extend the final class, then there will be a compilation error.
        

8. What is static keyword? (Filed, Method, Class). When do we usually use it? 
   
   The static filed can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc. The static variable gets memory only once in the class area at the time of class loading.

    The static keyword in Java can be applied to both fields and methods of a class. A field or method of a class that is static can be accessed without an instance of the class.   

   A static method is a method that belongs to a class rather than an instance of a class. This means you can call a static method without creating an object of the class. Static methods are sometimes called class methods.  
    

9. What is the differences between overriding and overloading?

   Overriding occurs when the method signature is the same in the superclass and the child class. (run time) The compiler does not know whether the parent method or the subclass method is called. Only when the compiler is running can it know which party is called.
    Overloading occurs when two or more methods in the same class have the same name but different parameters. (compile time) Because the compiler determines which method to call based on the parameter type and length.
    

10. What is the differences between super and this?

    In java, super keyword is used to access methods of the parent class while this is used to access methods of the current class. this keyword is a reserved keyword in java i.e, we can't use it as an identifier
    this will call another constructor in the same class whereas super() will call a super constructor.
    

11. What is the Java load sequence?

    The order in which the class loading mechanism loads classes and interfaces into the Java Virtual Machine is referred to as the load sequence (JVM).
    

12. What is Polymorphism ? And how Java implements it ?
    In Java, polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method.
    Polymorphism in Java via two different methods: Method Overloading and Method Overriding.
    

13. What is Encapsulation ? How Java implements it? And why we need encapsulation?

    Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to the bundling of fields and methods inside a single class. It prevents outer classes from accessing and changing fields and methods of a class.
    Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
    Encapsulation improvises the procedure of coding to a whole new level. We need encapsulation in Java for better control, getter and setter methods, security and flexibility.
    

14. What is Interface and what is abstract class? What are the differences between them?

    Interfaces are a kind of code contract, which must be implemented by a concrete class.
    Abstract classes are similar to normal classes, with the difference that they can include abstract methods, which are methods without a body. Abstract classes cannot be instantiated.
    Abstract classes should be used primarily for objects that are closely related, whereas interfaces are best suited for providing a common functionality to unrelated classes.
    

15. (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )
    1. If you have no ability to design it, please find the solution in internet, then understand it, and re-type
       it.(Do NOT just copy and paste)

        Please see codes in codingQuestions/coding1.
    

16. What are Queue interface implementations and what are the differences and when to use what?

    The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle. The most common classes are the PriorityQueue, PriorityBlockingQueue and LinkedList in Java.
    

        PriorityQueue: It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.

        PriorityBlockingQueue: It is to be noted that both the implementations, the PriorityQueue and LinkedList are not thread-safe.

        LinkedList: It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part.